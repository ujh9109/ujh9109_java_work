package test.main;

import test.box.AppleBox;
import test.box.BananaBox;
import test.fruit.Apple;
import test.fruit.Banana;

public class MainClass01 {
	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		AppleBox ab1 = new AppleBox();
		ab1.pack(a1);
		ab1.unpack();
		
		
		ab1.pack(new Apple());
		ab1.unpack();
		
		new AppleBox().pack(new Apple());
		
		
		
		Banana b1 = new Banana();
		BananaBox bb1 = new BananaBox();
		
		bb1.pack(b1);
		bb1.unpack();
		
		
		
		
	}//main 메소드 끝

}
