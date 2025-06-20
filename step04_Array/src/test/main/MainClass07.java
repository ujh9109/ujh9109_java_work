package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		
		int ranNum = ran.nextInt(5); //0에서부터 4 사이
		System.out.println(ranNum);
		
		int ranNum2 = ran.nextInt(10);
		System.out.println(ranNum2);
		
		int ranNum3 = ran.nextInt(10)+1;
		System.out.println(ranNum3);

	}
	

}
