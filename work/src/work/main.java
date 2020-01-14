package work;

import java.util.*;

interface Printable{
	void showPaper();
}

class A4 implements Printable{
	public void showPaper() {
		System.out.println("A4");
	}
}

class B5 implements Printable{
	public void showPaper() {
		System.out.println("B5");
	}
}

class Call{
	public void invoke(Printable p){
		p.showPaper();
		}
}

public class main{
	public static void main(String[] args) {
		Printable[] printers = new Printable[2];
		printers[0] =  new A4();
		printers[1] =  new B5();
		
		Call c = new Call();
		for(Printable printer: printers) {
			c.invoke(printer);
		}
	}
}