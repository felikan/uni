package Klausur_Uebung;

public class Launcher {
    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println(os);

        Double r = Math.random();
        System.out.println(r);
        Double t = r*10; 
        Double d = (Double) (Math.round(t*10.0 ) / 10.0) ;
        String s = d.toString();
        String v = os + " " + s;
        System.out.println("Betriebsystem: " + v);


    }
}