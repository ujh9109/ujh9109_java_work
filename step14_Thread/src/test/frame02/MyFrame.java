package test.frame02;

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
			new Thread(new WorkRunnable()).start();

		});
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
	
	
}
