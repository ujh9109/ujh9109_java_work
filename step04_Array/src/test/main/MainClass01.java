package test.main;

public class MainClass01 {
	
	public static void main(String[] args) {
		
		/* 
		 * 
		 * 자바에서 배열 만드는 방법
		 * int[] nums = {10,20,30,40,50};
		 * 
		 * 정수가 들어있는 배열의 data tpye은 int임을 의미.
		 * 배열은 중괄호를 이용해서 만든다.
		 * 한번 만들어진 배열의 사이즈를 늘리거나, 줄일 수는 없다.
		 * 
		 * 참조방법
		 * nums[0]
		 * nums[1]
		 * 
		 * 쓰이는 곳이 한정적임. 배열의 방의 크기를 줄이거나 늘릴 필요가 없을 때.
		 * */ 
		
		int[] nums = {10,20,30,40,50};
		
		/*
		 * "김구라" "해골" "원숭이" "주뎅이" "덩어리" 배열에 담고.
		 * 그 참조값을 names라는 변수에 대입해보세요
		 * 
		 * */
		
		String[] names = {"김구라","해골","원숭이","주뎅이","덩어리"};
		
		
		
		//nums 배열에 저장된 숫자를 반복문 돌면서 콘솔창에 하나씩 순서대로 출력할 것.
		
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
		
	}
}
