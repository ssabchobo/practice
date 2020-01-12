package work;

import java.util.*;

public class main{
	public static void main(String[] args) {
		int[] src = new int[] {1,2,3,4,5,6};
		int[] dst = new int[] {100,200,300,400,500,600,700};
		
		System.arraycopy(src,1,dst,3,3);
		for(int i = 0; i<dst.length;i++) {
			System.out.print(dst[i]+" ");
		}
		System.out.println();
	}
	
}