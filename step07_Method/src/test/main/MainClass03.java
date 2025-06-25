package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		printSum(1,2);
		System.out.println("---------------------------");
		printSum(10,20);
		System.out.println("---------------------------");
		printSum(100,200);
	}
	
	public static void printSum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1+"과 "+ num2+"의 합: "+result);
		String data = String.format("%d과 %d을 합한 결과 %d이 출력되었습니다.", num1,num2,result);
		System.out.println(data);
	}
}
