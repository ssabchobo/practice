package work;

import java.util.*;

public class main{
	public static void main(String[] args) {
		HashMap<String,String> dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("("+key+","+value+")");
		}
		System.out.println();
		Scanner in = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("찾고 싶은 단어?");
			String eng = in.next();
			String kor = dic.get(eng);
			if(kor == null) {
				System.out.println("없는 단어");
			}else {
				System.out.println(kor);
			}
		}
	}
}