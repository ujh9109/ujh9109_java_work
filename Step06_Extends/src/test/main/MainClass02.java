package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass02 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 나온 참조값을 HandPhone 타입 지역변수 p1에 담기
		HandPhone p1 = new HandPhone();

		Phone p2 = new HandPhone();
		
		Object p3 = new HandPhone();
		
		p1.takePicture();
		p2.call();
		p3.hashCode();
		
		
		
	}

}
