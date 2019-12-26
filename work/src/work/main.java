package work;

import java.util.*;

public class main {
	public static void main(String[] args) {
		String grade;
		Scanner scan = new Scanner(System.in);
		System.out.print("학점 입력 : ");
		grade = scan.next();
		
		switch(grade) {
		case "A":
		case "B":
			System.out.print("Excellent");
			break;
		case "C":
		case "D":
			System.out.print("Good");
			break;
		case "F":
			System.out.print("Bye");
			break;
		default :
			System.out.print("잘못된 입력");
			break;
		}
	}
}