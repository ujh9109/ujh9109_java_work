package test.main;

import test.mypac.Operator;

public class MainClass07 {
	public static void main(String[] args) {
		Operator plus = (double num1, double num2)->{
		return num1+num2;
	};
	
	Operator minus = (double num1, double num2)->{
		return num1-num2;
	};
	
	
	Operator multiply = (a,b) -> a*b;
	
	
	double result1 = plus.execute(10, 10);
	double result2 = minus.execute(10,10);
	double result3 = multiply.execute(10,10);
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	}
}
