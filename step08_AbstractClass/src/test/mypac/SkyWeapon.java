package test.mypac;

public class SkyWeapon extends Weapon {

	/*
	 * 추상 클래스로 생성된 객체가 제공해주는 메소드를 활용하면서
	 * 나의 용도에 맞게 구현할 수 있다.
	 * */
	
	@Override
	public void attack() {
		this.prepare();
		System.out.println("공중 공격을 시작합니다.");
		
	}
	
}
