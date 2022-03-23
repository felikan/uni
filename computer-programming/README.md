<h1>Rechnerprogrammierung</h1>

Framework:
-	 Aktiv 

Bibliothek:
-	Passiv

Java:
-	Java API als Verwendungsbibliothek
-	Dateiname = Klassenname= Konstruktoren
-	Kompilieren: javac name.java
-	Ausführen: java name 
-	Array: ```datentyp [] namearray```
-	Bsp.: ```String[] a```
-	Klasse: ```public class Klassenname{}``` mit Großbuchstabe
-	Hauptmethode (Prozedur/ Funktion): ```public static void main (){Quelltext} ```
-	Javadoc
-	Kommentare: 
```
/*
*
*```
*/
```
Oder
```//```
Oder für Java doc tool
```
/**
*@author Paul
*@version 1
*/
```
-	Java Api mit Java Klassen
-	Ausführen jar:
Java -jar hello.jar
-	Manifest Datei .txt:
- Main-Class: Hello
-	Jar zum verpacken von java Dateien:
- jar cvfm hello.jar Mainifest.txt *.class

String:
-	Zeichenkette
-	“string“
-	**Unveränderbar**, Literal, also nicht änderbar (hart Kodierte werte im Quelltext)
-	Neuen wert durch verarebitung eines alten Strings:
-	```s=s.replace;```
- ```String s = “blhddgd“;```
- String ist Klasse
- Strings in String Literal Table

Eclipse:
-	Packete sind Verzecihnisse
-	Templates: Str + Space
-	Main str+space ergibt main methode
-	Sysout ergibt ```System.Out.Println();```
-	Pixel: Picture Element
-	Voxel: Volume Element
-	Debug Modus:
-	Debug as
-	Debug ansicht
-	Schrittweise ausführen nach zeilen (Step Over)
-	Breakpoints beim Debuggen hilfreich

Int:
- Ganzzahlig
- ```int i;```
-	Default Wert 0
- 4 Byte reserviert
- Long
-	8 Byte reserviert
- ```int i = 12;```
-	Initialisierung des Wertes i

Double:
- Kommazahl
- ```double d = 1.2;```   	// Punkt statt Komma, da gebräuchlich im englischen
-	Default 0.0
- Wrapper Class/Objekt Data Type: Double
- ```1.2d (Float: 1.2f)```

Boolean:
- True / false
- ```boolean b = true;```
- oder int mit 0 oder 1 in C

char:
- 2 Byte
- Ein einzelnes Zeichen
- ```char c = ‘x‘;	```//Abostrophe

```Date d = new Date();```
```String s2 = new String(“Test“);```

Operatoren:
- new (Objekte erzeugen)
- == (Vergleich Größe der Variablen)
- equals() //bei Stringinhaltsvergleichen

