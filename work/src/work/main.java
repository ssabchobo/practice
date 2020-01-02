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
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			
			while(true) {
				int input;
				System.out.println(low + "-" + high);
				System.out.print(step+1+">>");
				input = in.nextInt();
				
				if(input<number) {
					System.out.println("더 높게");
					low = input;
				}
				else if(input<number) {
					System.out.println("더 낮게");
					high = input;
				}else {
					System.out.println("맞았습니다.");
					break;
				}
				step ++;
			}
			System.out.print("다시 하시겠습니까(y/n)>>");
			String answer = in.next();
			if(answer.contentEquals("n")) {
				break;
			}
		}
	}
}