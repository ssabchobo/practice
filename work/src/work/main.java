package work;

import java.util.*;

public class main{
	public static void main(String[] argc) {
		Scanner in = new Scanner(System.in);
		Rect []r=new Rect[4];
		for(int i=0;i<4;i++) {
			System.out.print(i+1);
			System.out.print("너비와 높이 >> ");
			int width = in.nextInt();
			int heigth = in.nextInt();
			r[i] = new Rect(width,heigth);
		}
		System.out.print("저장하였습니다.");
		int sum = 0;
		for(int i=0;i<r.length;i++) {
			sum += r[i].getArea();
		}
		System.out.println("사각형의 전체의 합은 "+sum);
	}
}

class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getArea() {
		return width*height;
	}
}