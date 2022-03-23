package ggteukild;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Dieses Programm berechnet den GGT");
		Scanner s = new Scanner(System.in);
		System.out.println("Geben sie ihre erste Zahl ein:");
		int a = s.nextInt();
		System.out.println("Geben sie ihre zweite Zahl ein:");
		int b = s.nextInt();
		int re = ggt(a,b);
		System.out.println(re);
		System.out.println("Neustart? j/n");
		if (s.next().equals("j")) {
			main(args);
		}
	}

	private static int ggt(int a, int b) {
		int re = 0 ;
		if ((a%b) != 0) {
			re = ggt(b,(a%b));
		} else if ((a%b) == 0) {
			re = b;
		}
		return re;
		
	}
}
