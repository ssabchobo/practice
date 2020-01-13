package work;

import java.util.*;

class Car{
	String color;
	int speed;
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

	public void upSpeed(int up){
		if(speed<=300&&speed>=0) {
			speed += up;
		}else{
			speed =300;
		}
	}
    public void downSpeed(int down){
    	if(speed<=300&&speed>=0) {
    		speed -= down;
    		if(speed<0) {
    			speed=0;
    		}
		}else{
			speed =0;
		}	
    }
}

class Sedan extends Car{
	int seatNum;

	public Sedan(String color, int speed, int seatNum) {
		super(color, speed);
		this.seatNum = seatNum;
	}

	public int getSeatNum() {
		return seatNum;
	}	
}

class Truck extends Car{
	int capacity;

	public Truck(String color, int speed, int capacity) {
		super(color, speed);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}	
}

public class main{
	public static void main(String[] args){
		Sedan sedan1 = new Sedan("레드",0,5);
		Truck truck1 = new Truck("블루",0,50);
		
		sedan1.upSpeed(150);
		sedan1.downSpeed(200);
		truck1.upSpeed(150);
		truck1.upSpeed(200);
		
		System.out.printf("승용차의 색상은 %s, 속도는 %dkm, 좌석수는 %d개 입니다.\n",sedan1.getColor(),sedan1.getSpeed(),sedan1.getSeatNum());
		System.out.printf("트럭의 색상은 %s, 속도는 %dkm, 적재량은 %d개 입니다.\n",truck1.getColor(),truck1.getSpeed(),truck1.getCapacity());
		
	}
}