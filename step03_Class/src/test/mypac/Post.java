package test.mypac;

public class Post {
	
	//글번호를 저장할 필드
	public int id;
	//글 내용을 저장할 필드
	public String content;
	//글 작성자를 저장할 필드
	public String author;
	
	public void read() {
		System.out.println("책 페이지를 넘겼습니다.");
	}
		
	public void printData() {
		String data = String.format("번호:%d 내용:%s 저자:%s ", this.id, this.content, this.author);
		System.out.println(data);
	}
	
}
