package work;

import java.util.*;

public class main {
	public static void main(String[] args) {
		String s = "Empty vessels make the most sound";
		System.out.println("�Է�: " + s);
		StringTokenizer st = new StringTokenizer(s, " ");
		String[] a = new String[st.countTokens()];
		System.out.println("�ܾ� ����: " + st.countTokens());
		for (int i = 0; i < a.length; i++) {
			a[i] = st.nextToken();
		}
		
		System.out.print("���ĵ� ��ū: ");
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ,");
		}
//    while (st.hasMoreTokens()) {
//       System.out.print(st.nextToken() + ", ");
//    }
	}
}
