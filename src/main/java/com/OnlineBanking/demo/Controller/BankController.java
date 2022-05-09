package com.OnlineBanking.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.OnlineBanking.demo.Beans.Bank;
import com.OnlineBanking.demo.Service.BankService;

@Controller
public class BankController {

	@Autowired
	private BankService service; 
	
	@RequestMapping("/indexbank")
	public String viewHomePage(Model model) {
		List<Bank> listBanks = service.listAll();
		model.addAttribute("listBanks", listBanks);
		
		return "indexon";
	}
	
	@RequestMapping("/newbank")
	public String showNewBankPage(Model model) {
		Bank bank = new Bank();
		model.addAttribute("bank", bank);
		
		return "new_bank";
	}
	
	/*@RequestMapping(value = "/saveon", method = RequestMethod.POST)
	public String saveBank(@ModelAttribute("bank") Bank bank) {
		service.save(bank);
		
		return "redirect:/indexon";
	}*/
	
	@RequestMapping(value = "/saveon", method = RequestMethod.POST)
	public String saveBank1(@ModelAttribute("bank") Bank bank) {
		service.save(bank);
		
		return "redirect:/indexbank";
	}
	
	/*
	@RequestMapping("/editon/{bid}")
	public ModelAndView showEditBankPage(@PathVariable(name = "bid") int bid) {
		ModelAndView mav = new ModelAndView("edit_bank");
		Bank bank = service.get(bid);
		mav.addObject("bank", bank);
		
		return mav;
	}
	
	@RequestMapping("/deleteon/{bid}")
	public String deleteBank(@PathVariable(name = "bid") int bid) {
		service.delete(bid);
		return "redirect:/indexon";		
	}
	*/
	@RequestMapping("/editon/{bid}")
	public ModelAndView showEditBankPage1(@PathVariable(name = "bid") int bid) {
		ModelAndView mav = new ModelAndView("edit_bank");
		Bank bank = service.get(bid);
		mav.addObject("bank", bank);
		
		return mav;
	}
	
	@RequestMapping("/deleteon/{bid}")
	public String deleteBank1(@PathVariable(name = "bid") int bid) {
		service.delete(bid);
		return "redirect:/indexbank";		
	}
}

