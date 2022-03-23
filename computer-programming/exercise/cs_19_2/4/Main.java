package cs_19_2_4;

public class Main {

	public static void main(String[] args) {
		MetallPlatte mp1 = new MetallPlatte(2,4);
		MetallPlatte mp2 = new MetallPlatte(2,4);
		MetallPlatte mp3 = new MetallPlatte(1,3);
		
		String s1 = mp1.vergleicheMit(mp2);
		String s2 = mp1.vergleicheMit(mp3);
		System.out.println("Vergleich von Mp1 und Mp2: "+"Mp1 "+s1+" Mp2");
		System.out.println("Vergleich von Mp1 und Mp3: "+"Mp1 "+s2+" Mp3");
	}

}
