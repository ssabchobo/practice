package work;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int intarray[] = new int[5];
		System.out.print("5���� ���� �Է� : ");
		for (int i=0; i < intarray.length;i++) {
			intarray[i] = scan.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(intarray[i]+" : ");
			for (int j = 0; j < intarray[i]; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
		