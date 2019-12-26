package work;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int intarray[] = new int[10];
		int sum=0;
		System.out.print("정수 10개 입력 : ");
		for (int i=0; i < intarray.length;i++) {
			intarray[i] = scan.nextInt();
		}
		
		for(int i=0;i<intarray.length;i++) {
			if(intarray[i]%3==0) {
				sum = sum + intarray[i];
			}
		}
		System.out.printf("합계 : %d\n",sum);
	}
}
		