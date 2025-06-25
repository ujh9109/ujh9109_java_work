package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		
		//String type을 매개변수에 전달하면서 메소드 호출
		sendMessage("hello");
		sendMessage("bye");
		
		String str = "kimgura";
		sendMessage(str);
	}
	
	public static void sendMessage(String msg) {
		System.out.println(msg + "을/를 전송했습니다.");
	}
	
	
}
