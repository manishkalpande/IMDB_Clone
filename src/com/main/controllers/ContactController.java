package com.main.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("contact controller");
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String processForm(@RequestParam("email") String userEmail,@RequestParam("name") String userName
			,@RequestParam("pass") String userPassword ,Model model) {
		
		System.out.println("email : "+userEmail);
		System.out.println("name : "+userName);
		System.out.println("pass :"+userPassword);
		
		//process
		
		model.addAttribute("name",userName);
		model.addAttribute("email",userEmail);
		model.addAttribute("pass",userPassword);
		
		return "success";
	}
}
