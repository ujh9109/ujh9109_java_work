package test.main;

import test.mypac.Person;
import test.mypac.Programmer;
import test.mypac.Singer;

public class MainClass08 {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.work();
		p1.sing();
		p1.develope();
		
		
		System.out.println("-------------------");
		
		Singer p2 = new Person();
		p2.sing();
		
		System.out.println("-------------------");
		
		Programmer p3 = new Person();
		p3.develope();
		
		
	}

}
