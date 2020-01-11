package work;

import java.util.*;

interface Human{
	void eat();
	void print();
	
	static void echo() {
		System.out.println("야호!!!");
	}
}

class Worker implements Human{
	public void print() {
		System.out.println("인간입니다.");
	}

	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
}

class Student implements Human{
	int i;
	
	public Student(int i) {
		this.i = i;
	}
	
	public void print() {
		System.out.println("학생입니다.");
	}
	
	public void eat() {
		System.out.println("도시락을 먹습니다.");
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