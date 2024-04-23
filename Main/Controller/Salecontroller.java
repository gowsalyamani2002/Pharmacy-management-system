package com.example.pharmacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.pharmacy.entity.SalesDetails;
import com.example.pharmacy.service.SaleService;

import org.springframework.stereotype.Service;
import java.util.*;

@Controller
public class Salecontroller {
	
	@Autowired
	private  SaleService saleservice;
	
	
	
	@GetMapping("/saleregister")
	public String saleregister() {
		return "NewSaleCreate";
	}
	
	@GetMapping("/getsaledetails")
	public ModelAndView getAllSale() {
		List<SalesDetails> listsale=saleservice.getAllSale();
        return new ModelAndView("saleList","sale",listsale);
	}
	
	@PostMapping("/createsale")
	public String addSale(@ModelAttribute SalesDetails sa) {
		saleservice.addSale(sa);
		return "redirect:/getsaledetails";
	}
	
	/*@RequestMapping(method=RequestMethod.POST,value="/stockcreate")
	public void addStock(@RequestBody StockDetails stockdetails)
	{
		stockservice.addStock(stockdetails);
	}*/
	
	
	@RequestMapping("/editsale/{saleID}")
	public String editSale(@PathVariable("saleID") int saleID,Model model) {
		SalesDetails sa =saleservice.getSaleDetailsById(saleID);
		model.addAttribute("sale",sa);
		return "SaleEdit";
	}
	@RequestMapping("/deletesale/{saleID}")
	public String deleteSale(@PathVariable("saleID")int saleID) {
		saleservice.deleteById(saleID);
		return "redirect:/getsaledetails";
	}
	
	
	

}
