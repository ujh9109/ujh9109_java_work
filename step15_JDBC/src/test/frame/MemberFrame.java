package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame{
	//필요한 필드 정의하기
	JTextField inputName, inputAddr;
	String name, addr;
	
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
		JButton insertBtn = new JButton("저장");
		
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		//페널의 배경색 설정 
		panel.setBackground(Color.orange);
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		insertBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				name =inputName.getText();
				addr =inputAddr.getText();
				
				MemberDto dto = new MemberDto();
				dto.setAddr(addr);
				dto.setName(name);
				
				MemberDao dao = new MemberDao();
				boolean isSuccess= dao.insert(dto);
				if(isSuccess) {
					System.out.println("row가 추가되었습니다");
					inputName.setText("");
					inputAddr.setText("");
				}else {
					System.out.println("실패했습니다.");
				}
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame();
		f.setTitle("회원 정보");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		
		
		
	}
}