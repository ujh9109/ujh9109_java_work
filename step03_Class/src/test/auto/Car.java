package test.auto;
/*
 * Class의 역할
 * 
 * 1. 객체의 설계도 역할
 *		-객체는 heap 영역(사물함)에 들어있는 물건이라고 생각하면 된다.
 *		-class를 이용해서 객체를 원하는 시점에 원하는 갯수만큼 만들어 낼 수 있다.
 *		-만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 될 지 class로 설계할 수 있다.
 *
 * 2. Data type 역할
 * 
 * 3. static 필드와 메소드를 포함하는 역할
 * */


public class Car {
	//차의 이름을 저장할 필드 만들기(필드는 지역변수가 아님)
	//필드는 객체 고유의 저장소이다. 필드는 선언만해도 기본값이 들어가면서 만들어짐
	public String name; //참조 데이터 타입의 기본값은 null
	//차의 가격을 저장할 필드 만들기
	public int price; // 기본데이터 타입의 기본값은 0
	
	
	
	//달리는 기능(method) 만들기
	public void drive() {
		System.out.println(this.name +"이(가) 달려요!");	
	}

}