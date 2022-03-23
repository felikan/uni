package Klausur_Uebung_4;

public class Grussformel {

    public static void main(String[] args) {

        System.out.println(greet(true));
        System.out.println(greet(false));
    }

    static String greet(boolean evening) {

        String s = "Guten Tag!";

        if (evening) {
            s = "Guten Abend!";
        }
        return s;

    }
}