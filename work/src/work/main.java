package work;

import java.util.*;

class Student{
	private String name;
	private String dept;
	private String sNo;
	
	public Student(String name, String dept, String sNo) {
		this.name = name;
		this.dept = dept;
		this.sNo = sNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dept=" + dept + ", sNo=" + sNo + "]";
	}
}

public class main{
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		Scanner in = new Scanner(System.in);
		
		String[] names = {"��ö��", "�迵��", "�̵���", "�̸���", "�ڸ۵�"};
		String[] depts = {"��ǻ�Ͱ��а�", "��ǻ�Ͱ��а�", "���ڰ��а�", "������а�", "�������а�"};
		String[] stuNos = {"20180001", "20180002", "20180003", "20180004", "20180005"};
		
		String inputname,inputdept,inputstuNos;
		
		for(int i=0;i<5;i++) {
			inputname = names[i];
			inputdept = depts[i];
			inputstuNos = stuNos[i];
			Student newarr = new Student(inputname,inputdept,inputstuNos);
			//System.out.println(newarr);
			map.put(inputstuNos,newarr);
		}

		while (true) {
			System.out.println("�л��� �˻��Ϸ��� �й���, �����Ϸ��� q�� �Է��ϼ���: ");
			String str1 = in.next();
			if (str1.equals("q")) {
				System.out.println("����");
				break;
			} else {
				Student str2 = map.get(str1);
				if (str2 == null) {
					System.out.println("�ش��л�����");
				} else {
					System.out.println(str2);
				}
			}
		}
		
	}
}