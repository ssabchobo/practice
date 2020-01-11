package work;

import java.util.*;

abstract class Controller{	
	boolean power;
	
	public Controller(boolean power) {
		this.power = power;
	}
	public void show() {
		if(power) {
		System.out.println(getName()+"가 켜졌습니다.");
		}else if(!power) {
			System.out.println(getName()+"가 꺼졌습니다.");
		}
	}
	abstract String getName();
}

class TV extends Controller{
	
	public TV(boolean power) {
		super(power);
	}
	public String getName() {
		return "TV";
	}
}
class Radio extends Controller{
	public Radio(boolean power) {
		super(power);
	}
	public String getName() {
		return "Radio";
	}
}
public class main{
	public static void main(String[] args) {
        Controller[] c = { new TV(false), new Radio(true) };
 
        for (Controller controller : c) {
            controller.show();
        }
    }
}
