package cs16_2_4;

public class Order {
	private int quantity;
	private Article article;
	
	
	public Order(int q, Article a) {
		this.article = a;
		this.quantity = q;
	}
	
	
	public double getOrderValue() {
		
		return  this.quantity * this.article.getPrice();
	}

	public static double getTotal(Order... ordres) {
		double t = 0;
		for (Order o : ordres) {
			t=  t+ o.getOrderValue();
		}
		return t;
	}

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Article getArticle() {
		return article;
	}


	public void setArticle(Article article) {
		this.article = article;
	}
	
	
}
