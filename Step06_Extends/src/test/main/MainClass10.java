package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass10 {
	public static void main(String[] args) {
		
		Department d1 = new Department("영업부", "대전");
		
		/*
		 * 위의 부서에서 근무하는 사원 객체 3개 만들어서 그 참조값 3개를 
		 * 배열에 순서대로 담아 보세요.
		 * 
		 * */
		
		Employee emp1 = new Employee("김구라",1000, d1);
		Employee emp2 = new Employee("해골",2000, d1);
		Employee emp3 = new Employee("원숭이",3000, d1);
		
		Employee[] empInfo = new Employee[3];
		//Employee[] empInfo = {null,null,null};
		empInfo[0] = emp1;
		empInfo[1] = emp2;
		empInfo[2] = emp3;
		
		//Employee[] empInfo = {emp1,emp2,emp3}
		
		
		//for 문 이용해서 Employee[]에 담긴 Employee 객체의 printInfo 메소드 호출
		
		for(int i = 0; i<empInfo.length; i++) {
			empInfo[i].printInfo();
			if(i<2)
			System.out.println("------------------");
		}
		
		System.out.println("-------------------------------");
		
		
		for(Employee tmp : empInfo) {
			tmp.printInfo();
			
	
		};
		
	}

}
