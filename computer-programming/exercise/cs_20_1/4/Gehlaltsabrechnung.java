package cs20_1_4;

public class Gehlaltsabrechnung {
	
	private static final int Mitarbeiter_Anzahl = 4;
	private static Mitarbeiter[] mitarbeiter;
	private static double bruttosumme;
	
	public static void main(String[] args) {
		Gehlaltsabrechnung.mitarbeiter = new Mitarbeiter[Mitarbeiter_Anzahl];
		Gehlaltsabrechnung.mitarbeiter[0] = new Arbeiter();
		Gehlaltsabrechnung.mitarbeiter[1] = new Arbeiter();
		Gehlaltsabrechnung.mitarbeiter[2] = new Angestellter();
		Gehlaltsabrechnung.mitarbeiter[3] = new Manager();

		Gehlaltsabrechnung.mitarbeiter[0].name = "Theo";
		Gehlaltsabrechnung.mitarbeiter[1].name = "Friedrich";
		Gehlaltsabrechnung.mitarbeiter[2].name = "Theodor";
		Gehlaltsabrechnung.mitarbeiter[3].name = "Wilhelm";
		
		((Arbeiter) Gehlaltsabrechnung.mitarbeiter[0]).stundenlohn = 20;
		((Arbeiter) Gehlaltsabrechnung.mitarbeiter[0]).stundenanzahl = 8;
		((Arbeiter) Gehlaltsabrechnung.mitarbeiter[0]).schichtzulage = 10;
		
		for (int i = 0; i <mitarbeiter.length; i++) {
			Gehlaltsabrechnung.bruttosumme += 
					Gehlaltsabrechnung.mitarbeiter[i].berechneMonatsBrutto();
		}
		System.out.println("Bruttosumme: " + Gehlaltsabrechnung.bruttosumme);
		
	}
}
abstract class Mitarbeiter {
	
	int personalnummer;
	String name;
	
	Mitarbeiter() {
		
	}
	
	abstract double berechneMonatsBrutto();
}

class Arbeiter extends Mitarbeiter{
	double stundenlohn;
	double stundenanzahl;
	double schichtzulage;
	
	@Override
	double berechneMonatsBrutto() {
		return this.stundenlohn * this.stundenanzahl + this.schichtzulage;
	}

	}

class Angestellter extends Mitarbeiter{
	
	double grundgehalt;
	double ortszuschlag;
	double zulage;
	

	@Override
	double berechneMonatsBrutto() {
		return this.grundgehalt + this.ortszuschlag + this.zulage;
	} 
}

class Manager extends Mitarbeiter{
	
	double fixgehalt;
	double provision;
	double umsatz;
	

	@Override
	double berechneMonatsBrutto() {
		// TODO Auto-generated method stub
		return this.fixgehalt + this.umsatz * this.provision / 100;
	}

}