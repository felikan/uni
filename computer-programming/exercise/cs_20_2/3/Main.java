package cs2020_2_3;

public class Main {

	public static void main(String[] args) {
		String s="Ostereier suchend hoppelte das Häschen durch den weißen Schnee,\r\n"
				+ "juchhe!";
		System.out.println(s);
		s=s.replace("den weißen Schnee","das grüne Gras");
		System.out.println(s);
		String[] result =s.split("\\s");
		System.out.println(result.toString());

	}

}
