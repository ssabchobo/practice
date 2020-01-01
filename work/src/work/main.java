package work;

import java.util.*;

public class main{
	public static void main(String[] argc) {
		Scanner in = new Scanner(System.in);
		System.out.print("인원수>> ");
		int p = in.nextInt();
		Phone [] r = new Phone[p];
		for(int i=0;i<p;i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>> ");
			r[i] = new Phone(in.next(),in.next());
		}
		System.out.println("저장되었습니다...");
		
		while (true) {
			System.out.print("검색할 이름>> ");
			String n = in.next();
			if(n.equals("exit")) {
				break;
			} else {
				for (int i = 0; i < p; i++) {
					if (n.equals(r[i].getName())) {
						System.out.println(n + "의 번호는" + r[i].getTel() + "입니다");
					}
				}
			}
		}
	}
}

class Phone{
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}