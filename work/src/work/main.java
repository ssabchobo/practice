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
		main yourSong = new main("강남스타일");
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("너 노래는 "+ yourSong.getTitle());
	}
}