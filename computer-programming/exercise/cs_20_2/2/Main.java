package cs2020_2_2;

import java.util.Scanner;

/**
 * Dies ist die Startklasse.
 * @author paul1
 */
public class Main {

		/**
		 * Dies ist die Einstiegsmethode.
		 * @param args das Kommandozeilenarray
		 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a =0;
		int b =0;
		int r =0;
		String c ="";
		String quit="n";
		
		while(quit.equals("n")) {
			
		System.out.println("Bitte geben sie Operand a ein:");
		a = s.nextInt();
		System.out.println("Bitte geben sie Operand b ein:");
		b = s.nextInt();
		System.out.println("Bitte geben sie eine Zeichenkette c ein:");
		c = s.next();
		r = 0;
		
		switch (c) {
		case "+":
			r= a+b;
			break;
		case "-":
			r= a-b;
			break;
		case "*":
			r= a*b;
			break;
		case "/":
			r= a/b;
			break;
		default:
		}
		System.out.println("Ergebnis: "+r);
		s.close();
		System.out.println("Programm beenden ? (j/n)");
		quit = s.next();
		}
	}
	}


