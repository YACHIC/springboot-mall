package com.gaea.springbootmall.dao;

import com.gaea.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
