package test.main;

import java.io.InputStream;
import java.util.Scanner;

//퀴즈
public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 콘솔창으로부터 입력 받을 수 있는 Scanner 객체를 생성해서 
		 * 그 참조값을 scan이라는 지역변수에 담아보기.
		 * 
		 * scan에 담겨있는 Scanner 객체를 2번 사용해서 콘솔창으로부터 숫자를 2개 입력 받으세요.
		 * 
		 * 입력받은 숫자(문자열)을 실제 숫자로 변경하세요.
		 * 
		 * 두 수의 값을 구해서 콘솔창에 출력해보세요.
		 * */
		
		InputStream is = System.in;
		Scanner scan1 = new Scanner(System.in);
		
		System.out.print("입력: ");
		
		String str1 = scan1.nextLine();
		
		
		
		
		
		System.out.print("입력: ");
		
		String str2 = scan1.nextLine();
		
		
		
		int result1 = Integer.parseInt(str1);
		double result2 = Double.parseDouble(str2);
		
		System.out.println(result1+result2);
		
		String data = String.format("%d + %.1f = %.1f", result1, result2, result1+result2);
		String data2 = String.format("%d * %.1f = %.1f", result1, result2, result1*result2);
		System.out.println(data);
		System.out.println(data2);
		
	}

}
