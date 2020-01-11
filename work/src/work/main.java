package work;

import java.util.*;

interface Human{
	void eat();
	void print();
	
	static void echo() {
		System.out.println("��ȣ!!!");
	}
}

class Worker implements Human{
	public void print() {
		System.out.println("�ΰ��Դϴ�.");
	}

	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
	}
}

class Student implements Human{
	int i;
	
	public Student(int i) {
		this.i = i;
	}
	
	public void print() {
		System.out.println("�л��Դϴ�.");
	}
	
	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�.");
	}
}

public class main{
	public static void main(String[] args) {
		Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Worker p = new Worker();
		p.print();
		p.eat();
	}
}