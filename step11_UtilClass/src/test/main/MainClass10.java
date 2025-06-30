package test.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		
		Set<String> set1 = Set.of("A","B","C","D");
		Set<String> set2 = Set.of("C","D","E","F");
		
		
		List<String> names = List.of("kim","lee","lee","park");
		Set<String> namesSet = new HashSet<>(names);
		
		System.out.println(names);
		System.out.println(namesSet);
		
		
		
		List<String> names2 = new ArrayList<>(namesSet);//인덱스로 관리 가능해짐
		
		System.out.println(names2);
		
		
	}//main 메소드 끝
}//MainClass10 클래스 끝
