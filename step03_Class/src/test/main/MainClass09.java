package test.main;

import test.mypac.MemberInfo;

public class MainClass09 {
	public static void main(String[] args) {
		
		/*
		 * 한명의 회원정보를 MemberInfo 객체에 담아 보세요.
		 * 번호, 이름, 주소는 본인 마음대로 설정해서
		 * 위에서 생성한 객체에 showData 메소드를 호출해보세요
		 * */
		
		MemberInfo minfo = new MemberInfo();
		minfo.name ="유재황";
		minfo.addr ="강동구";
		minfo.num =7;
		
		minfo.printData();
	}
}
