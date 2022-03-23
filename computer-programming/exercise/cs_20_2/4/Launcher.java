package cs2020_2_4;

public class Launcher {
	static String greet(boolean evening) {
		String s="Guten Tag!";
		if (evening == true) {
			s="Guten Abend!";
			
		}
		return s;
	}
	public static void main(String[] args) {
		
		System.out.println(Launcher.greet(false));
		System.out.println(Launcher.greet(true));
		
	}

}
