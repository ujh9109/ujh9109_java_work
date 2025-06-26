package test.box;

import test.fruit.Apple;

public class AppleBox {
	//필드 선언
	private Apple item;
	
	
	//메소드 선언
	public void pack(Apple item) {
		this.item = item;
	}
	public Apple unpack() {
		return item;
	}
}