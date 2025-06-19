package test.main;

import test.mypac.MemberInfo;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * MemberInfo 객체를 3개 생성해서 그 참조값을 m1,m2,m3라는 변수에 각각 담아보세요.
		 * m1,m2,m3에 들어있는 참조값을 이용해서 3명의 회원정보를 각각의 객체에 담아 보세요.
		 * 각각의 객체가 가지고 있는 printData 메소드를 호출해보세요.
		 * */
		
		MemberInfo m1 = new MemberInfo();
		m1.addr = "서울";
		m1.name = "kim";
		m1.num = 10;
		
		MemberInfo m2 = new MemberInfo();
		m2.addr = "부산";
		m2.name = "oh";
		m2.num = 20;
		
		MemberInfo m3 = new MemberInfo();
		m3.addr = "인천";
		m3.name = "park";
		m3.num = 30;
		
		m1.printData();
		m2.printData();
		m3.printData();
	}
}
