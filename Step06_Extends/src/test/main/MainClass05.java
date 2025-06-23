package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone();
		p1.call();
		p1.takePicture();
		p1.mobileCall();
		p1.doInternet();
		
		System.out.println("-------------------------");
		
		//SmartPhone 객체를 생성해서 HandPhone type으로 받은 다음
		HandPhone p2 = new SmartPhone();
		//사진 찍는 메소드를 호출하면? 객체가 어떤 객체인 지가 중요함.
		p2.takePicture();
		
		System.out.println("-------------------------");
		HandPhone p3 = new HandPhone();
		p3.takePicture();
		
		
	}
}
