package Probeklausur_2.Menüauswahl;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        try {                                   //Versucht Showmenu aufzurufen fängt Fehler wie Pingexzeption ab damit Programm nicht abstürzt
            showmenu(); }                      //Showmenu wird aufgerufen siehe weiter Unten 
        catch (Pingexception e) {
            System.out.println(" Pingexception wurde Aufgefangen"); 
         }
         catch (Pongexception e) {
            System.out.println(" Pongexception wurde Aufgefangen");
         }
         catch (PingPongException e) {
            System.out.println(" PingPongexception wurde Aufgefangen"); }
    }

    public static void pingpong() throws PingPongException {               //Mehtode Pingpong
        System.out.print("Die Methode pingpong wurde aufgerufen");
        throw new PingPongException();
    }

    public static void ping() throws Pingexception {                        //Methode Ping
        System.out.print("Die Methode ping wurde aufgerufen");
        throw new Pingexception();
    }

    public static void pong() throws Pongexception {                       //Methode Pong
        System.out.print("Die Methode pong wurde aufgerufen");
        throw new Pongexception();
    }

    public static void showmenu() throws Pongexception, PingPongException, Pingexception {  //Auswahlmöglichkeiten für Benutzer werden in Methode Showmenu gepackt
        System.out.println ("Bitte wählen Sie zwischen folgenden Auswahlmöglichkeiten: ");
        System.out.println ("1-Ping");
        System.out.println ("2-Pong");
        System.out.println ("3-Pingpong");
        Scanner input = new Scanner(System.in);                       // Scanner um Eingabe des Benutzers einzuscannen (erkennt nur Integer also ganzahlige Zahlenwerte)
        int auswahl = input.nextInt();
        input.close();                                                  //Scanner Objekt wird als Ressource wieder freigegeben 

        switch (auswahl) {                                              //eigegebener Zahlenwert (Integer) wird per Switch unterschieden 
            case 1:
                ping();                                                 // Eingabe 1 = Methode Ping wird aufgerufen 
                break;
            case 2:                                                    // Eingabe 2 = Methode Pong wird aufgerufen 
                pong();
                break;
            case 3:                                                     // Eingabe 3 = Methode PingPong  wird aufgerufen                 
                pingpong();
                break;

            default :                                                   //default falls keine Korrekte Eingabe des Zahlenwertes die Vorgegeben sind siehe Auswahlmöglichkeiten
                System.err.println("Fehlerhafte Eingabe");              // Fehlerhafte Eingabe wird über Fehlerkonsole ausgeben nicht über Terminal in VS Code aber über normales Terminal
        }

     
    }
    
}
