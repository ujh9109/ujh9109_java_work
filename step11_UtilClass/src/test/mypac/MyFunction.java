package test.mypac;

/*
 * 인터페이스에서 메소드의 접근 지정자 public 생략하면 기본이 public
 * */


@FunctionalInterface
public interface MyFunction {
	//추상 메소드
	public void execute();
	
	//자바 9부터 추가된 문법. default 메소드.
	default void log() {//참조값으로 호출하는 메소드. 객체 생성해야한다는 의미.
		System.out.println("실행 로그 출력");
	}
	
	
	//자바 9부터 추가된 문법 static 메소드
	public static void help() {//인터페이스 명 뒤에 .을 붙여서 호출
		System.out.println("도움말");
	}
}
