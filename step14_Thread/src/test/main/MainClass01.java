package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다");
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		test();
		
		System.out.println("main 메소드가 종료됩니다");
	}//main 메소드 끝

	public static void test() {
		System.out.println("test() 메소드 호출됨");
	}//test 메소드 끝
	
}//MainClass01 클래스 끝
