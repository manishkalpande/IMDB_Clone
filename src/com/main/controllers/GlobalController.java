package com.main.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.main.beans.*;


@Controller
public class GlobalController {
	
	@Autowired
	HttpSession ses;
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpServletResponse response;
	
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
	@RequestMapping(path = "/check",  method={RequestMethod.GET,RequestMethod.POST})
	public String processForm(@ModelAttribute User user,Model model) {		
		System.out.println(user);
		// process
		String uid=user.getUserid();
		String psw=user.getPassword();
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		try 
		{
			DBConnector dbc=new DBConnector();
			con=dbc.getDbconnection();
			pst = con.prepareStatement("select * from user where user_id=? and pass=?;");
			pst.setString(1, uid);
			pst.setString(2, psw);
			rs = pst.executeQuery();

			if(rs.next())
			{
				ses=request.getSession(true);
				ses.setAttribute("userid",user.getUid());
				
				/*
				 * String mobno=rs.getString("mob_no"); HttpSession
				 * ses=request.getSession(true); ses.setAttribute("user_id", id);
				 * ses.setAttribute("mob_no", mobno);
				 */
				return "index";
				
			}	
			else
			{
				return "failure";
			}			
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return "success";	
	}
	
	@RequestMapping("/newRegister")
	public String newRegister()
	{
		
		return "newRegister";
	}

	@RequestMapping("/upload")
	public String showForm() {
		System.out.println("movie upload controller");
		return "upload_movies";
	}

	@RequestMapping(path = "/processform1",  method={RequestMethod.POST})
	public String processForm(@ModelAttribute Upload upload,Model model) {		
		System.out.println(upload);
		// process		
		return "success";
	}
	
	@RequestMapping(path= "/RegisterUser", method= {RequestMethod.POST})
	public String newUserRegister(@ModelAttribute User user,Model model)
	{
		RegisterUser reg=new RegisterUser();
		reg.register(user);
		
		return"index";
	}
	
	@RequestMapping("/trilermovies")
	public RedirectView trailerMovies(@RequestParam("movienm") String trailer)
	{
		String url="https://www.youtube.com/results?search_query=" +trailer+ " official trailer";
		
		RedirectView redirectview =new RedirectView();
		
		redirectview.setUrl(url);
		
		return redirectview;
	}
	
	@RequestMapping("/logout")
	public String logOut()
	{
		return "logout";
	}
	
	@RequestMapping("/changePass")
	public String changePass()
	{
		return "changePass";
	}
	@RequestMapping("/changePassword")
	public String changePassword(@RequestParam("oldpass") String oldpass,@RequestParam("newpass") String newpass)
	{
		
		
		
		
		return "";
	}
	
	@RequestMapping("/adminlogin")
	public String adminlogin()
	{
		return "adminlogin";
	}
	
}




