package test.main;
/**/
public class MainClass08 {
	public static void main(String[] args) {
		/*for문을 이용해
		 * 
		 * 1+2+3+ ....+100
		 * 
		 * 의 총합을 콘솔창에 출력하는 프로그래밍을 해보시오.
		 * 
		 * */ 
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += i;
			
		}
		System.out.println("1~100까지의 총합: " + sum);
		
	}

}
