package work;

import java.util.*;

public class main{
	private String title;
	
	
	public main(String title) {
		this.title = title;
	}
	
	private String getTitle() {
		return title;
	}
	
	public static void main(String[] argc) {
		main mySong = new main("Let it go");
		main yourSong = new main("������Ÿ��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� "+ yourSong.getTitle());
	}
}