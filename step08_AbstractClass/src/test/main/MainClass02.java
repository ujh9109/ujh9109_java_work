package test.main;

import test.mypac.MyWeapon;
import test.mypac.OceanWeapon;
import test.mypac.SkyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		
		Weapon w = new SkyWeapon(); 
		w.attack();
		
		Weapon w2 = new MyWeapon();
		w2.attack();
		
		
		/*
		 * 지상 공격을 하는 weapon type 객체를 만들어서 .attack() 메소드를 호출했을 때.
		 * 해상 공격이 되도록 구현할 것.
		 * 
		 * */
		
		Weapon w3 = new OceanWeapon(); 
		w3.attack();
	}

}
