package com.akhila.product.bo;

import com.akhila.product.dao.ProductDAO;
import com.akhila.product.dao.ProductDAOImpl;
import com.akhila.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
