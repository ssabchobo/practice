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
		
		String[] names = {"김철수", "김영희", "이돌쇠", "이막둥", "박멍돌"};
		String[] depts = {"컴퓨터공학과", "컴퓨터공학과", "전자공학과", "전기공학과", "정보공학과"};
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
			System.out.println("학생을 검색하려면 학번을, 종료하려면 q를 입력하세요: ");
			String str1 = in.next();
			if (str1.equals("q")) {
				System.out.println("종료");
				break;
			} else {
				Student str2 = map.get(str1);
				if (str2 == null) {
					System.out.println("해당학생없음");
				} else {
					System.out.println(str2);
				}
			}
		}
		
	}
}