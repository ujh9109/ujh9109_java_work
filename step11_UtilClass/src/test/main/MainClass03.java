package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
	
		
		ArrayList<String> s = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		 
		for(int i = 0; i<5;i++) {
			System.out.println("문자열 입력:");
			String input = scan.nextLine();
			s.add(input);
			 
		 }
		
		 
		 System.out.println("---------------------------");
		
		 for(String str:s) {
			 System.out.println(str);
		 }
	
	}

}
