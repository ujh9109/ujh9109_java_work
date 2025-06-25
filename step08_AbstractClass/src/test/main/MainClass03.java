package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Bear;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;


public class MainClass03 {
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		Monkey m1 = zoo.getMonkey();
		Tiger t1 = zoo.getTiger();
		Bear b1 = zoo.getBear();
		
		m1.say();
		t1.roar();
		b1.help();
	}

}
