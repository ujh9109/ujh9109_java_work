package test.mypac;

public class Rect extends Shape {
	
	private int len;
	
	public Rect(int x, int y, int len) {
		super(x,y);
		this.len = len;
	}
	
	public void printArea() {
		int data = len*len;
		System.out.println("사각형의 넓이는 "+data);
	}
	
	
	public void printInfo() {
		super.printInfo();
		System.out.println("사각형 한 변의 길이는 "+ this.len);
		};
	}