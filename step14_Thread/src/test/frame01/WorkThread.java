package test.frame01;

/*
 * 새로운 스레드를 만드는 방법
 * 
 * thread 클래스를 상속 받은 새로운 클래스를 정의한다.
 * run() 메소드를 오버라이드 한다.
 * run() 메소드 안에서 새로운 스레드에서 해야 할 작업을 코딩한다.
 * 만든 클래스로 객체를 생성하고 해당 객체의 start() 메소드를 호출하면 새로운 스레드가 시작된다.
 * */

public class WorkThread extends Thread {
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
