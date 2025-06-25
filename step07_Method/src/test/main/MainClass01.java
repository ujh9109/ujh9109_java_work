package test.main;

public class MainClass01 {
	
	//static 영역에 만들어지는 main() 메소드
	public static void main(String[] args) {
		
		System.out.println("main 메소드가 시작됨");
		
		
		MainClass01.test();
		
		test();
		
		
		System.out.println("main 메소드가 종료됨");
		
	}
	
	public static void test() {
		System.out.println("test() 메소드가 호출됨.");
	}
}
