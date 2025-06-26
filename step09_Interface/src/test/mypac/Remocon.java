package test.mypac;

public interface Remocon {
	
	/*
	 * 필드를 가질 수 있지만 static final만 가능.
	 * static 영역에 리모콘 인터페이스와 같이 만들어 진다.
	 * 값이 결정된 이후에 변경 불가능. 상수화.
	 * 생략 가능.
	 * */
	
	static String COMPANY = "LG";

	//인터페이스는 추상 메소드만 정의할 수 있다.
	//abstract 예약어 사용하지 않아도 된다.
	public void up();
	public void down();
}
