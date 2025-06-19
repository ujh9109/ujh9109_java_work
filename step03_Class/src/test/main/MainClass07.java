package test.main;

import test.mypac.MemberInfo;

public class MainClass07 {
	public static void main(String[] args) {
		
		//MemberInfo 객체를 생성해서 참조값을 mem1이라는 변수에 담아보세요
		MemberInfo mem1 = new MemberInfo();
		
		//회원의 번호 1을 위에서 생성한 객체에 담아 보세요.
		mem1.num = 1;
		//회원의 이름 "김구라"를 위에서 생성한 객체에 담아 보세요.
		mem1.name = "김구라";
		//회원의 주소 "노량진"을 위에서 생성한 객체에 담아 보세요.
		mem1.addr = "노량진";
		//위의 작업을 모두 했으면 debug 모드로 실행해서 정상적으로 동작하는 지 확인해보세요.
	
		System.out.println(mem1.name+"의 회원번호는 "+mem1.num + "이고, 주소는 "+mem1.addr+"입니다.");
	}
}
