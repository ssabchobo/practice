package work;

import java.util.*;

public class main {
	public static void main(String[] args) {
		foo("�ȳ�", 1);
		foo("�ȳ��ϼ���", 1, 2);
		foo("�� �־�");
	}
	
	public static void foo(String a, int b) {
		System.out.println(a+" "+b);
	}
	
	public static void foo(String a, int b, int c) {
		System.out.println(a+" "+b+" "+c);
	}
	
	public static void foo(String a) {
		System.out.println(a);
	}
}