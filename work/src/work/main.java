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
		System.out.println(getSrcString()+"��"+getDestString()+"�� �ٲߴϴ�.");
		System.out.println(getSrcString()+"�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.printf("��ȯ���: %.2f %s�Դϴ�.\n",res,getDestString());
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
		return "��";
	}
	public String getDestString() {
		return "�޷�";
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