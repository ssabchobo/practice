package work;

import java.util.*;

public class main {
	/*public static void printBig(Vector<Integer>v) {
		int big = v.get(0);
		for(int i = 0;i<v.size();i++) {
			if(big<v.get(i)) {
				big = v.get(i);
			}
		}
		System.out.println(big);
	}*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("정수 -1이 입력될때까지 >> ");
		while(true) {
			int n = in.nextInt();
			if(n==-1) {
				break;
			}
			v.add(n);
		}
		int big = v.get(0);
		for(int i = 0;i<v.size();i++) {
			if(big<v.get(i)) {
				big = v.get(i);
			}
		}
		System.out.println(big);
	}
}