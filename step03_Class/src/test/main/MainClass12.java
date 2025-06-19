package test.main;

import test.mypac.Post;

public class MainClass12 {
	public static void main(String[] args) {
		Post p1 = new Post();
		p1.id =1;
		p1.content = "hello";
		p1.author = "kim";
		
		p1.printData();
		
		Post p2 = new Post();
		p2.id =2;
		p2.content = "bye";
		p2.author = "lee";
		
		p2.printData();
	}

}
