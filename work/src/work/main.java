package work;

import java.util.*;

public class main {
	public static void main(String[] args) {
		int result =0;
		int i=0;
		
		while(result<100) {
			i++;
			if(i%2==0) {
				result -= i;
			}else {
				result += i;
			}
		}
		System.out.println("i="+i+", result="+result);
	}
}