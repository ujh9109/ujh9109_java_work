package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass08 {
	public static void main(String[] args) {
		Department d1 = new Department("교육부", "역삼동");
		
		d1.printInfo();
		
		System.out.println("------------------------------");
		
		Employee emp1 = new Employee("김구라", 1000, d1);
		//Employee emp1 = new Employee("김구라", 1000, new Department("교육부", "역삼동"));
		
		emp1.printInfo();
		
		
		
		System.out.println("------------------------------");
		
		/*
		 * 위에서 생성한 부서와 동일한 부서에서 근무하는 사원 객체를 하나 더 생성하기.
		 * 이름: 원숭이, 급여: 2000
		 * */
		
		
		Employee emp2 = new Employee("원숭이", 2000, d1);
		emp2.printInfo();
		
		
		
		System.out.println("------------------------------");
		
		/*
		 * 사원 이름: 주뎅이, 급여: 3000, 부서명:SALES, 부서위치: LA
		 * 한 줄 코딩.
		 * 
		 * */
		
		
		Employee emp3 = new Employee("주뎅이", 3000, new Department("SALES", "LA"));
		emp3.printInfo();
	}

}
