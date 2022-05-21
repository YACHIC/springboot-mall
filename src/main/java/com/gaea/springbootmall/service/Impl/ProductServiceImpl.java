package com.gaea.springbootmall.service.Impl;

import com.gaea.springbootmall.dao.ProductDao;
import com.gaea.springbootmall.model.Product;
import com.gaea.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
