package test.frame02;

/*
 * 새로운 스레드 만드는 방법2
 * 
 * runnable 인터페이스를 구현한 클래스를 정의한다.
 * run() 메소드를 강제 오버라이드 한다.
 * Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성자의 인자로 전달한다.
 * Thread 클래스로 만든 객체의 start() 메소드를 호출하여 스레드를 시작한다.
 * */

public class WorkRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("10초 걸리는 작업을 시작합니다.");
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("작업이 종료 되었습니다.");
		
	}
}
