package Probeklausur_2;

public class Quadrat {
    public static void main(String[] args) {
        long lang = 16;
        System.out.println(Long.toString(lang)); // Unformung von Long zu String
        for (int i = 1; i < 6; i++) {
            lang = lang*lang;
            System.out.println(lang);
        }
    }
}
