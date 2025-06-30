package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;


/*
 * HashSet은 Set 인터페이스를 구현한 클래스이다.
 * 
 * 순서가 없다.
 * key값도 없다
 * 중복은 허용하지 않는다.
 * 어떤 data를 묶음으로 관리하고자 할 때 사용한다.
 * */

public class MainClass09 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(20);
		set1.add(40);
		
		
		
		Set<String> set2 = new HashSet<>();
		
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("lee");
		set2.add("park");
		
		//Set 객체에 저장한 모든 아이템을 순서를 보정할 수는 없다.
		
		set1.forEach(item->{
			//set1은 Set<Integer> 이기 때문에 item은 Integer type
			Integer tmp = item;
			System.out.println(tmp);
		});
		
		System.out.println("---------------------");
		
		set2.forEach(item->{
			String tmp = item;
			System.out.println(tmp);
		});
		
		System.out.println("------------------------");
		
		set1.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				Integer tmp = t;
				System.out.println(t);
				
			}
			
		});
		
		System.out.println("----------------------");
		
		set2.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				String tmp = t;
				System.out.println(t);
				
			}
		});
		
		System.out.println("---------------------------");
		
		Iterator<Integer> it1 = set1.iterator();
		Iterator<String> it2= set2.iterator();
		
		while(it1.hasNext()) {
			Integer nums = it1.next();
			System.out.println(nums);
		}
		
		System.out.println("--------------------------");
		
		while(it2.hasNext()) {
			String names = it2.next();
			System.out.println(names);
		}
		
	}//main 메소드 끝
}//MainClass09 클래스 끝
