package test.main;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
		dto.setAddr("노량진");
		dto.setName("김구라");
		dto.setNum(1);
		
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		MemberDto dto3 = new MemberDto(3, "원숭이", "동물원");
		
		
		MemberDto[] m1 = {dto,dto2,dto3};
		
		MemberDto[] m2 = {null,null,null};
		m2[0] = dto;
		m2[1] = dto2;
		m2[2] = dto3;
		
		MemberDto[] m3 = new MemberDto[3];
		m3[0] = dto;
		m3[1] = dto2;
		m3[2] = dto3;
		
		String name = m1[0].getName();
		int num = m1[0].getNum();
		String addr =m1[0].getAddr();
		
		System.out.println(name);
		System.out.println(num);
		System.out.println(addr);
		
		
		

	}

}
