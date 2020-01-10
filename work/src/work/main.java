package work;

import java.util.*;

interface Animal{
	void sound();
}

class Dog implements Animal{
	public void sound(){
		System.out.println("¸Û¸Û");
	}
}

public class main{
	public static void main(String[] args) {
		Dog d = new Dog();
		
		makeSound(d);
	}
	
	static void makeSound(Animal a) {
		a.sound();
	}
}