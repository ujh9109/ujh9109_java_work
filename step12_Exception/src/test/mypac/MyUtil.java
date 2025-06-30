package test.mypac;

import java.util.Random;

public class MyUtil {
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그림 완성");
		
	}
	
	public static void send() throws InterruptedException{
		System.out.println("5초 동안 전송합니다.");
		
		Thread.sleep(5000);
		
		System.out.println("전송 완료");
		
	}
	
	/*
	 * 0-9 사이의 랜덤한 정수를 콘솔에 출력하는 메소드.
	 * 우연히 7이 나오면 WowException이 발생하는 메소드.
	 * */
	public static void generate() {
		Random ran = new Random();
		int ranNum = ran.nextInt(10);
		
		if(ranNum ==7) {
			throw new WowException("Wow! 행운의 7번");
		}
		
		System.out.println(ranNum + " 숫자가 나왔습니다.");
		
	}
}
