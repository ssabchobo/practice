package work;

import java.util.*;

interface Movable{
	void move (int x);
}

class Car implements Movable{
	private int pos = 0;
	
	public void move(int x) {
		pos += x;
	}
	
	public void show() {
		System.out.println(pos+"m 이동했습니다.");
	}
}
public class main{
	public static void main(String[] args) {
		/*Car c = new Car();
		
		c.move(5);
		c.show();*/
		Movable m = new Car();
		m.move(6);
		Car c = (Car)m;
		c.move(10);
		c.show();
		
	}
}