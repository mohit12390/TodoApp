package com.mohit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Controller
@EnableWebMvc
public class HomeController {

	
	@RequestMapping("/")
	public String home(Model m)
	{
		String s = null;
		System.out.println("String length : " +s.length());
	//	String s = "mohit";
//		Integer.parseInt(s);
				return "index";
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = NullPointerException.class)
	public String nullexceptionHandler(Model m)
	{
		m.addAttribute("msg", "Null Pointer Exception has occured");
		return "null_view";
	}
	
	@ExceptionHandler(value = NumberFormatException.class)
	public String numberFormatexceptionHandler(Model m )
	{
		m.addAttribute("msg", "Number Format Exception  has occured");
		return "null_view";
	}
	
/*
	@ExceptionHandler(value = Exception.class)
	public String genericException(Model m )
	{
		m.addAttribute("msg", "Generic has occured");
		return "null_view";
	}
	*/
}
