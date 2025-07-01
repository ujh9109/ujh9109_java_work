package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame2 extends JFrame implements ActionListener {
	
	
	
	public MyFrame2() {
		this.setTitle("나의 프레임");
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);//실제 구현화.
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		
		
		setLayout(layout);
		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("수정");
		JButton btn3 = new JButton("삭제");
		
		//버튼에 ActionCommand 부여하기
		btn1.setActionCommand("insert");
		btn2.setActionCommand("update");
		btn3.setActionCommand("delete");
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		
		
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new MyFrame2();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 눌렀습니다. 어떤 버튼을 눌렀을까?");
		
		//Component에 설정된 ActionCommand를 읽어온다.
		String cmd = e.getActionCommand();
		
		//java에서 문자열이 같은 지 비교할 때는 String 객체의 .equals() 메소드 사용
		if(cmd.equals("insert")) {
			System.out.println("추가합니다.");
			
		}else if(cmd.equals("update")) {
			System.out.println("수정합니다.");
		}if(cmd.equals("delete")) {
			System.out.println("삭제합니다");
		}
	}



	
}
