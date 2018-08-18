package com.aartek.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.Product;
import com.aartek.service.ProductService;

@Controller
public class ProductController {

	private static final Logger log = Logger.getLogger(ProductController.class);

	@Autowired
	private ProductService productService;

	@RequestMapping(value="/product", method = RequestMethod.GET)
	public String checkProduct(Model model, Product prod, BindingResult result)
	{
		log.info("Inside Product Controller");
		model.addAttribute("prodMap", new Product());
		model.addAttribute("prodList", productService.getProductDetails(prod));
		return "product";
	}
	
	@RequestMapping(value="/productSave",method = RequestMethod.POST)
	public String SingInAction(@ModelAttribute("userMap") Product prod, /*Model model,*/  BindingResult result)
	{
		System.out.println("productName : "+prod.getProdname());
		productService.checkProduct(prod);
//		model.addAttribute("prodList", productService.getProductDetails(prod));
		return "redirect:/product";
	}
	
	@RequestMapping(value="/edit-{prodid}", method=RequestMethod.GET)
	public String editProduct(@PathVariable int prodid, Model model) 
	{
		Product prod = productService.findProdById(prodid);
		model.addAttribute("prod", prod);
		return "updateProd";
	}
	@RequestMapping(value="/productEdit", method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("prod") Product prod)
	{
		productService.updateProduct(prod);
		return "redirect:/product";
	}
	
	@RequestMapping(value="/delete-{prodid}", method=RequestMethod.GET)
	public String deleteProduct(@PathVariable Integer prodid, Model model) 
	{
		productService.deleteProduct(prodid);
		return "redirect:/product";
	}
}