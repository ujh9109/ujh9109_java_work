package test.main;

import test.mypac.Item;

public class MainClass11 {
	public static void main(String[] args) {
		Item item = new Item();
		
		item.setName("a");
		item.setPrice(1000);
		item.setMadeBy("b");
		
		String name = item.getName();
		int price = item.getPrice();
		String MadeBy = item.getMadeBy();
		
		System.out.println(name);
		System.out.println(price);
		System.out.println(MadeBy);
		
		String data = String.format("이 물건의 이름은 %s이고, 가격은 %d이다. 그리고, 제조사는 %s이다.",name,price,MadeBy);
		System.out.println(data);
		
	}

}
