package test.main;


import test.mypac.ZzangGu;

public class MainClass06 {
	public static void main(String[] args) {
	
		/*
		 * 짱구 객체를 3개 생성해서 배열에 담은다음
		 * 반복문 돌면서 배열에 담긴 짱구 객체의 dance() 메소드 호출
		 * */
		
		ZzangGu zz1 = new ZzangGu();
		ZzangGu zz2 = new ZzangGu();
		ZzangGu zz3 = new ZzangGu();
		
		ZzangGu[] zzs = {zz1,zz2,zz3};
		
		for(int i = 0; i<zzs.length; i++) {
			zzs[i].dance();
		}
		
		System.out.println("----------------------------");
		
		for(ZzangGu tmp: zzs) {
			tmp.dance();
		
		}
	}
}
	
	

