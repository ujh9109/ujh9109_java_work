package test.mypac;

public abstract class Weapon {
	
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	public abstract void attack();
}
