package Probeklausur_2;

public class Launcher_Metallplatte {
    
    public static void main(String[] args) {
    Metallplatte mp1 =new Metallplatte(4, 5);
    Metallplatte mp2 =new Metallplatte(4, 5);
    Metallplatte mp3 =new Metallplatte(2, 3);
    String r1= mp1.vergleichemit(mp2);
    String r2= mp1.vergleichemit(mp3);
    System.out.println (r1);
    System.out.println (r2);
    }
    
}
