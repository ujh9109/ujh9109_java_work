package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame{
	//필요한 필드 정의하기
	JTextField inputName, inputAddr;
	//표 형식으로 정보를 출력할 UI
	JTable table;
	//JTable에 출력할 data를 공급해줄 모델 객체.
	DefaultTableModel model;
	
	MemberDao dao = new MemberDao();//필드는 var 불가능
	
	
	//생성자
	public MemberFrame() {
		//레이아웃 설정
		setLayout(new BorderLayout());
		//JLable 2개
		JLabel label1=new JLabel("이름");
		JLabel label2=new JLabel("주소");
		//JTextField 1개
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		
		//JButton
		JButton deleteBtn = new JButton("삭제");
		JButton insertBtn = new JButton("저장");
		JButton updateBtn = new JButton("수정");
		
		insertBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				MemberDto dto = new MemberDto();
				dto.setAddr(inputAddr.getText());
				dto.setName(inputName.getText());
				//만약 숫자 입력칸 있었다면? inputNum
				//dto.setNum(Integer.parseInt(inputNum.getText()));
				//dao.insert에서 sql문 num MEMBER_SEQ 처리한 것도 수정.
			
				
				boolean isSuccess= dao.insert(dto);
				if(isSuccess) {
					System.out.println("row가 추가되었습니다.");
					JOptionPane.showMessageDialog(MemberFrame.this, "추가했습니다");
					pointMember();
				}else {
					System.out.println("작업을 실패했습니다.");
					JOptionPane.showMessageDialog(MemberFrame.this, "실패했습니다");

				}
				
			}
		});
		
		deleteBtn.addActionListener(e ->{
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(MemberFrame.this, "삭제할 row를 선택하세요");
				return; 
			}else {
				//삭제할 회원의 Primary Key 값(번호)를 읽어와서 db에서 삭제
				int num = (int)model.getValueAt(selectedRow, 0);//선택한 row의 0번 칼럼에 있는 data를 return
				dao.deleteByNum(num);
				this.pointMember();
			return;
			}
		});
		/*
		updateBtn.addActionListener(e ->{
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(MemberFrame.this, "수정할 row를 선택하세요");
				return; 
			}else {
				int num = (int)model.getValueAt(selectedRow, 0);
				
				MemberDto dto = new MemberDto();
				dto.setAddr(inputAddr.getText());
				dto.setName(inputName.getText());
				dto.setNum(num);
				
				dao.update(dto);
				
				pointMember();
			return;
			}
		});
		*/
		
		updateBtn.addActionListener(e ->{
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(MemberFrame.this, "수정할 row를 선택하세요");
				return; 
			}
			int num = (int)model.getValueAt(selectedRow, 0);
			MemberDto dto = dao.getByNum(num);// 수정할 회원의 전체 정보를 읽어오기
			var inputName = new JTextField(10);
			var inputAddr = new JTextField(10);
			JPanel editPanel = new JPanel();
			editPanel.add(new JLabel("이름:"));
			editPanel.add(inputName);
			editPanel.add(new JLabel("주소:"));
			editPanel.add(inputAddr);
			//dto 내용 출력
			inputName.setText(dto.getName());
			inputAddr.setText(dto.getAddr());
			
			int result = JOptionPane.showConfirmDialog(
					this, 
					editPanel, 
					num+" 번 회원 수정", 
					JOptionPane.OK_CANCEL_OPTION
			);
			
			if(result==JOptionPane.OK_OPTION) {
				MemberDto newDto = new MemberDto();
				newDto.setNum(num);
				newDto.setAddr(inputAddr.getText());
				newDto.setName(inputName.getText());
				boolean isSuccess= dao.update(newDto);
				if(isSuccess) {
					JOptionPane.showMessageDialog(this, "수정 성공");
					pointMember();
				}else {
					JOptionPane.showConfirmDialog(this, "수정 실패");
				
				}
			}
		});
		
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		panel.add(deleteBtn);
		panel.add(updateBtn);
		
		//페널의 배경색 설정 
		panel.setBackground(Color.orange);
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		//회원목록을 출력할 테이블
		table = new JTable();
		//테이블의 칼럼명을 배열로 미리 준비한다.
		String[] colNames = {"번호","이름","주소"};
		//테이블에 연결할 모델 객체
		model = new DefaultTableModel();
		//모델에 칼럼명을 전달한다.
		model.setColumnIdentifiers(colNames);
		
		//모델을 테이블에 연결
		table.setModel(model);
		//테이블의 글자 크기와 행의 높이 조절
		table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD, 18)); 
		table.setFont(new Font("Sans-serif", Font.PLAIN, 16)); // 데이터 글자 크기 14
		table.setRowHeight(25); // 각 행의 높이를 조정
		//row가 많은 경우 스크롤이 가능하도록 테이블에 scroll 기능 부여.
		JScrollPane scroll = new JScrollPane(table);
		//테이블을 품고 있는 JScrollPane을 프레임의 가운데 배치
		add(scroll, BorderLayout.CENTER);
		
		//sample data를 테이블에 출력하기.
		//Object[] row1 = {0,"sample name","sample addr"};
		//model.addRow(row1);
		
		//MemberDto 객체를 이용해서 회원목록을 얻어온 다음 실제 회원 목록을 table에 반복문 돌면서 출력해보세요.
		this.pointMember();
		
		
		
	}
	
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame();
		f.setTitle("회원 정보");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
	
	public void pointMember() {
		
		model.setRowCount(0);
		
		List<MemberDto> list = dao.selectAll();
		for(MemberDto tmp : list) {
			Object[] row = {tmp.getNum(),tmp.getName(),tmp.getAddr()};
			model.addRow(row);
		}
	}
}