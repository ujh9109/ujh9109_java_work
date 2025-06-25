package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		
		
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				prepare();
				System.out.println("사이버 공격을 시작합니다.");
				
			}
		};
	
		
		w1.attack();
		
		/*
		 * 가상 공간(Virtual)을 공격해야 한다.
		 * 익명의 Local Inner Class를 이용하여 Weapon type 객체를 생성해서 공격할 예정
		 * 1번만 공격. -> 변수에 담을 필요 없다.
		 * */
		
		new Weapon() {
			
			@Override
			public void attack() {
				prepare();
				System.out.println("가상공간 공격을 시작합니다.");
				
			}
		}
		.attack();
		
	}
}
