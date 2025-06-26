//이 클래스가 속해 있는 패키지 명시. 없으면 에러남.
package test.main;

/*
 * 
 * 
 * 클래스 안에서 사용하는 다른 클래스나 인터페이스를 import
 * 
 * 
 * */

public class TestMain {//클래스의 범위를 나타내는 중괄호 시작
	/*
	 * 클래스 안에 무언가를 정의할 때는 클래스 안에 속해 있다는 의미에서 들여 쓰기를 한다.
	 * 클래스 안에 정의할 수 있는 것은
	 * 1. 필드, static 필드
	 * 2. 메소드, static 메소드
	 * 3. 생성자 / 순서가 정해진 것은 아니지만, 보통 필드, 생성자, 메소드 순.
	 * 4. 또 다른 클래스(Inner Class)
	 * 
	 * */
	
	
	//필드
	public String name = "김구라";
	
	public static String yourName = "해골";
	
	
	//생성자
	public TestMain() {//생성자의 범위를 나타내는 중괄호 시작
		//생성자의 내부여서 한번 더 들여쓰기
		//TestMain 객체 생성되면 생성자가 호출됨.
		System.out.println("TestMain 생성자가 호출됨.");
		
	}//생성자의 범위를 나타내는 중괄호 끝
	
	
	//메소드
	public void test() {
		//메소드 내부여서 한번 더 들여쓰기
		//어디에선가 이 클래스의 타입으로 생성된 객체의 test() 메소드 호출.
		System.out.println("test() 메소드 호출됨");
	}
	
	public static void doSomething() {
		//객체를 생성하지 않고 클래스 명에 .을 찍어서 호출할 수 있음.
		System.out.println("doSomething() 메소드 호출됨.");
	}
		
	//run 했을 때 application 실행. 실행의 흐름이 시작되는 아주 특별한 main 메소드.
	 public static void main(String[] args) {
		 //application이 동작을 여기서 준비한다.
		 
	}
	
}//클래스의 범위를 나타내는 중괄호 끝.
