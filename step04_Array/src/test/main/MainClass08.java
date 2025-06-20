package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {

		//String type 이 저장되어 있는 배열. 그림 모양의 문자열
		String[] data = {"🍒", "🍎", "🍌", "🍈", "7"};
		
		//위의 배열에 저장된 5개의 문자열 중에서 랜덤하게 1개만 출력되도록 해 보세요.
		Random ran = new Random();
		
		int ranNum = ran.nextInt(5);
		
		System.out.println(data[ranNum]+data[ranNum]+data[ranNum]);
		
		for(int i = 0; i<3; i++) {
			int r = ran.nextInt(data.length);
			System.out.println(data[r]);
		}
		System.out.println();
	}
	

}
