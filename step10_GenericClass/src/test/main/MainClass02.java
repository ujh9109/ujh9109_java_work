package test.main;

import test.box.FruitBox;
import test.fruit.Apple;
import test.fruit.Banana;

public class MainClass02 {
	public static void main(String[] args) {
		
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		box1.pack(new Apple());
		box1.unpack();
		
		FruitBox<Banana> box2 = new FruitBox<Banana>();
		box2.pack(new Banana());
		box2.unpack();
		
		
	}//main 메소드 끝

}//클래스 끝
