package work;

import java.util.*;

class GStack<T>{
	int tos;
	Object [] stck;
	public GStack() {
		tos =0;
		stck = new Object [10];
	}
	public void push(T item) {
		if(tos == 10) {
			return;
		}
		stck[tos] = item;
		tos ++;
	}
	public T pop() {
		if(tos==0) {
			return null;
		}
		tos--;
		return (T)stck[tos];
	}
}

public class main{
	public static void main(String[] args) {
		GStack<String> stringstack = new GStack<String>();
		stringstack.push("Seoul");
		stringstack.push("Busan");
		stringstack.push("LA");
		
		for(int i = 0; i<3;i++) {
			System.out.println(stringstack.pop());
		}
		
		GStack<Integer> Intstack = new GStack<Integer>();
		Intstack.push(1);
		Intstack.push(3);
		Intstack.push(5);
		
		for(int i = 0; i<3;i++) {
			System.out.println(Intstack.pop());
		}
	}
}
