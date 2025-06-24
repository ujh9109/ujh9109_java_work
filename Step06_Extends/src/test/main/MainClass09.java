package test.main;

import test.company.Department;
import test.company.Employee;
import test.company.Manager;

public class MainClass09 {
	public static void main(String[] args) {
		Manager m1 = new Manager("KING", 5000, new Department("기획부", "서울"));
		
		m1.setPosition("이사");
		
		m1.printInfo();
	
		System.out.println("----------------------------------");
		
		Employee m2 = new Manager("KING2", 5000, new Department("기획부", "서울"));
		
		m2.printInfo();
		
		System.out.println("----------------------------------");
		
		Manager m3 = (Manager)m2;
		m3.setPosition("부장");
		m3.printInfo();
	}

}
