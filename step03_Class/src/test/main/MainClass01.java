package test.main;


import java.io.File;
import java.io.IOException;

//java.util 패키지에 있는 Random 클래스를 import
import java.util.Random;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("main 메소드가 시작됩니다.");
	
		//문자열을 다룰 때는 String type을 사용하면 된다.
		String name = "kim";
		
		//랜덤한 숫자를 얻어내고 싶다면?
		//랜덤한 숫자를 생성해주는 기능을 가진 객체가 필요함.
		Random ran = null;
		ran = new Random();
		
		
		boolean result1 = ran.nextBoolean();
		System.out.println(result1);
		
		int result2 = ran.nextInt();
		System.out.println(result2);
	
		
		//콘솔창에 문장열을 출력하고 싶다면?
		//콘솔창에 문자열을 출력해주는 기능을 가진 객체가 필요함.
		//System.out.println()
		
		
		//파일 시스템에 memo.txt 파일을 만들고 싶다면?
		//파일을 만들 수 있는 기능을 가진 객체가 필요함.
		File f = new File("C:/playground/memo.txt");
		f.createNewFile();
		
		
		//콘솔창에 입력한 숫자나 문자열을 읽어들이고 싶다면?
		//콘솔창에서 입력한 숫자나 문자열을 int 혹은 String으로 
		//만들어내는 기능을 가진 객체가 필요함.
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		
		System.out.println("main 메소드가 종료됩니다.");
	}

}
