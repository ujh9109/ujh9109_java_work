package test.frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	//필드 선언
	JButton countBtn;
	//버튼을 누른 횟수를 저장할 필드
	int count;
	
	//생성자
	public MyFrame() {
		setTitle("나의 프레임");
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//레이아웃 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		
		//매니저 객체 생성
		setLayout(layout);
		
		JButton countBtn = new JButton("0");
		add(countBtn);
		
		/*
		countBtn.addActionListener(e ->{
			
			count++;
			countBtn.setText(Integer.toString(count));
			System.out.println(count+"번 눌렀습니다.");
			
			 
			
		});
		
		*/
		
		
		countBtn.addActionListener(this);
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		count++;
		countBtn.setText(Integer.toString(count));
		System.out.println(count+"번 눌렀습니다");
		
		
	}

}
