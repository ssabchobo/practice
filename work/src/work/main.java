package work;

import java.util.*;

class Animal{
	private String sound;
	public void sound() {
		this.sound = sound;
	}
}

class Cat extends Animal{
	public void sound() {
		System.out.println("�߿�");
	}
}
class Cock extends Animal{
	public void sound() {
		System.out.println("������");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("�۸�");
	}
}
class Duck extends Animal{
	public void sound() {
		System.out.println("�в�");
	}
}

public class main {
	public static void main(String[] args) {
		Animal animals[] = new Animal[4];
		
		animals[0] = new Cat();
		animals[1] = new Cock();
		animals[2] = new Dog();
		animals[3] = new Duck();
		
		for(Animal animal : animals) {
			animal.sound();
		}
	}
}