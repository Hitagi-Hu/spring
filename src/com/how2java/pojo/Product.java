package com.how2java.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//声明此类是bean,name为"product"
@Component("product")
public class Product {
    private String name = "computer";
    private String id;
    private double price;
//    或者在其set方法前添加@Autowired,实现自动注入对象,或者使用@Resour(name="c")
//    @Autowired
    private Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }
//    @Autowired
    @Resource(name = "c")
    public void setCategory(Category category) {
        this.category = category;
    }
}
