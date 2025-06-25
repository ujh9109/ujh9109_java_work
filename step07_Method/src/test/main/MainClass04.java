package test.main;

import test.mypac.Post;

public class MainClass04 {
	public static void main(String[] args) {
		sendPost(null);
		
		sendPost(new Post());
		
		Post post = new Post();
		
		post.setId(1);
		post.setAuthor("원숭이");
		post.setTitle("JavaScript");
		
		sendPost(post);
		
		
		Post post2 = new Post(2,"Java","해골");
		
		sendPost(post2);
		
		sendPost(new Post(3,"git", "어쩌구"));
		
	}
	
	public static void sendPost(Post post) {
		
		System.out.println("글을 전송했습니다.");
	}
	
	
	}

