package work;

import java.util.*;

abstract class Shape{
	double pi = 3.14;
	
	abstract void draw();
	
	public double findArea() {
		return 0.0;
	}
}

class Circle extends Shape{
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("���� �׸���.");
	}
	public double findArea(){
		return pi * radius * radius;
	}
}

class Rectangle extends Shape{
	int w,h;
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public void draw() {
		System.out.println("�簢���� �׸���");
	}
	
	public double findArea() {
		return w*h;
	}
}

public class main{
	public static void main(String[] agrs) {
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("���� ���̴� %.1f\n",c.findArea());
	}
}
