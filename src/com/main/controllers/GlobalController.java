package com.main.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalController {

	@RequestMapping("/")
	public String home() {
		System.out.println("index page");
		return "index";
	}

	@RequestMapping("/error")
	//take Model object as parameter
	public String check(Model model) {
		System.out.println("this is error");
		model.addAttribute("name","garry");
		model.addAttribute("age",20);
		
		List<String> friends=new ArrayList<String>();
		friends.add("abhinav");
		friends.add("manish");
		friends.add("garry");
		model.addAttribute("f",friends);
		
		//data is added to model
		
		return "error";
	}
}
