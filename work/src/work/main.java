package work;

import java.util.*;

public class main{
	private String name,tel;
	public  main(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public String gettel() {
		return tel;
	}
	public static void main(String[] argc) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�̸��� ��ȭ��ȣ �Է�>> ");
		main a1 = new main(in.next(),in.next());
		System.out.print("�̸��� ��ȭ��ȣ �Է�>> ");
		main a2 = new main(in.next(),in.next());
		
		System.out.println(a1.name + "�� ��ȣ"+a1.tel);
		System.out.println(a2.name + "�� ��ȣ"+a2.tel);
	}
}
