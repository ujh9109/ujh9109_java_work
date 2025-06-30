package test.main;

import test.mypac.MyUtil;
import test.mypac.WowException;

public class MainClass07 {
	public static void main(String[] args) {
		
		try {
		MyUtil.generate();
		}catch(WowException we) {
			System.out.println("오잉! WowException이 발생했습니다.");
			System.out.println("예외 메시지: "+we.getMessage());
			
		}
		
		System.out.println("main 메소드가 종료됩니다.");
		
		
	}

}
