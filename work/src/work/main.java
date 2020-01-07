package work;

import java.util.*;
class Shape{
	private int x,y;
	
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void print() {
		System.out.print("("+x+","+y+")");
	}
	
}
class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width=width;
		this.height= height;
	}

	public double area() {
		return width*height;
	}
	
	public void draw() {
		print();
		System.out.println("위치에 가로: "+width+"세로: "+height);
	}
}

public class main {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5,3,10,20);
		Rectangle rect2 = new Rectangle(8,9,10,20);
		rect1.draw();
		System.out.println("도형의 면적은: "+rect1.area());
		rect2.draw();
		System.out.println("도형의 면적은: "+rect2.area());
	}
}