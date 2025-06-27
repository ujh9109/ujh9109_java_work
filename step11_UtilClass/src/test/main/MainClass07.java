package test.main;

import java.util.List;

public class MainClass07 {
	public static void main(String[] args) {
		
		/*
		 * List<String> naems = new ArrayList<>();
		 * names.add("kim");
		 * names.add("lee");
		 * names.add("park");
		 * 
		 * 4줄의 코딩을 아래 1줄로 바꿀 수 있다.
		 * */
		
		//of는 읽기전용. 수정, 삭제, 변경 불가능.
		List<String> names = List.of("kim","lee","park");
		
		
	}

}
