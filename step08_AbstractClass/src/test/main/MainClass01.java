package test.main;

import test.mypac.MyWeapon;
import test.mypac.SkyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		
		Weapon w1 = null;
		
		
		//참조값 얻어내기
		Weapon w2 = new MyWeapon();
		
		w2.prepare();
		w2.attack();
		
		Weapon w3 = new SkyWeapon();
		w3.attack();
	}

}
