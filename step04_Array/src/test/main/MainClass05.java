package test.main;

import test.mypac.MemberInfo;

public class MainClass05 {
	public static void main(String[] args) {
		MemberInfo m1 = new MemberInfo();
		m1.num = 1;
		m1.name = "김구라";
		m1.addr = "노량진";
		
		MemberInfo m2 = new MemberInfo();
		m2.num = 2;
		m2.name = "해골";
		m2.addr = "행신동";
		
		MemberInfo m3 = new MemberInfo();
		m3.num = 3;
		m3.name = "원숭이";
		m3.addr = "동물원";
		
		
		MemberInfo[] members = {m1,m2,m3};
		MemberInfo[] a = members;
		MemberInfo b = members[0];
		int c = members[0].num;
		String d = members[0].name;
		
		members[0].printData();
	}
}