package com.zensar.daos;
/*
 * Author: Swapnil Shrivastava
 * Creation Date: 30th Jul 2019 3:11 PM
 * Modified Date: 30th Jul 2019 3:11 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved
 * Description: Represents data access object interface used by business layer
 * it contains CRUD operations for entity product
 */
import java.util.List;

import com.zensar.entities.Product;

public interface ProductDao {

	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int productId);
	List<Product> getAll();
}
