package test.main;

import test.mypac.Messenger;
import test.mypac.Post;

public class MainClass05 {
	public static void main(String[] args) {
		Messenger m1 = new Messenger();
		
		Post post = new Post();
		post.setAuthor("김구라");
	
		m1.sendPost(post);
		
	}
	

	
	
}
