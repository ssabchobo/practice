package work;

import java.util.*;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("사람 ( 이름 = "+ name+", 나이 = "+age);
	}
}

class Student extends Person{
	int number;

	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
	}
	public void show() {
		System.out.println("사람 ( 이름 = "+ name+", 나이 = "+age+", 학번 = "+number);
	}
}

class ForeignStudent extends Student{
	String nation;

	public ForeignStudent(String name, int age, int number, String nation) {
		super(name, age, number);
		this.nation = nation;
	}	
	public void show() {
		System.out.println("사람 ( 이름 = "+ name+", 나이 = "+age+", 학번 = "+number+", 국적 = "+nation);
	}
}

public class main{
	public static void main(String[] args){
		Person[] p = new Person[3];
		
		p[0] = new Person("길동이",22);
		p[1] = new Student("황진이",23,100);
		p[2] = new ForeignStudent("amy",24,200,"U.S.A");
		
		for(Person p1:p) {
			p1.show();
		}
	}
}