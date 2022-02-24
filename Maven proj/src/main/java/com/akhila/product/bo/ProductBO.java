package com.akhila.product.bo;

import com.akhila.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
