package Probeklausur_2;

public class Metallplatte { //Klasse Metallplatte
    double laenge;
    double breite;



    public Metallplatte(double laenge, double breite) { //Konstruktor für Instanzvariablen
        this.breite = breite;
        this.laenge = laenge;
    }

    public double berechneflaeche () { //Methode berechne Flaeche
        return breite * laenge;    
    }

    public String vergleichemit(Metallplatte mp) {
        return this.berechneflaeche()>mp.berechneflaeche()? "größer als": "kleiner oder gleich"; //Lösung mit ternären Operator

    //Alternative wenn ohne ternären Operartor
    /*if (this.berechneflaeche() > mp.berechneflaeche()) {
            return "größer als";
        } else 
        return "kleiner als oder gleich zu";
        */
    
    }
}