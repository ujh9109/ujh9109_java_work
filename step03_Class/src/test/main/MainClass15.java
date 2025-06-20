package test.main;

import test.mypac.PostDto;

public class MainClass15 {
	public static void main(String[] args) {
		PostDto dto = new PostDto();
		dto.setAuthor("유재황");
		dto.setContent("집 빨리 가는 방법");
		dto.setId(1);
		
		System.out.println(dto.getAuthor());
		System.out.println(dto.getContent());
		System.out.println(dto.getId());
		
		String author = dto.getAuthor();
		String content = dto.getContent();
		int id = dto.getId();
		
		System.out.println(id);
		System.out.println(content);
		System.out.println(author);
		
		
		PostDto dto2 = new PostDto();
		dto2.setId(2);
		dto2.setAuthor("남현수");
		dto2.setContent("저녁메뉴");
		
		
		PostDto dto3 = new PostDto(3, "점심메뉴", "김종환");
		
		
		dto3.setAuthor("박대휘");
		dto3.setContent("영화 만드는 방법");
		dto3.setId(4);
		
	
	}

}
