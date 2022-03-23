package cs16_2_4;

public class Launcher {

	public static void main(String[] args) {
		Article a1 = new Article(4711, 1.99);
		Article a2 = new Article(500, 2.5);
		
		Order o1 = new Order(2, a1);
		Order o2 = new Order(3, a2);
		
		System.out.println("Endsumme: "+Order.getTotal(o1, o2));
	}

}
