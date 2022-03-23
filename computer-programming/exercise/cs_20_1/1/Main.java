package cs20_1_1;


public class Main {
	static void fill(char [] [] a, char c){
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 4; j++) {
				a [i] [j] = c;
				c++;
			}
		}
		}

	static void print(char [] [] a) {
		for (char[] cs : a) {
			for (char  cs2 : cs) {
				System.out.print(cs2);
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		char [] [] a = new char [3] [4];
		char c = 97;
		Main.fill(a,c);
		Main.print(a);
	}

}
