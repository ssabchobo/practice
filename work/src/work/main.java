package work;

import java.util.*;

public class main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�Է�: ");
		String s = in.nextLine();
		
		StringTokenizer st = new StringTokenizer(s," .");
		
		System.out.println(st.countTokens());
		String[] arr = new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreTokens()) {
			arr[i] = st.nextToken();
			i++;
		}
		Arrays.sort(arr);
		System.out.println("���ĵ� ��ū: ");
		int j=0;
		while(j < arr.length) {
			System.out.println(arr[j]);
			j++;
		}
	}
	
}