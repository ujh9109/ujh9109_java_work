package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		
		List<MemberDto> list = new ArrayList<>();
		
		
		MemberDto info1 = new MemberDto();
		info1.setNum(1);
		info1.setName("김구라");
		info1.setAddr("노량진");
		
		MemberDto info2 = new MemberDto(2,"해골", "행신동");
		MemberDto info3 = new MemberDto(3,"원숭이", "동물원");
		
		list.add(info1);
		list.add(info2);
		list.add(info3);
		
		for(MemberDto tmp:list) {
			String info = String.format("번호:%d, 이름:%s, 주소:%s", tmp.getNum(), tmp.getName(), tmp.getAddr());
			System.out.println(info);
		}
		
		System.out.println("------------forEach()를 이용하면 ------------");
		
		
		list.forEach(dto->{
			String info = String.format("번호:%d, 이름:%s, 주소:%s", dto.getNum(), dto.getName(), dto.getAddr());
			System.out.println(info);
			
		});
		
		
	}//main 메소드 끝
}//MainClass05 클래스 끝
