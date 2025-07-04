package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
import test.dao.Mydao;
import test.dto.MemberDto;
import test.dto.MyDto;

public class MyFrame extends JFrame {
	//필드 선언
	JTextField inputNum,inputName,inputTeam,inputPosition,inputIsWorldClass;
	JTable table;
	DefaultTableModel model;
	Mydao dao = new Mydao();
	
	//생성자
	public MyFrame() {
		setLayout(new BorderLayout());		
		JLabel label1 = new JLabel("이름");			
		JLabel label2 = new JLabel("팀명");			
		JLabel label3 = new JLabel("포지션");			
		JLabel label4 = new JLabel("월클여부");	
		
		inputNum = new JTextField(10);
		inputName =new JTextField(10);
		inputTeam =new JTextField(10);
		inputPosition =new JTextField(10);
		inputIsWorldClass = new JTextField(10);
		
		JButton deleteBtn = new JButton("삭제");
		JButton insertBtn = new JButton("저장");
		JButton updateBtn = new JButton("수정");
		
		insertBtn.addActionListener(e ->{
			MyDto dto = new MyDto();
			dto.setName(inputName.getText());
			dto.setTeam(inputTeam.getText());
			dto.setPosition(inputPosition.getText());
			dto.setIsWorldClass(inputIsWorldClass.getText());
			
			boolean isSuccess= dao.insert(dto);
			if(isSuccess) {
				System.out.println("row가 추가되었습니다.");
				JOptionPane.showMessageDialog(this, "추가했습니다");
				pointMember();
				inputNum.setText("");
				inputName.setText("");
				inputTeam.setText("");
				inputPosition.setText("");
				inputIsWorldClass.setText("");
				
			}else {
				System.out.println("작업을 실패했습니다.");
				JOptionPane.showMessageDialog(this, "실패했습니다");
			}
			
		});
		
		deleteBtn.addActionListener(e->{
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row를 선택하세요");
				return; 
			}else {
				int num = (int)model.getValueAt(selectedRow, 0);
				dao.deleteByNum(num);
				this.pointMember();
			return;
			}
		});
		
		updateBtn.addActionListener(e ->{
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "수정할 row를 선택하세요");
				return; 
			}
			int num = (int)model.getValueAt(selectedRow, 0);
			MyDto dto = dao.getByNum(num);
			var inputName = new JTextField(10);
			var inputPosition = new JTextField(10);
			var inputTeam = new JTextField(10);
			var inputIsWorldClass = new JTextField(10);
			
			JPanel editPanel = new JPanel();
			editPanel.add(new JLabel("이름:"));
			editPanel.add(inputName);
			editPanel.add(new JLabel("팀명:"));
			editPanel.add(inputTeam);
			editPanel.add(new JLabel("포지션:"));
			editPanel.add(inputPosition);
			editPanel.add(new JLabel("월클여부:"));
			editPanel.add(inputIsWorldClass);
			//dto 내용 출력
			inputName.setText(dto.getName());
			inputPosition.setText(dto.getPosition());
			inputTeam.setText(dto.getTeam());
			inputIsWorldClass.setText(dto.getIsWorldClass());
			
			int result = JOptionPane.showConfirmDialog(
					this, 
					editPanel, 
					num+" 번 회원 수정", 
					JOptionPane.OK_CANCEL_OPTION
			);
			
			if(result==JOptionPane.OK_OPTION) {
				MyDto newDto = new MyDto();
				newDto.setNum(num);
				newDto.setName(inputName.getText());
				newDto.setPosition(inputPosition.getText());
				newDto.setTeam(inputTeam.getText());
				newDto.setIsWorldClass(inputIsWorldClass.getText());
				boolean isSuccess= dao.update(newDto);
				if(isSuccess) {
					JOptionPane.showMessageDialog(this, "수정 성공");
					pointMember();
				}else {
					JOptionPane.showConfirmDialog(this, "수정 실패");
				
				}
			}
		});
			
		
		
		
		JPanel panel=new JPanel();
		JPanel panel2=new JPanel();
		
		
		
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputPosition);
		panel.add(label3);
		panel.add(inputTeam);
		panel.add(label4);
		panel.add(inputIsWorldClass);
		
		panel2.add(insertBtn);
		panel2.add(deleteBtn);
		panel2.add(updateBtn);
	
		panel.setBackground(Color.green);
		add(panel, BorderLayout.NORTH);
		
		panel2.setBackground(Color.blue);
		add(panel2, BorderLayout.SOUTH);
		
		
		
		
		table = new JTable();
		String[] colNames = {"번호", "이름", "포지션", "팀명", "월클여부"};
		model = new DefaultTableModel();
		model.setColumnIdentifiers(colNames);
		table.setModel(model);
		table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD, 10)); 
		table.setFont(new Font("Sans-serif", Font.PLAIN, 16)); 
		table.setRowHeight(25); 
		JScrollPane scroll = new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		
		
		Object[] row1 = {0,"name","position","team","Y"};
		model.addRow(row1);
		
		
		this.pointMember();
	}
	
	public static void main(String[] args) {
		MyFrame f=new MyFrame();
		f.setTitle("선수 정보");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public void pointMember() {
		
		model.setRowCount(0);
		
		List<MyDto> list = dao.SelectAll();
		for(MyDto tmp : list) {
			Object[] row = { 
					tmp.getNum(),
				    tmp.getName(),
				    tmp.getPosition(),
				    tmp.getTeam(),
				    tmp.getIsWorldClass()};
			model.addRow(row);
		}
	}
}
