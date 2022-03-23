package cs20_1_2;

public class Main {

	public static void main(String[] args) {
		Double arg = new Double (0.0);
		if (args.length==1) {
			arg = Double.valueOf(args[0]);
		}
		double d1 = arg.doubleValue();
		double d2 = 0.5;
		double sum = d1+d2;
		Double d = new Double(sum);
		System.out.println(d.toString());
		
		int i = 106;
		System.out.println("Dez: "+i);
		System.out.println("Dual: "+ Integer.toBinaryString(i));
		System.out.println("Oxal: "+ Integer.toOctalString(i));
		System.out.println("Hex: " + Integer.toHexString(i).toUpperCase());
		
	}

}
