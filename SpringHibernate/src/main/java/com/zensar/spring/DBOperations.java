package com.zensar.spring;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;
import com.zensar.services.business.ProductServiceImpl;

/**
 * Hello world!
 *
 */
public class DBOperations 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconfig.xml");
    	ProductService service = ctx.getBean("productServiceImpl", ProductService.class);
    	
    	//Add a Record
    	Product product = new Product(1008, "Laptop", "Dell", 25000.00f);
    	service.create(product);
        
    	//Search a Record
        Product p1 = new Product();
        p1 = service.findProductById(1008);
        System.out.println(p1);

        //Modify a Record
        Product p2 = new Product(1008, "Laptop", "Dell", 25000.00f);
        service.edit(p2);
        
        //Delete a Record
        Product p3 = new Product();
        p3.setProductId(4008);
        service.remove(p3);
        
        //Display all Records
        List<Product> productList = service.findAllProducts();
        for(Product p: productList)
        System.out.println(p);
    }
}
