package work;

import java.util.*;

abstract class Converter{
	protected double ratio;

	public Converter(double ratio) {
		this.ratio = ratio;
	}
	
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"을"+getDestString()+"로 바꿉니다.");
		System.out.println(getSrcString()+"을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.printf("변환결과: %.2f %s입니다.\n",res,getDestString());
	}
}

class Won2Dollar extends Converter{
	
	public Won2Dollar(double ratio) {
		super(ratio);
	}

	public double convert(double src) {
		return ratio*src;
	}
	public String getSrcString() {
		return "원";
	}
	public String getDestString() {
		return "달러";
	}
}

class Km2Mile extends Converter{
	
	public Km2Mile(double ratio) {
		super(ratio);
	}
	public double convert(double src) {
		return src/ratio;
	}
	public String getSrcString() {
		return "Km";
	}
	public String getDestString() {
		return "Mile";
	}
}

public class main{
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
		
		Km2Mile toMile = new Km2Mile(1.609);
		toMile.run();
	}
}