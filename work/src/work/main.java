package work;

import java.util.*;

public class main{
	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		
		StringTokenizer st = new StringTokenizer(s," ,");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
	
}