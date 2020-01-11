package work;

import java.util.*;

interface Talkable{
	void talk();
}

class Korean implements Talkable{
	public void talk() {
		System.out.println("æ»≥Á«œººø‰!");
	}
}

class American implements Talkable{
	public void talk() {
		System.out.println("Hello!");
	}
}

public class main{
	static void speak(Talkable a) {
		a.talk();
	}
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
}

