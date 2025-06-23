package test.main;


import test.mypac.Car;
import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		
		Object p1 = new HandPhone();
		Object c1 = new Car();
		
		//p1의 사용 설명서를 Phone type으로 교체하면서 참조값을 p2에 담아 보세요.
		
		Phone p2 = (Phone)p1;
		p2.call();
		
		Phone p3 = (Phone)c1;
		p3.call();
		
	}

}
