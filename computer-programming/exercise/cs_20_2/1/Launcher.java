package cs2020_2_1;

public class Launcher {

	public static void main(String[] args) {
		String os = System.getProperty("os.name");
		double r = Math.random();
		double t= r*10;
		double d= Math.round(t);
		String s = String.valueOf(d);
		String v = os + " "+ s;
		System.out.println("Betriebssystem: "+v);
	}

}
