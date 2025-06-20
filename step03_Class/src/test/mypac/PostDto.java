package test.mypac;

public class PostDto {
	private int id;
	
	private String content;
	
	private String author;
	
	public PostDto() {
		System.out.println("객체를 만들었습니다");
	}
	
	public PostDto(int id, String content, String author) {
		System.out.println("객체를 만들었습니다");
		this.id = id;
		this.author = author;
		this.content = content;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	}
	
