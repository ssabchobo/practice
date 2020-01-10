package work;

import java.util.*;

interface Comparable{
	int compareTo(Object other);
}

class Circle implements Comparable{
	double radius;
	
	public Circle (double radius) {
		this.radius = radius;
		System.out.println(this.radius);
	}

	public int compareTo(Object o) {
		Circle c = (Circle)o;
		System.out.println(this.radius);
		if(this.radius > c.radius)
			return 1;
		else if(this.radius == c.radius)
			return 0;
		else
			return -1;
	}
}

public class main{
	public static void main(String[] args) {
		Circle c1 = new Circle(6.0);
		Circle c2 = new Circle(5.0);
		
		if(c1.compareTo(c2)>0)
			System.out.println("ù��° ���� �ι�° ������ ũ��.");
		else if(c1.compareTo(c2)==0)
			System.out.println("�� ���� ũ�Ⱑ ����.");
		else
			System.out.println("ù��° ���� �ι�° ������ �۴�.");
	}
}