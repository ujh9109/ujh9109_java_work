package test.mypac;

public class Cyl extends Shape {
	private int radius; 
	private int height;

	public Cyl(int x, int y, int radius, int height) {
		super(x,y);
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("원의 반지름:"+this.radius+ " 높이:"+this.height);
	}
	
	public void PrintWidth() {
		double data = (Math.PI*radius*radius)*2 + (2*Math.PI*radius*height);
		System.out.println("원기둥의 넓이는 "+data);
	}
	public void PrintVolume() {
		double data2 = (Math.PI*radius*radius)*height;
		System.out.println("원기둥의 부피는 "+data2);
	}
	}

