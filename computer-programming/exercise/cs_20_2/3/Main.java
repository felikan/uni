package cs2020_2_3;

public class Main {

	public static void main(String[] args) {
		String s="Ostereier suchend hoppelte das H�schen durch den wei�en Schnee,\r\n"
				+ "juchhe!";
		System.out.println(s);
		s=s.replace("den wei�en Schnee","das gr�ne Gras");
		System.out.println(s);
		String[] result =s.split("\\s");
		System.out.println(result.toString());

	}

}
