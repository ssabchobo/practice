package work;

import java.util.*;

public class main{
	public static void main(String[] argc) {
		// 2차원배열 선언과 동시에 초기화
        int[][] ar = { { 10, 20 }, { 30, 40 },{50,60} };
        int i, j;
        
        // 행과 열을 출력하기위해 반복문 2
        for (i = 0; i < ar.length; i++) 
        {
            for (j = 0; j < ar[i].length; j++)
                System.out.print("  " + ar[i][j]);
            System.out.println();
        }
	}
}