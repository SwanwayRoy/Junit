package com.niit.junit;

public class Calculator
{
	
	public double add (double a, double b)
	{
		return a + b;
	}
	
	public double substract (double a, double b)
	{
		return a - b;
	}
	
	public double multiply (double a, double b)
	{
		return a * b;
	}
	
	public double divide (double a, double b)
	{
		if (b == 0)
			throw new ArithmeticException();
		return a / b;
	}
	
	public static void main (String args [])
	{
		Calculator calObj = new Calculator();
		int a, b;
		a = 20;
		b = 10;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("Sum : " + calObj.add(a, b));
		System.out.println("Difference : " + calObj.substract(a, b));
		System.out.println("Product : " + calObj.multiply(a, b));
		System.out.println("Quotient : " + calObj.divide(a, b));
	}
}