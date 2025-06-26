package test.main;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		
		//익명 클래스로 익명의 InnerClass를 이요해서 구현 객체를 만들 수 있다.
		
		Remocon r1 = new Remocon() {

			@Override
			public void up() {
				System.out.println("채널을 올립니다.");
			}

			@Override
			public void down() {
				System.out.println("채널을 내립니다.");
			}
			
		};
		
		useRemocon(r1);
		
		useRemocon(new Remocon() {

			@Override
			public void up() {
				System.out.println("밝기를 올립니다.");
			}

			@Override
			public void down() {
				System.out.println("밝기를 내립니다.");
			}
			
		});
		
		
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
