package test.mypac;

public class Cube extends Shape {
	private int len;
	
	public Cube(int x, int y, int len) {
		super(x,y);
		this.len = len;
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("정육면체의 한 변의 길이는 "+this.len);
	}
	public void pintWidth() {
		int data1 = 6*len*len;
		System.out.println("정육면체의 넓이는 "+data1);
	}
	
	public void printVolume() {
		int data2 = len*len*len;
		System.out.println("정육면체의 부피는 " +data2);
	}
}
