package quersumme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Dieses Programm berechnet Quersummen!");
		System.out.println("Zu berechnende Zahl:");
		int a = s.nextInt();
		int result = quersumme(a);
		System.out.println("Die Quersumme ist: " + result);
		System.out.println("Neustart ? j/n");
		if (s.next().equals("j")) {
			main(args);
		}
		s.close();
	}

	private static int quersumme(int a) {
		int arr[]= new int [10];
		int i=0;
		while (a != 0) { 
		    arr[i] = a % 10 ;
		    a /= 10 ;
		    i++;
		    }
		int result=0;
		
		for (int j = 0; j < arr.length; j++) {
			result = arr[j]+ result;
		}
		return result;
		
	}

}
