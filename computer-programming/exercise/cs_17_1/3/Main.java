package cs17_1_3;

public class Main {

	public static void main(String[] args) {
		
		double d1 = round(1234.56789,0);
		System.out.println(d1);
		double d2 = round(123.456789f,2);
		System.out.println(d2);
	}
	static double round(double a, int digits) {
		int b = (int) Math.pow(10, digits);
		a = Math.round(a * b) / b;
		return a;
	}
	static float round(float a, int digits) {
		int b =(int) Math.pow(10, digits);
		float x =(float) Math.round(a * b)/ b;
		return x;
	}
}
