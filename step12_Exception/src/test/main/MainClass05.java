package test.main;

/*
 * run 버튼을 누르면 Java Virtual Machine이 main() 메소드를 호출하면서 메인 스레드가 시작된다.
 * 
 * 따라서 여기서 발생하는 예외를 우리가 처리하지 않으면 JVM이 대신 처리해준다.
 * */


public class MainClass05 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main 메소드가 시작되었습니다.");
		
		
			
			Thread.sleep(5000);
			
			
		
	
		
		System.out.println("main 메소드가 종료됩니다.");
	}

}
