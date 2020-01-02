package work;

import java.util.*;

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
		/* a�� b�� ������ ���ο� �迭 ���� */
		int arr[] = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			arr[i] = a[i];
		}
		
		for(int i =0;i<b.length;i++) {
			arr[a.length+i] = b[i];
		}
		return arr;
	}

	public static void print(int[] a) {
		/* �迭 a ��� */
		System.out.print("[");
		for(int n : a) {
			System.out.print(n+" ");
		}
		System.out.print("]");
		}
}

public class main {
	public static void main (String[] args) {
		int [] array1 = {1, 3, 5, 7, 9};
		int [] array2 = {2, 4, 6, 8, 10};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}