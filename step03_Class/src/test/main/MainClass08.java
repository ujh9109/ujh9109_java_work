package test.main;

import test.mypac.Post;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * post 객체를 생성해서 참조값을 p1이라는 변수에 담아 보세요.
		 * 글번호 1000을 위에서 생성한 객체에 담아 보세요.
		 * 글 내용 "안녕하세요"를 위에서 생성한 객체에 담아보세요
		 * 작성자 "원숭이"를 위에서 생성한 객체에 담아 보세요.
		 * 위의 작업이 끝나면 디버깅 모드로 돌려보세요.
		 * */
		Post p1 =new Post();
		p1.id =1000;
		p1.content = "안녕하세요";
		p1.author = "원숭이";
		
		p1.read();
		System.out.println("글번호 "+p1.id+"번의 내용은 "+ p1.content+"이고, 저자는 "+p1.author+"입니다.");
		
	}
}
