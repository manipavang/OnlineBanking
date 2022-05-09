package com.OnlineBanking.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.OnlineBanking.demo.Dto.UserRegistrationDto;
import com.OnlineBanking.demo.Service.UserService;



@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	
	
	@GetMapping
	public String showRegistrationForm(Model m) {
		List<String> list = new ArrayList<>();
		list.add("ROLE_USER");
		list.add("ROLE_ADMIN");
		
		m.addAttribute("list",list);

		return "registration";
	}
	

	@PostMapping
	public String  registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto){
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
}
