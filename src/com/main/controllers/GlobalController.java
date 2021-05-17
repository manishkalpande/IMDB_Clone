package com.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalController 
{
	@RequestMapping("/")
	 public String home()
	 {
	 return "index";
	 }
	


}
