package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass04 {
	public static void main(String[] args) {
		
		
		ArrayList<String> greets = new ArrayList<>();
		greets.add("hello");
		greets.add("hi");
		greets.add("good night");
		
		Consumer<String> con = new Consumer<>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		};
		
		/*
		 *  forEach() 메소드를 호출하면서 전달한 Consumer 객체의 accept 메소드가
		 *  배열에 저장된 item의 갯수만큼 호출되고
		 *  메소드의 매개 변수에는 배열에 저장된 아이템이 순서대로 전달된다.
		 * */
		
		
		greets.forEach(con);
		
		
		
		
		Consumer<String> con2 = (t)->{
			System.out.println(t);
		};
		
		greets.forEach(con2);
		
		
		greets.forEach(t->
			System.out.println(t)
		);
		
		
		
	}//main 메소드 끝
}//MainClss04 끝
