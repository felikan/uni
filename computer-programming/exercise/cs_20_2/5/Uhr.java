package cs20_2_5;

public class Uhr implements Steuerung {

	private Anzeige anzeige;
	
	public Uhr(Uhrwerk u, Anzeige a) {
		
	}
	public void aktivieren() {
		
		this.anzeige.zeigeZeit();
		
	}
	
	public void beenden() {
		
	}
}
