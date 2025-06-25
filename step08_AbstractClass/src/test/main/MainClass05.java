package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {

		class SpaceWeapon extends Weapon{

			@Override
			public void attack() {
				prepare();
				System.out.println("우주 공격을 시작합니다.");
			}
			
		}
	
		Weapon w1 = new SpaceWeapon();
		w1.attack();
		
		new SpaceWeapon().attack();
	}

}
