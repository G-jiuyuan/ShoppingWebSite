package com.gzk.service;

import com.gzk.dao.ProductDao;
import com.gzk.po.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author A
 * @create 2019-11-21-15:09
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Resource
    private ProductDao pd;


    public List<Product> selectAll() {
        return pd.selectAll();
    }

    public Product selectOne(int product_id) {
        return pd.selectOne(product_id);
    }

    public int insert(Product product) {
        return pd.insert(product);
    }

    public int update(Product product) {
        return pd.update(product);
    }

    public int delete(int product_id) {
        return pd.delete(product_id);
    }
}
