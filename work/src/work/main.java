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
			System.out.println("URL을 입력하세요 : ");
			result = in.next();
			
			if(result.equals("bye")) {
				break;
			}
			
			if(result.endsWith(a)) {
				System.out.println(result+"은 '"+a+"' 으로 끝납니다.");
			}
			else if(result.endsWith(b)) {
				System.out.println(result+"은 '"+b+"' 으로 끝납니다.");
			}else {
				continue;
			}
		}	
	}
}