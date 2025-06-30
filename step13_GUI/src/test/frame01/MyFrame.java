package test.frame01;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	
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
		setVisible(true);//실제 구현화.
	}

}
