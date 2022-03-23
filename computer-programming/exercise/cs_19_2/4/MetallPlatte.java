package cs_19_2_4;

public class MetallPlatte {
	
	double lange;
	double breite;
	
	public MetallPlatte(double l, double b) {
		this.lange = l;
		this.breite = b;
	}
	
	double berechneFlaeche() {
		return this.lange * this.breite;
	}
	String vergleicheMit(MetallPlatte mp) {
		return (this.berechneFlaeche() > mp.lange * mp.breite) 
		? "größer als"
		: "kleiner als oder gleich zu";
	}
}
