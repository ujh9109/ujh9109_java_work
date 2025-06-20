package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		
		//String type을 담을 수 있는 null로 초기화된 방 3개짜리 배열객체 생성
		String[] names = {null,null,null};
		names[0] = "kim";
		names[1] = "lee";
		names[2] = "park";
		
		
		String[] names2 = new String[100];
		names2[0] = "aaa";
		names2[1] = "bbb";
		names2[2] = "ccc";
	}

}
