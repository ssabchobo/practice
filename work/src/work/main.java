package work;

import java.util.*;

public class main{
	public static void main(String[] argc) {
		Scanner in = new Scanner(System.in);
		System.out.print("�ο���>> ");
		int p = in.nextInt();
		Phone [] r = new Phone[p];
		for(int i=0;i<p;i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>> ");
			r[i] = new Phone(in.next(),in.next());
		}
		System.out.println("����Ǿ����ϴ�...");
		
		while (true) {
			System.out.print("�˻��� �̸�>> ");
			String n = in.next();
			if(n.equals("exit")) {
				break;
			} else {
				for (int i = 0; i < p; i++) {
					if (n.equals(r[i].getName())) {
						System.out.println(n + "�� ��ȣ��" + r[i].getTel() + "�Դϴ�");
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