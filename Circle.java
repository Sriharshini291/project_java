package anudip;

import java.util.Scanner;

//parent class//

public class Shape {
	
	float pi=3.14f;
	//method to draw shape//
	void draw()
	{
	System.out.println("Drawing a shape");
	}
	void shapeinfo()
	{
	System.out.println("Shape is:");
	}
	}

//child class//

public class Circle extends Shape {

		double radius;
		void circleinfo()
		{
		System.out.println("    Circle");
		System.out.println("Enter radius:");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextDouble();
		}
		//method to calculate area of circle//
		void area()
		{
		System.out.println("Area of circle:"+(pi*radius*radius));
		}
		//method to calculate circumference of circle//
		void circumference()
		{
		System.out.println("circumference of circle:"+(2*pi*radius));
		}
		public static void main(String args[])
		{
		//creating object for child class//
		Circle c=new Circle();
		c.draw();
		c.shapeinfo();
		c.circleinfo();
		c.area();
		c.circumference();
		}
}
