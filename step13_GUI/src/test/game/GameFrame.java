package test.game;

import java.awt.event.KeyAdapter;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	
	//생성자
	public GameFrame() {
		setTitle("드래곤 플라이트");
		//부모 클래스가 JFrame 이기 때문에 JFrame. 생략 가능.
		//부모의 필드는 자기 자신의 필드처럼 쓸 수 있다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		GamePanel gPanel = new GamePanel();
		add(gPanel);
		
		pack();//GamePanel 객체가 선호하는 크기로 JFrame의 크기를 딱 맞게 조절하는 메소드.
		setResizable(false);//프레임의 크기를 고정시키기
		
		
		setVisible(true);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new GameFrame();
	}
	
}
