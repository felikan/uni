package cs16_2_3;

public class Main {

	public static void main(String[] args) {
		String cmd = args[0];
		int max = Integer.valueOf(args[1]);
		if (cmd.equals("String")) {
		Main.teststring(max);}
		else if (cmd.equals("Stringbuilder")) {
		Main.stringbuilder(max);}
		else if (cmd.equals("Stringbuffer")) {
		Main.stringbuffer(max);}

	}
	static void teststring(int n) {
		String s = "";
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s=s+"x";
		}
		long t2 = System.currentTimeMillis();
		long t = t2-t1;
		System.out.println("String: "+t);
	}
	static void stringbuilder(int n) {
		String s = "";
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s=s+"x";
		}
		long t2 = System.currentTimeMillis();
		long t = t2-t1;
		System.out.println("String: "+t);
	}
	static void stringbuffer(int n) {
		String s = "";
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s=s+"x";
		}
		long t2 = System.currentTimeMillis();
		long t = t2-t1;
		System.out.println("String: "+t);
	}
}
