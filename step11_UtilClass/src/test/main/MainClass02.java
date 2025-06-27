package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		
		
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		
		 for(int tmp : nums) {
		        System.out.println(tmp);
		 }
		 
		 System.out.println("--------------------------");
		 
	
		 
	
	
	}
	
}

