package evaluation.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	List<Product> productList=new ArrayList<>();
	
	
	
	void addProductToList(Product product){
		
		productList.add(product);
		
	}
	
	void showAllProduct() {
			
		System.out.println(productList.toString());
		
	}
}
