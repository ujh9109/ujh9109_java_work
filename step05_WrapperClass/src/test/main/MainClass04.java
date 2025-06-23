package test.main;

import java.io.InputStream;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		
		System.out.println("main 메소드를 실행합니다.");
		
		
		//콘솔창으로부터 입력 받을 수 있는 Scanner 객체 생성
		
		InputStream is = System.in;
		Scanner scan1 = new Scanner(is);
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		
		
		//콘솔에 입력한 문자열을 String 타입으로 얻어낸다.
		String str = scan1.nextLine();
		//실행의 흐름이 잡힘. 콘솔에 문자열을 입력하고 엔터를 해야 다음으로 넘어간다.
		//빈 문자열도 엔터로 입력할 수 있음.
		
		System.out.println("main 메소드를 종료합니다.");
		
		//int result1 = Integer.parseInt(str);
		
		
		double result2 = Double.parseDouble(str);
	}

}
