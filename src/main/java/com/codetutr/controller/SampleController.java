package com.codetutr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping("home")
	public String loadHomePage(@ModelAttribute("loginForm")LoginForm loginForm, Model m) {
		m.addAttribute("name", "CodeTutr");
		return "home";
	}
	
	@RequestMapping("login")
	public String login(@ModelAttribute("loginForm")LoginForm loginForm){
		System.out.println(loginForm);
		return "home";
	}
}
