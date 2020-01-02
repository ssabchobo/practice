package work;

import java.util.*;

public class main {
	public static int sum(int a, int b, int c) {
		return b+c;
	}
	
	public static int sum(int a,int... arr) {
		int sum =0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sum(1,2,3));
		int arr[] = {2,3};
		System.out.println(sum(1,arr));
	}
}