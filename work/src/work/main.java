package work;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int low,high;
		int number;
		
		while(true) {
			int step = 0;
			low = 0;
			high = 99;
			
			number = r.nextInt(100);
			
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
			
			while(true) {
				int input;
				System.out.println(low + "-" + high);
				System.out.print(step+1+">>");
				input = in.nextInt();
				
				if(input<number) {
					System.out.println("�� ����");
					low = input;
				}
				else if(input<number) {
					System.out.println("�� ����");
					high = input;
				}else {
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}
				step ++;
			}
			System.out.print("�ٽ� �Ͻðڽ��ϱ�(y/n)>>");
			String answer = in.next();
			if(answer.contentEquals("n")) {
				break;
			}
		}
	}
}