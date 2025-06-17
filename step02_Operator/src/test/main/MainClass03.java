package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * i라는 변수를 만들고 초기값 0 대입
		 * i가 10보다 작은 동안에 반복한다. 작으면 for문 블럭을 실행한다.
		 * i를 1씩 증가시키면서
		 * i는 for문 안에서만 사용되는 지역변수이다.(for문이 종료되면 i는 사라짐.)
		 */
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		//콘솔창에 9부터 0까지 순서대로 출력되도록 for 문을 구성해보자
		
		for(int i=9; i>=0; i--){
			System.out.println(i);
		}
	}

}
