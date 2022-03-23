package cs_18_2_4;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
			System.out.print(i * j + "\t");
			}
			System.out.println();
			}*/
		outerloop(1);
	}
	
	static void innerloop(int i, int j) {
		if(j<=10) {
			System.out.print(i * j + "\t");
			j++;
			innerloop(i,j);
		}
	}
	
	static void outerloop(int i) {
		if (i<=10) {
			innerloop(i,1);
			i++;
			System.out.println();
			outerloop(i);
		}
	}

}
