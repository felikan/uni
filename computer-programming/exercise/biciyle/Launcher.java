package bicycle;

public class Launcher {

	public static void main(String[] args) {
		
		System.out.println("Startup");
		
		Mountainbike b = new Mountainbike();
		b.changeGear(2);
		b.speedUp(10);
		b.changeCadence(3);
		b.applybreaks(6);
		
		
		System.out.println(b.toString());

	}

}
