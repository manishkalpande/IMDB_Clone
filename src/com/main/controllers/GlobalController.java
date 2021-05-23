package com.main.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GlobalController {

	@RequestMapping("/")
	public String home() {
		System.out.println("index page");
		return "index";
	}

	@RequestMapping("/error")
	// take Model object as parameter
	public String check(Model model) {
		System.out.println("this is error");
		model.addAttribute("name", "garry");
		model.addAttribute("age", 20);

		List<String> friends = new ArrayList<String>();
		friends.add("abhinav");
		friends.add("manish");
		friends.add("garry");
		model.addAttribute("f", friends);

		// data is added to model

		return "error";
	}


	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		// creating ModelAndView object
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "garry");
		mv.addObject("id", 12);
		mv.setViewName("help");

		LocalDateTime localDateTime = LocalDateTime.now();
		mv.addObject("time", localDateTime);

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(23);
		list.add(5);
		mv.addObject("marks", list);

		return (mv);
	}
	@RequestMapping("/login")
	  public String loginUser()
	  {
	    System.out.println("login page");
	    
	    return "login";
	  }

}
