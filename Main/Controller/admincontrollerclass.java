package com.example.pharmacy.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.pharmacy.entity.Admin;
import com.example.pharmacy.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class admincontrollerclass {
	
	@Autowired
	private AdminService adminservice;
	
	@GetMapping("/")
     public String welcome() 
		{
			return "AdminHome";
		}
	
	/*@GetMapping("/adminlogin")
	public String adminlogin() 
	{
		return "AdminLogin";
	}*/
	
	@GetMapping("/admin/home")
  	public String adminpage() 
  	{
  		return "index";
  	}
	
	@GetMapping("/adminlogin")
    public ModelAndView admin() {
       ModelAndView mav = new ModelAndView("adminlogin");
        mav.addObject("admin", new Admin());
        return mav;
    }
	
	@PostMapping("/adminlogin")
	public String login(@ModelAttribute("admin") Admin admin )
	{
	    Admin oauthUser = adminservice.admin(admin.getUsername(), admin.getPassword());

	    System.out.print(oauthUser);
	    
	    if(Objects.nonNull(oauthUser)) 
	    {    
	        return "redirect:/admin/home";
	    } else
	    {
	        return "redirect:/";
	    }
	}

 

   @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {

        return "redirect:/";
    }
 
}
	

