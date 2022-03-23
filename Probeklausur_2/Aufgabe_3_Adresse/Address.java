package Probeklausur_2;


public class Address { //Klasse Address erstellen mit den Variablen
    String name;
    String strasze;
    String ort;

    public Address(String name, String strasze, String ort) { //Konstruktor erstellen 
        this.name=name;
        this.strasze=strasze;
        this.ort=ort;
    }
   
    public String getname() {  //Getmethoden für einzelne Variablen
        return this.name;
    }

    public String getstrasze() {
        return this.strasze;
    }

    public String getort() {
        return this.ort;
    }
    @Override                                           //überschreiben der geerbten to String methode wird von Oberster Klasse automatisch vererbt 
    public String toString() {
        return name + ", " + ort + ", " + strasze;
    }
   
    
}

