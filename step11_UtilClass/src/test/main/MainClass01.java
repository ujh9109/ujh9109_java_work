package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		
		//자바에서 배열은 용도가 변경되어 있따. item을 담을 수 있는 공간을 늘이거나 줄일 수 없다.
		
		//String type을 담을 수 있는 방 5개짜리 배열 객체 생성
		String[] names = new String[5];
		names[0] = "김구라";
		names[1] = "해골";
		names[2] = "원숭이";
		
		//아이템을 갯수 상관없이 필요에 따라 마음대로 추가하거나 제거할 수 있는 배열목록(ArrayList) 객체 생성
		
		

		ArrayList<String > friends = new ArrayList<>();
		ArrayList<String > removedName = new ArrayList<>();
		
		friends.add("김구라");
		friends.add("해골");
		friends.add("원숭이");
		
		String item = friends.get(0);
		
		String rname1 = friends.remove(1);
		String rname2 = friends.remove(1);
		
		removedName.add(rname1);
		removedName.add(rname2);
		
		
		int size = friends.size();
		
		friends.add(0, "에어콘");
		
		friends.set(0, "선풍기");
		
		friends.clear();
	}

}
