package work;

import java.util.*;

public class main {
	public static void main(String[] args) {
		System.out.print("�Է�: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		StringTokenizer st = new StringTokenizer(s, " .");
		System.out.println("�ܾ�� : " + st.countTokens());

		String[] arr = new String[st.countTokens()];// �迭 ����
		int i = 0;
		while (st.hasMoreTokens()) {
			arr[i] = st.nextToken();
			i++;
		}
		Arrays.sort(arr);

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + ",");
		}

	}
}
