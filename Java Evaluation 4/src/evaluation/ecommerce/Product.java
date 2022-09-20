package evaluation.ecommerce;

public class Product {
	String name; 
	double price;
	String company;
	int count;
	
	
	
	public Product(String name, double price, String company, int count) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
	}



	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "]";
	}
	
	
}
