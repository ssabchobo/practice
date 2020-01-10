package work;

import java.util.*;

interface Controllable{
	default void repair() {
		System.out.println("��� �����Ѵ�.");
	}
	static void reset() {
		System.out.println("��� �ʱ�ȭ�Ѵ�.");
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
		System.out.println("TV�� �Ҵ�");
	}
	public void turnOff() {
		System.out.println("TV�� ����");
	}
}

class Computer implements Controllable{
	public void turnOn() {
		System.out.println("Computer�� �Ҵ�");
	}
	public void turnOff() {
		System.out.println("Computer�� ����");
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

