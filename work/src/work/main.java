package work;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String result;
		String a = "com";
		String b = "java";
		String c = "bye";
		
		while(true) {
			System.out.println("URL�� �Է��ϼ��� : ");
			result = in.next();
			
			if(result.equals("bye")) {
				break;
			}
			
			if(result.endsWith(a)) {
				System.out.println(result+"�� '"+a+"' ���� �����ϴ�.");
			}
			else if(result.endsWith(b)) {
				System.out.println(result+"�� '"+b+"' ���� �����ϴ�.");
			}else {
				continue;
			}
		}	
	}
}