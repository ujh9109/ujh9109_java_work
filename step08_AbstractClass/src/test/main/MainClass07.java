package test.main;

import test.mypac.Weapon;

public class MainClass07 {
	public static void main(String[] args) {
		
		/*
		 * 여기서 아래에 정의된 useWeapon 메소드를 호출할 것
		 * */
			
		
		useWeapon(new Weapon() {

			@Override
			public void attack() {
				System.out.println("연사로 공격합니다.");
				
			}
			
		});
		
			
		useArray(new int[] {1,2,3,4});
		
		
		
	}
	
	public static void useWeapon(Weapon w) {
		w.attack();
		
	}
	
	public static void useArray(int[] a) {
		for(int i=0; i<a.length; i++) {
		System.out.print(a[i]);
		}
	}
	

	
}
