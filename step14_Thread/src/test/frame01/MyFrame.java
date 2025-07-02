package test.frame01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	//생성자
	public MyFrame() {
		setTitle("스레드 테스트");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton startBtn = new JButton("작업시작");
		var startBtn2 = new JButton("작업시작2");

		//타입을 추론할 수 있을 때면, 간단하게 var로 적어도 된다.
		/*
		 * 타입 추론이 가능하다면 지역변수의 type 선언 대신 var로 선언할 수 있다.
		 * 자바 10에서 추가된 문법. 아직도 실무에서 1.8 버전을 쓰는 곳이 많기 때문에 주의!
		 * 지역변수에만 사용가능, 필드는 안됨.
		 * 인터페이스 타입 추론 불가
		 * null로 초기화 불가
		 * */
		
		
		add(startBtn);
		add(startBtn2);
		
		startBtn.addActionListener(e->{
			System.out.println("10초 걸리는 작업을 시작합니다.");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("작업이 종료 되었습니다.");
		});
		
		startBtn2.addActionListener(e->{
			new WorkThread().start();
		});
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
	
	
}
