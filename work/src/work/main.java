package work;

import java.util.*;

interface Controllable{
	default void repair() {
		System.out.println("장비를 수리한다.");
	}
	static void reset() {
		System.out.println("장비를 초기화한다.");
	}
	
	void turnOn();
	void turnOff();
}

interface RemoteControllable extends Controllable{
	void remoteOn();
	
	void remoteOff();
}

class TV implements Controllable{
	public void turnOn() {
		System.out.println("TV를 켠다");
	}
	public void turnOff() {
		System.out.println("TV를 끈다");
	}
}

class Computer implements Controllable{
	public void turnOn() {
		System.out.println("Computer를 켠다");
	}
	public void turnOff() {
		System.out.println("Computer를 끈다");
	} 
}

public class main{
	public static void main(String[] args) {
		Controllable[] controllable = { new TV(), new Computer()};
		
		for(Controllable c : controllable) {
			c.turnOn();
		}
		Controllable.reset();
	}
	
}

