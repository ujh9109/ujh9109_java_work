package test.main;

/*
 *  1. 산술연산자 테스트
 *  
 *  +, -, *, /, %
 */

public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		
		//연산하기
		int sum = 10+1;
		int sum2 = num1 + num2;
		int sum3 = 10 + num2;
		
		//정수끼리 연산하면 결과는 정수만 나옴.
		int result1 = 5/3;
		int result2 = num1/num2;
		
		//연산의 결과로 실수 값을 얻어내고 싶으면 적어도 하나는 실수여야 한다.
		double result3 = 5/3.0;
		
		
		
		
		
		
		
		//10을 3으로 나는 나머지를 변수에 담기
		int result4 = 10%3;
		
		/*a는 byte type 인데, a의 저장된 값을  
		 * int type에 대입하는 것은 문제가 없을까?
		 * 문제 없다. int type 변수의 범위가 훨씬 넓기 때문.
		 */
		byte a = 10;
		int b = a;
		
		/*b는 int type인데 b 안에 저장된 값을 byte type c에 대입하는건 문제가 없을까?
		 * int지만 byte 범위 안에 들어가는 int라면 문제가 없음.
		 * 하지만, 그 범위 밖에 있는 int라면 문제가 생긴다. 
		 * */
		
		byte c = (byte)b;
		
		
		
		int d = 1000;
		byte e = (byte)d;
		
		double result5 = 5/(double)3;
		
	}

}
