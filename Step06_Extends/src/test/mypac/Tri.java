package test.mypac;

public class Tri extends Shape {

	private int height;
	private int len;
	
	public Tri(int x, int y, int len, int height) {
		super(x,y);
		this.len = len;
		this.height = height;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("삼각형의 밑변의 길이:"+this.len+" 높이:"+this.height);
	}
	
	public void printArea() {
		double area = height*len*0.5;
		System.out.println("삼각형의 넓이는 "+area);
	}
}
