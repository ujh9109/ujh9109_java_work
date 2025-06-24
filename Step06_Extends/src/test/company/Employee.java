package test.company;

public class Employee {
	
	private String name;
	private int salary;
	private Department dept;
	
	public Employee(String name, int salary, Department dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public void printInfo() {
		System.out.println("이름: "+name);
		System.out.println("연봉: "+salary+"(단위:만원)");
		dept.printInfo();
		
	}
}
