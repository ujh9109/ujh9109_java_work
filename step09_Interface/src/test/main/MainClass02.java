package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		
	Object r1 =	 new MyRemocon();
	Remocon r2 = new MyRemocon();
	MyRemocon r3 = new MyRemocon();
	
	useRemocon((Remocon)r1);
	useRemocon(r2);
	useRemocon(r3);
		
	useRemocon(new Remocon() {

		@Override
		public void up() {
			System.out.println("채널을 올립니다.");
			
		}

		@Override
		public void down() {
			System.out.println("채널을 올립니다.");
			
		}
		
	});
	
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
