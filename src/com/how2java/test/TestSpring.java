package com.how2java.test;

import com.how2java.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });

		/*Category c = (Category) context.getBean("c");
		System.out.println(c.getName());
		System.out.println(c.getId());*/

        Product product = (Product) context.getBean("product");
        product.setName("phone");//修改name属性
        System.out.println(product.getName());
        System.out.println(product.getCategory().getName());

	}
}