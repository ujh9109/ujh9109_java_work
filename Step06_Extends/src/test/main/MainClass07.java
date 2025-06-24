package test.main;

import test.mypac.Circle;
import test.mypac.Cube;
import test.mypac.Cyl;
import test.mypac.Rect;

import test.mypac.Shape;
import test.mypac.Tri;

public class MainClass07 {
	public static void main(String[] args) {
		//Shape 객체 생성
		Shape s1 = new Shape(100,200);
		
		s1.printInfo();
		
		System.out.println("---------------------------");
		
		Circle s2 = new Circle(200,300,5);
		
		s2.printInfo();
		
		System.out.println("---------------------------");
		
		Rect r1 = new Rect(100,200,50);
		r1.printInfo();
		r1.printArea();
		
		System.out.println("---------------------------");
		
		Tri t1 = new Tri(10,20,20,30);
		t1.printInfo();
		t1.printArea();
		
		System.out.println("---------------------------");
		
		Cyl cy1 = new Cyl(15,50,5,10);
		cy1.printInfo();
		cy1.PrintWidth();
		cy1.PrintVolume();
		
		System.out.println("---------------------------");
		
		Cube cb1 = new Cube(10,20,30);
		cb1.printInfo();
		cb1.pintWidth();
		cb1.printVolume();
		
	}
}
