package test.main;

import test.mypac.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		new MemberDto();
		MemberDto dto = new MemberDto();
		
		dto.setAddr("노량진");
		dto.setName("김구라");
		dto.setNum(1);
		
		new MemberDto(1, "김구라", "노량진");
		MemberDto dto2 = new MemberDto(1, "김구라", "노량진");
	
		
		
		
	}
	
	
}
