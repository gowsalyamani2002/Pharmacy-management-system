package com.example.pharmacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.pharmacy.entity.StockDetails;
import com.example.pharmacy.service.StockService;


import java.util.List;

@Controller
public class StockController {
	
	@Autowired
	private StockService stockservice;
	
	
	/*@GetMapping("/")
	public String home() {
		return "index";
	}*/
	
	@GetMapping("/stockregister")
	public String stockregister() {
		return "Newstockcreate";
	}
	
	@GetMapping("/getstockdetails")
	public ModelAndView getAllStock() {
		List<StockDetails> liststock=stockservice.getAllStock();

		return new ModelAndView("stockList","stock",liststock);
	}
	
	@PostMapping("/createstock")
	public String addStock(@ModelAttribute StockDetails stockdetails ) {
		stockservice.addStock(stockdetails);
	    return "redirect:/getstockdetails";
	}

	@RequestMapping("/editstock/{drugID}")
	public String editstock(@PathVariable int drugID,Model model) {
		StockDetails s=stockservice.getStockDetailsById(drugID);
		model.addAttribute("stock",s);
		return "Edit";
	}
	
	@RequestMapping("/deletestock/{drugID}")
	public String deleteStock(@PathVariable("drugID")int drugID) {
		stockservice.deleteById(drugID);
		return "redirect:/getstockdetails";
	}


}
