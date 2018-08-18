package com.aartek.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aartek.model.Product;

@Repository
@Transactional
public class ProductRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void checkProduct(Product prod)
	{
		System.out.println("Inside product Repository");
		System.out.println(prod.getProdname());
		System.out.println(prod.getProddesc());
		System.out.println(prod.getProdprice());
		System.out.println(prod.getProdqty());
		hibernateTemplate.save(prod);
	}
	public List getProductDetails(Product prod)
	{
		System.out.println("Inside product Repository");
		List list = hibernateTemplate.find("from Product");
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
		List<Product> prodList = (List<Product>) hibernateTemplate.find("from Product p where p.prodid=?", prodid);
		Product prod = null;
		for(Iterator<Product> itr = prodList.iterator(); itr.hasNext();)
		{
			prod = itr.next();
			System.out.println("Product id : "+prod.getProdid());
		}
		return prod;
	}
	
	public void updateProduct(Product prod)
	{
		hibernateTemplate.update(prod);
	}
	
	public void deleteProduct(Integer prodid)
	{
		Product prod = findProdById(prodid);
		hibernateTemplate.delete(prod);
	}
}