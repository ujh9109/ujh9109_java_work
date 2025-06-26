package test.main;

import test.mypac.Drill;

public class MainClass05 {
	public static void main(String[] args) {
		
		Drill d1 = new Drill(){

			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚫어요");
				
			}};
			
			useDrill(d1);
			
			
			
			
			Drill d2 = () -> {System.out.println("천장에 구멍을 뚫어요");};
			useDrill(d2);
			
			useDrill(()->{System.out.println("벽에 구멍을 뚫어요");});
		
	}
	
	public static void useDrill(Drill d) {
		d.hole();
	}
}
