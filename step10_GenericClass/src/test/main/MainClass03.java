package test.main;


import test.fruit.Apple;
import test.mypac.Pair;

public class MainClass03 {
	public static void main(String[] args) {
		Pair<String, Object> p1 = null; 
		
		
		
		//기본 데이터 타입의 참조 데이터형을 사용하면 됨.
		Pair<Integer, String> p3 = null;
		
	
		
		Pair<String, Apple> p4 = new Pair<>("abc", new Apple());
		
		String a = p4.getkey();
		Apple b = p4.getvalue();
		
		
	}

}
