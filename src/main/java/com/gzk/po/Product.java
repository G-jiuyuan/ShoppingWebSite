package com.gzk.po;

import lombok.Data;

/**
 * @author A
 * @create 2019-11-21-14:47
 */
@Data
public class Product {

    private int product_id;
    private String product_name;
    private int product_sum;
    private double product_price;
    private Status status;

}
