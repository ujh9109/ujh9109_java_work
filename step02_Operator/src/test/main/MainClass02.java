package test.main;

/* 증감 연산자 테스트
 * 변수에 있는 숫자 값을 1씩 증가 혹은 감소 시킬 때 사용된다.
 */

public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		num++;
		num++;
		num++;
		//최종적으로 3
		
		int num2 = 0;
		num2--;
		num2--;
		num2--;
		//최종적으로 -3
		
		int num3 = 0;
		int result1 = num3++;
		//result1에 0이 대입되고, num3가 1 증가한다.
		
		int num4 =0;
		int result2 = ++num4;
		//num4에 1이 증가하고, result2에 1이 대입된다.
		
	}

}
