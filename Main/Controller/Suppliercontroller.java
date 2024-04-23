package com.example.pharmacy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.pharmacy.entity.StockDetails;
import com.example.pharmacy.entity.SupplierDetails;
import com.example.pharmacy.service.SupplierService;

import org.springframework.stereotype.Service;

import java.util.*;

@Controller
public class Suppliercontroller {
	
	@Autowired
	private  SupplierService supplierservice ;
	
	
	@GetMapping("/supplierregister")
	public String supplierregister() {
		return "Newsuppliercreate";
	}
	
	@GetMapping("/getsupplierdetails")
	public ModelAndView getAllSupplier() {
		List<SupplierDetails> listsupplier=supplierservice.getAllSupplier();
        return new ModelAndView("supplierList","supplier",listsupplier);
	}
	
	
	@PostMapping("/createsupplier")
	public String addSupplier(@ModelAttribute SupplierDetails supplierDetails) {
	    supplierservice.addSupplier(supplierDetails);
	    return "redirect:/getsupplierdetails";
	}
	
	/*@RequestMapping(method=RequestMethod.POST,value="/createsupplier")
	public void addSupplier(@RequestBody SupplierDetails supplierDetails)
	{
		supplierservice.addSupplier(supplierDetails);
	}*/


	
	@RequestMapping("/editsupplier/{supplierID}")
	public String editSupplier(@PathVariable("supplierID") int supplierID,Model model) {
		SupplierDetails su =supplierservice.getSupplierDetailsById(supplierID);
		model.addAttribute("supplier",su);
		return "SupplierEdit";
		}
	
	

    @RequestMapping("/deletesupplier/{supplierID}")
	public String deleteSupplier(@PathVariable("supplierID")int supplierID) {
		supplierservice.deleteById(supplierID);
		return "redirect:/getsupplierdetails";
	}
	
	

}
