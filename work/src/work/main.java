package work;

import java.util.*;

public class main{
	public static void main(String[] args) {
		String s = new String("hi");
		System.out.println(s.hashCode());
		s = s + "!";
		System.out.println(s.hashCode());
		
		StringBuilder sb = new StringBuilder ("hi");
		System.out.println(sb.hashCode());
		sb = sb.append("!");
		System.out.println(sb.hashCode());
		
		System.out.println(sb.replace(1,2,"Good bye"));
		
	}
	
}