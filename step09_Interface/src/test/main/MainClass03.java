package test.main;

import javax.swing.JFrame;

//새로운 창을 띄어보기
public class MainClass03 {
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 창");
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
		
	}

}
