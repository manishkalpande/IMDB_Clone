package com.main.controllers;

<<<<<<< HEAD
=======
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
>>>>>>> 26fc8af186abe67fa5a1a4800ad3e30ca08f8863
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.SessionAttributes;
=======
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
>>>>>>> 26fc8af186abe67fa5a1a4800ad3e30ca08f8863

import com.main.beans.*;

@Controller
@SessionAttributes("uid")
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

	@RequestMapping("/login")
	public String loginUser() {
		System.out.println("login page");
		return "login";
	}

<<<<<<< HEAD
	@RequestMapping(path = "/check", method = { RequestMethod.POST, RequestMethod.GET })
	public String processForm(@ModelAttribute Check check, Model model) {
		System.out.println(check);
		if (check.getPswd() == "hello") {
			return "contact";
		} else {
			return "index";
=======
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
>>>>>>> 26fc8af186abe67fa5a1a4800ad3e30ca08f8863
		}
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

<<<<<<< HEAD
	@RequestMapping(path = "/processform1", method = { RequestMethod.POST, RequestMethod.GET })
	public String processForm(@ModelAttribute Upload upload, Model model) {
=======
	@RequestMapping(path = "/processform1",  method={RequestMethod.POST})
	public String processForm(@ModelAttribute Upload upload,Model model) {		
>>>>>>> 26fc8af186abe67fa5a1a4800ad3e30ca08f8863
		System.out.println(upload);
		// process
		return "success";
	}
	
<<<<<<< HEAD
	@RequestMapping("/image")
	public String image() {
		System.out.println("image page");
		return "image";
	}

=======
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
	
	
	
	
>>>>>>> 26fc8af186abe67fa5a1a4800ad3e30ca08f8863
}




