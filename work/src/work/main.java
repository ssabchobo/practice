package work;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int []arr = new int[10];
		
		System.out.println("숫자를 10개 입력하시오.");
		for(int i=0;i<10;i++) {
			a = in.nextInt();
			if(a>=0) {
				arr[(a)/10]++;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.printf("%d~%d : ",(i*10),((i+1)*10)-1);
			for(int j=0;j<arr[i];j++) {
				
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}