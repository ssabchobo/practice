package work;

import java.util.*;

public class main{
	public static void main(String[] argc) {
		// 2�����迭 ����� ���ÿ� �ʱ�ȭ
        int[][] ar = { { 10, 20 }, { 30, 40 },{50,60} };
        int i, j;
        
        // ��� ���� ����ϱ����� �ݺ��� 2
        for (i = 0; i < ar.length; i++) 
        {
            for (j = 0; j < ar[i].length; j++)
                System.out.print("  " + ar[i][j]);
            System.out.println();
        }
	}
}