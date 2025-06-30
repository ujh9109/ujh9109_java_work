package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나눌 수 입력: ");
		String inputNum1 = scan.nextLine();
		System.out.println("나누어 지는 수 입력: ");
		String inputNum2 = scan.nextLine();
		
		try {
			int num1 = Integer.parseInt(inputNum1);
			int num2 = Integer.parseInt(inputNum2);
			
			int result1 = num2/num1;
			int result2= num2%num1;
			
			System.out.println(num2+"를 "+num1+"으로 나눈 몫: "+result1);
			System.out.println(num2+"를 "+num1+"으로 나눈 나머지: "+result2);
			
			//어떤 예외가 발생할 지 모르는 상황이라면?
			
		}catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
			System.out.println("숫자 형식으로 입력하세요");
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("0으로 나눌수는 없습니다.");
		}
		
		System.out.println("main 메소드가 정상 종료 됩니다.");
		
	}

}