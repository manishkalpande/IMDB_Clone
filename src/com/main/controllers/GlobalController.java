package com.main.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String loginUser() {

		System.out.println("login controller");
		return "login";
	}

	@RequestMapping("/upload")
	public String showForm() {
		System.out.println("movie upload controller");
		return "upload_movies";
	}

	@RequestMapping(path = "/processform1", method = { RequestMethod.POST, RequestMethod.GET })
	public String processForm(@RequestParam("name") String filmName, @RequestParam("type") String filmType,
			@RequestParam("reldate") String releaseDate, @RequestParam("lead") String leadActor,
			@RequestParam("director") String director, @RequestParam("genre") String genre,
			@RequestParam("length") String playTime, @RequestParam("certificate") String certificate,
			@RequestParam("description") String description,@RequestParam("writer") String writer,
			@RequestParam("category") String category,@RequestParam("relcountry") String relCountry,Model model) {

		System.out.println("Film Name : " + filmName);
		System.out.println("Film Type : " + filmType);
		System.out.println("Release Date : " + releaseDate);
		System.out.println("Lead Actor : " + leadActor);
		System.out.println("Director : " + director);
		System.out.println("Genre : " + genre);
		System.out.println("Play Time : " + playTime);
		System.out.println("Certificate : " + certificate);
		System.out.println("Description : "+description);
		System.out.println("Writer : "+writer);
		System.out.println("Category : "+category);
		System.out.println("Release Country : "+relCountry);

		// process
		
		model.addAttribute("name", filmName);
		model.addAttribute("type", filmType);
		model.addAttribute("reldate", releaseDate);
		model.addAttribute("lead", leadActor);
		model.addAttribute("director", director);
		model.addAttribute("genre", genre);
		model.addAttribute("length", playTime);
		model.addAttribute("certificate", certificate);
		model.addAttribute("description", description);
		model.addAttribute("writer", writer);
		model.addAttribute("category", category);
		model.addAttribute("relcountry", relCountry);
		
		return "success";
	}

}
