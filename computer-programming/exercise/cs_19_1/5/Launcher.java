package cs_19_1_5;

public class Launcher {

	public static void main(String[] args) {
		Osternest o1 = new Osternest(10, 2);
		Osternest o2 = new Osternest(20, 20);
		System.out.println("Nest 1: " + o1.eier);
		System.out.println("Nest 2: "+ o2.eier);
		try {
			o1.hinzufuegen(o2);
		} catch (PlatzMangelException e) {
			System.err.println("Zu viele Eier für Nest 1");
		}

		System.out.println("Nest 1 nach hinzufügen: " + o1.eier);
		
		o1.fuellen();
		System.out.println("Nest 1 nach füllen:"+ o1.eier);
	}

}
