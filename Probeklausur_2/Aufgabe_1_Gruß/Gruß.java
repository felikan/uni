package Probeklausur_2;

public class Gruß {
 
public static void main(String[] args) {
String [] grusStrings = {"Hallo","Guten Tag","Servus","Moin Moin"};
int zufall = (int) (Math.random()*4); // Mathrandom *4 da sonst nur Zahlen zwischen 0 und exklusive 1 rauskommen, da double 
System.out.print(grusStrings[zufall]);

}

}
