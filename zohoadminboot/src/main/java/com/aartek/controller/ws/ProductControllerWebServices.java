package com.aartek.controller.ws;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aartek.model.Product;
import com.aartek.model.ProductImage;
import com.aartek.service.ProductService;

@Controller
public class ProductControllerWebServices {

	@Autowired
	private ProductService productservice;
	
//	@RequestMapping(method=RequestMethod.POST,value="/productView")
//	@ResponseBody
/*	public Product getProduct(@RequestBody Product product,HttpServletRequest req)
	{
		System.out.println("Inside Product Web Service Calling Service Class Method");
		Product pro = productservice.getProduct(product);
		System.out.println("Inside Product Web-Service");
		List<ProductImage> list = pro.getProductImage();
		Iterator<ProductImage> itr = list.iterator();
		while(itr.hasNext())
		{
			ProductImage proImage = (ProductImage)itr.next();
			System.out.println("ID : "+proImage.getImageId()+"Image Name : "+proImage.getImageName());
		}
		return product;
	}*/
}