package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	
	/*
	 * Graphic User Interface를 만들 수 있는 클래스 설계하기.
	 * 
	 * 1. JFrame 상속받기.
	 * 2. 생성자에서 필요한 초기화 작업을 진행
	 * 3. main() 메소드에서 해당 클래스로 객체를 생성하면 프레임(window)가 만들어진다.
	 * */
	
	public MyFrame() {
		this.setTitle("나의 프레임");//프레임의 제목
		setBounds(100,100,500,500);//프레임의 위치와 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료버튼
		//setDefaultCloseOperation(3);
		
		setVisible(true);//실제 구현화.
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		//FlowLayout layout = new FlowLayout(1);
		//레이아웃 제스처 객체 생성
		setLayout(layout);//프레임의 레이아웃 매니저 설정
		JButton btn1 = new JButton("버튼1");//JButton 객체 생성
		JButton btn2 = new JButton("버튼1");
		JButton btn3 = new JButton("버튼1");
		JButton btn4 = new JButton("버튼4");
		add(btn1);//프레임의 add() 메소드 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치.
		add(btn2);
		add(btn3);
		add(btn4);
		setVisible(true);//구현화
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1을 눌렀습니다.");
			}//UI에 어떤 동작이 일어 났을 때, 호출될 예정인 메소드를 가지고 있는 ActionListener 객체.
		});
		
		btn2.addActionListener(e->
			System.out.println("버튼2을 눌렀습니다.")
		);
				
			
			
		
		
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼3을 눌렀습니다.");
				
			}
			
		});
		
		btn4.addActionListener(this);
		//MyFrame의 참조값을 의미.
		//MYFrame이 ActionListener 타입이 아니기 때문에 오류가 발생.
		//public class MyFrame extends JFrame implements ActionListener
		
		
		
		
		
		JTextField inputField = new JTextField(20);
		add(inputField);
		
		JButton printBtn = new JButton("출력하기");
		add(printBtn);
		
		setVisible(true);
		
		printBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String input = inputField.getText();
				System.out.println(input);
				
			}
			
		});
		
		
		
	}



	public static void main(String[] args) {
		new MyFrame();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼4를 눌렀습니다.");
	}



	
}
