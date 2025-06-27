package test.main;

import test.mypac.MyFunction;

public class MainClass06 {
	public static void main(String[] args) {
		
		/*
		 * MyFunction 인터페이스는 
		 * execute() 추상 메소드 1개
		 * log() default 메소드 1개
		 * help() static 메소드 1개
		 * */
		
		MyFunction f1 = ()->{
			System.out.println("실행합니다.");
			
		};
	
		f1.execute();
		f1.log();
		MyFunction.help();
		
	}//main 메소드 끝
}//MainClass06 클래스 끝
