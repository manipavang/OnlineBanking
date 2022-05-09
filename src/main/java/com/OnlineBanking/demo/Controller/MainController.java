package com.OnlineBanking.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login(Model m) {
		List<String> list = new ArrayList<>();
		list.add("ROLE_USER");
		list.add("ROLE_ADMIN");
		m.addAttribute("list",list);
		return "login";
		
	}

	
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/home")
	public String homePage() {
		return "menupage";
	}
	@RequestMapping("/admin")
	public String adminHomePage() {
		return "admin";
	}
	
	@GetMapping("/user")
	public String userHomePage() {
		return "user";
	}
	
	
	/*
	@GetMapping("/login")
	public String login(Model m) {
		List<String> list = new ArrayList<>();
		list.add("USER");
		list.add("ADMIN");
		
		m.addAttribute("list",list);
		return "login";	
	}
	/*
	@GetMapping("/home")
	public String homePage() {
		return "menupage";
	}

	@GetMapping("/")
	public String home() {
		return "userdash";//menupage
	}

	@RequestMapping("/new")//new
	public String admin() {
		return "admin";
	}
	@GetMapping("/")
	public String home() {
		return "login";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "menupage";
	}
	@GetMapping("/user")
	public String user() {
		return "userdash";
	}
	*/
}
