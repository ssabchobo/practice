package work;

import java.util.*;

class Alpha{
	public void foo(String a[]) {
		System.out.println("Alpha: foo");
	}
	public void bar(String a) {
		System.out.println("Alpha: bar");
	}
}
public class main extends Alpha{
	public void foo(String a) {
		System.out.println("Beta: foo");
	}
	public void bar(String a) {
		System.out.println("Beta: foo");
	}
	public static void main(String args[]) {
		Alpha a = new main();
		main b = (main)a;
		//a.foo("test");
		b.foo("test");
		a.bar("test");
		b.bar("test");
	}
}