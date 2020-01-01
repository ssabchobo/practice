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
		
		System.out.print("이름과 전화번호 입력>> ");
		main a1 = new main(in.next(),in.next());
		System.out.print("이름과 전화번호 입력>> ");
		main a2 = new main(in.next(),in.next());
		
		System.out.println(a1.name + "의 번호"+a1.tel);
		System.out.println(a2.name + "의 번호"+a2.tel);
	}
}
