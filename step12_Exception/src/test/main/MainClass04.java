package test.main;

/*
 * run 버튼을 누르면 실행의 흐름(Thread)가 main() 메소드에서 시작되는데, 이걸 main Thread라고도 한다.
 * */


public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		try {
			
			/*
			 * Thread.sleep() 메소드 내부에서는 RuntimeException을 상속받지 않은
			 * InterruptedException이 발생한다. RuntimeException을 상속 받지 않은 예외는
			 * 예외 처리를 의무적으로 해야한다. 처리하는 방법.
			 * 1. throw
			 * 2. try- catch로 둘러싸기
			 * */
			
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("작업을 실행합니다.");
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}

}
