package work;

import java.util.*;

public class main{
	public static void main(String[] argc) {
		Name name = new Name("È«±æµ¿","ÀÓ²©Á¤");
		System.out.println(name.getMyName()+name.getYourName());
	}
}

class Name{
	String myName;
	String yourName;
	public Name(String myName,String yourName) {
		setName(myName,yourName);
	}
	public String getMyName() {
		return myName;
	}
	public String getYourName() {
		return yourName;
	}
	public void setName(String myName,String yourName) {
		this.myName=myName;
		this.yourName=yourName;
	}
}
