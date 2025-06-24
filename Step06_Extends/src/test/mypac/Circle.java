package test.mypac;


//shape(모형) 클래스를 상속 받아서 Circle 클래스 정의하기
public class Circle extends Shape {
	
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);//super()는 부모 클래스의 생성자를 의미한다.
		this.radius = radius;
	}

	public void printArea() {
		double area = Math.PI*radius*radius;
		System.out.println("원의 넓이는 "+area);
		
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("반지름은:" + radius);
	}
	
}
