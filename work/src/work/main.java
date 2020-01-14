package work;

import java.util.*;

public class main{
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		System.out.println("현재 시간은 "+ hour +"시 "+min+"입니다.");
		
	}
}
	