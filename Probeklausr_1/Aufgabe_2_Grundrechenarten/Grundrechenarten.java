package KLausur_Uebung_2;

import java.util.Scanner;

public class Grundrechenarten {
              
    public static void main(String[] args) {
        String quit = "n";
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println ("Geben Sie bitte eine Zahl ein:");
        int i = sc.nextInt(); 
        System.out.println ("Geben Sie bitte eine zweite Zahl ein:");
        int j = sc.nextInt();  
        System.out.println ("Geben Sie bitte einen Operator ein:");
        String z = sc.next();
        int r = 0;
        
        switch (z) {
            case "+": r = i+j; 
                     break;
            case "-": r = i-j; 
                     break;
            case "/": r = i/j; 
                     break;
            case "*": r = i*j; 
                     break;
           
            default: ;
           
        }
        System.out.println(r);
        System.out.println("Möchten sie das Programm beenden? j = ja = n =nein");
        quit =sc.next();
    } while (quit.equals("n"));
        sc.close();
    }
}
