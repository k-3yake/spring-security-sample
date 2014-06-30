package com.codetutr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AllController {
	
	@RequestMapping(value={"/","/top**"})
	public ModelAndView topPage(){
		return new ModelAndView("top");
	}

	@RequestMapping(value={"/user**"})
	public ModelAndView userPage(){
		return new ModelAndView("user");
	}

	@RequestMapping(value={"/admin**"})
	public ModelAndView adminPage(){
		return new ModelAndView("admin");
	}

	@RequestMapping(value={"/login**"})
	public ModelAndView loginPage(){
		return new ModelAndView("login");
	}

}