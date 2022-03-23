package Probeklausur_2;

public class Array_Address { // Array erstellen von Typ Addresse
    public static void main(String[] args) {
        Address[] liste = new Address[5]; // Liste ist Variable den die Werte zugewiesen sind, Form (Siehe @override)
        liste[0] = new Address("Eric", "Penisallee", "Pimmelhausen");
        liste[1] = new Address("ric", "Penisallee", "Pimmelhausen"); // Array mit den Initialwerten Name, Straße, Ort
                                                                     // versehen.
        liste[2] = new Address("Janis", "Penisallee", "Pimmelhausen");
        liste[3] = new Address("c", "Penisallee", "Pimmelhausen");
        liste[4] = new Address("g", "Penisallee", "Pimmelhausen");
        print(liste); // Aufrufen der Statischen Methode = Ausgeben des Arrays (Siehe For each Schleife)
                      
        System.out.print(search(liste, "k")); //Aufrufen und ausgeben der Methode
    }

    public static void print(Address[] addresses) { // statische Methode von Array Addressses mit For each Schleife zum
                                                    // Ausgeben des Arrays
        for (Address a : addresses) {
            System.out.println(a);
        }
    }

    public static int search(Address[] addresses, String suchen) { // Hinzufügen von Paramehter Search, Integer soll Zurückgegeben werden, da Index
        for (int i =0; i<addresses.length; i++){ 
           if (addresses[i].getname().contains(suchen)) { //Schauen ob mein Suchwort in einem der Namen Vorhanden ist, wenn nicht dann wird das nächste durchsucht
               return i;                        
           }

       } 
       return -1; //Wern nichts gefunden wird return = -1 
    }
}
