package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Product;

/*
 * Author: Swapnil Shrivastava
 * Creation Date: 30th Jul 2019 4:51 PM
 * Modified Date: 30th Jul 2019 4:51 PM
 * Version: 1.0
 * Copyright: Represents product services which can be accessed by presentation layer.
 * 			  It encapsulates business logic of product entity.
 */

public interface ProductService {

	void create(Product product);
	void edit(Product product);
	void remove(Product product);
	Product findProductById(int productId);
	List<Product> findAllProducts();
	
}
