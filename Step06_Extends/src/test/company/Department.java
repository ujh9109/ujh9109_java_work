package test.company;

public class Department {
	private String deptName;
	private String location;
	
	public Department(String deptName, String location) {
		this.deptName = deptName;
		this.location = location;
	}

	public void printInfo() {
		System.out.println("부서명: "+deptName);
		System.out.println("위치: "+location);
	}
}
