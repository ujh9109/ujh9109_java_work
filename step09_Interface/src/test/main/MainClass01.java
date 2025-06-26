
package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		
		Remocon r1 = null;	
		
		//Remocon r2 = new Remocon();
		
		Remocon r3 = new MyRemocon();
		r3.up();
		r3.down();
		
		
		String a = Remocon.COMPANY;
		String b = r3.COMPANY;
		
		System.out.println(a);
		System.out.println(b);
	}

}
