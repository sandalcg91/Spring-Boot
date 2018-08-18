package com.aartek.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.Product;
import com.aartek.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public void checkProduct(Product prod)
	{
		System.out.println("Inside product Service");
		System.out.println(prod.getProdname());
		System.out.println(prod.getProddesc());
		System.out.println(prod.getProdprice());
		System.out.println(prod.getProdqty());
		productRepository.checkProduct(prod);
	}
	
	public List getProductDetails(Product prod)
	{
		System.out.println("Inside product Service");
		List list = productRepository.getProductDetails(prod);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			Product product = (Product)itr.next();
			System.out.println(product.getProdname()+" "+product.getProddesc()+" "+product.getProdprice()+" "+product.getProdqty());
		}
		return list;
	}
	
	public Product findProdById(Integer prodid) 
	{
		Product prod = productRepository.findProdById(prodid);
		return prod;
	}
	
	public void updateProduct(Product prod)
	{
		productRepository.updateProduct(prod);
	}
	
	public void deleteProduct(Integer prodid)
	{
		productRepository.deleteProduct(prodid);
	}
}