Arrays
- Feld
- - fängt an bei 0 zu Zählen (Array von [5] von [0] bis [4]
- ```int[] a1 = {1,2,3,4,5};```
```
int[] a2 = new int[5];
a2[0] = 1;
a2[1] = 2;
a2[2] = 3;
a2[3] = 4;
a2[4] = 5;
```
- auslesen:
-	```int x = a2[3];```

Werte ändern: 
 ```int a =3
 a =-a; //a=-3 
 ```
- um 1 erhöhen:
- ```a = a+1;```
- ```a += 1;```
- ```a++; ``` (Postfix operator)
-	```++a;``` (Prefix Operator)- benutzen bei sysout

Vergleichsoperatoren (siehe Folien)
-	?:
- ```r = (a<b) ? 5:6;```	//tenär
```
if (a<b) {
r=5;
} else {
r=6;
}
```
- ```if (){} else if (){} else{}``` 
- ```switch (){case 1 : sysout; break; case 2 :………;default: ;break; ```

-	Block: {		}

-	Anweisung: int c = 2+2 (Ohne Semikolon, wenn Anweisung gefragt)
-	Operator: +
-	Statement: Mehrere Anweisungen mit Semikolon abgeschlossen
- ```double a = 2.1;```

Anwenung beenden:
- ```System.exit(0);	```	//mit Errorcode 0(kein fehler) schließen

Scanner zum input bei Kommandozeile:
- ```Scanner s = new Scanner(System.in);```
- Input:
```
int a = s.nextInt();
String c = s.next();
```

Endlosscheife:
- ```While(true){	}```

Boolsche Variablen:
- AND &&
- OR ||
- NOT  !

Deklarierung auch anders möglich
- ```Float f1 = Float.valueOf(1.2);```
- ```Float f2 = Float.parseValue(1.2);```

Autoboxing/- unboxing:
- ```Integer i1 = new Integer(2); ```//Boxing
- ```Int test = i1.intValue(); ```//Unboxing
- ```Integer i2 = 3;```//Autoboxing
- ```Int i3 = i2;```

<h4>Schleifen:</h4>

Kopf gesteuert:
-	```While (Bedingung) {} ```
-	```for (;;){}```
-	Bedingungen müssen nicht in Klammer stehen

Fußgesteuert
-	```Do {} while ()```
- For each schleife
-	```For (Object : ```

Label
- Sprungmarke um z.b. 2 Schleifen zu beenden
- Label:
- ```Break Label;```

Continue:
- Sprung zum nächsten i in der Schleife o.Ä.

Lokale Variable:
- ```static int aGlobalVariable = 5;```
- innerhalb der Class

Objektorientierung:
- Verkapselung
- Abstraktion
- Inhertitance
- Polymorphismus
- Design Time (Entwurf) vs. Runtime (Laufzeit)

<h4>Arten von Klassen:</h4>

Concrete Class:
-	Instanziierbar, Objekte erzeugen
-	Attribute und Methoden
-	Implementierungsklasse, normale Klasse
-	extends

Abstract Class:
-	Kann nicht instanziierbar, keine Objete erzeugbar
-	Mindestens eine abstrakte Methode (nur Signatur ohne Implementierungsblock (ohne {})
-	Bsp.: ```void bsp();```
-	Kann Attribute haben
-	Extendens

Interface (Schnittstelle):
-	Rein abstrakte Klasse
-	Es gibt nur Methoden-Signaturen (ohne Impl.)
-	Keine Attribute
-	Nicht instanziierbar
-	Oft zur Deff. Von Konstanten
-	Implements

Attribute
- Klassenattribut:
-	```int i;```
-	Nur für Klasse greifbar

Globales Attribut:
-	```Static int i;```
-	Für alle greifbar, auch außerhalb von Klasse

Methode = Constructor = Prozedur = Funktion

This
- Zeigerschlüsselwort
- Zeigt auf das Objekt der aktuellen klasse
- Zugriff auf Objektwerte

Super
- Zeigerschlüsselwort
- Zeigt auf die elternklasse

Sichtbarkeiten:
- Public
- Private	(Um auf Attribut von Außen zuzugreifen public getAttribut Methode verwenden)
- Protected
- Kein Schlüsselwort (Packetweit)

Methodenarten:
- Constructor (Create objet)
- Destructor
- Mutator (Attribute / Eig ändern)
- Acsessor (Query attribute values)
- Function (Execute  a calculation)

<h4>Polymorphismus:</h4>

Statisch: Überladen (overloading)
-	compiletime
-	Gleichnamige Methoden unterschiedlicher Parameterliste
-	constructor

Dynamisch: Überschreieben (overriding)
-	Runtime
-	Basiert auf Vererbung
-	Verhalten von Methoden ändert sich durch unterschiedliche Implementierung
-	Identische Methoden-Signatur
-	Typische Bsp.: ```equals```, ```toString()```

Grafische Darstellung
- UML Tool, CASE Tool….
- Sichtbarkeiten im Klassendiagramm:
```	
+ Public
# protected
- private
~ package weit (none)
```
-	Kursiv = abstrakt
-	Unterstrichen = static
-	GROßSCHREIBUNG = final

Vererbungspfeil
- Extends (durchgehender Pfeil)
- Impements (gestricheter Pfeil)

<h3>Exception Handeling</h3>

Abfangen von Ausnahmen
-	Try
-	Catch
-	Finally
-	Werfen von Ausnahmen:
-	Throws
-	Throw

Beispiele
-	Eingabe Zeichenkette statt Ganzzahl
-	Zugriff auf nicht existente Datei
-	Division durch arithmetische Null (0)
-	Zugriff auf nicht existentes Objekt (Null Pointer (Adresszeiger))
-	Array Zugriff auf Bereich außerhalb (Array Bound)

Error Management 
-	Return value
-	exception
-	Error code

Exception Throwing
- ```	Method() throws Exception {throw new Exception(„“)}```
-	Standard Fehler Konsole:
-	 ```System.err.println();```
-	Eigene Ecxeption Class muss extends Exception enthalten!!

Vorteile der Ausnahmebehandlung
- Trennung Quelltext: regulär + Fehlerverarbeitung
- Weiterleitung Fehler entlang des Call Stacks
- Definieren unterschiedlicher Fehlerklassen

Klausurthemen
-	Quersumme 10 p
-	Arrays-schleiife 20
-	Berechnung ggt-euklid 20
-	Transformation schleifen und rekursiven
-	30 Objektorientieruúnf UML + Methodenaufruf (2)

