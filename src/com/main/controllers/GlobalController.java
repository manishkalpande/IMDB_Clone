package com.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.main.beans.*;

@Controller
@SessionAttributes("uid")
public class GlobalController {

	@RequestMapping("/")
	public String home() {
		System.out.println("index page");
		return "index";
	}

	@RequestMapping("/login")
	public String loginUser() {
		System.out.println("login page");
		return "login";
	}

	@RequestMapping(path = "/check", method = { RequestMethod.POST, RequestMethod.GET })
	public String processForm(@ModelAttribute Check check, Model model) {
		System.out.println(check);
		if (check.getPswd() == "hello") {
			return "contact";
		} else {
			return "index";
		}
	}

	@RequestMapping("/upload")
	public String showForm() {
		System.out.println("movie upload controller");
		return "upload_movies";
	}

	@RequestMapping(path = "/processform1", method = { RequestMethod.POST, RequestMethod.GET })
	public String processForm(@ModelAttribute Upload upload, Model model) {
		System.out.println(upload);
		// process
		return "success";
	}
	
	@RequestMapping("/image")
	public String image() {
		System.out.println("image page");
		return "image";
	}

}
