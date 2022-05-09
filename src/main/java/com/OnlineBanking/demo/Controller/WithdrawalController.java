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

import com.OnlineBanking.demo.Beans.Withdrawal;
import com.OnlineBanking.demo.Service.WithdrawalService;

@Controller
public class WithdrawalController {
	
	@Autowired
	private WithdrawalService service;
	

	@RequestMapping("/withdrawalcus")
	public String viewHomePage(Model model) {
		List<Withdrawal> listWithdrawal = service.listAll();
		model.addAttribute("listWithdrawal", listWithdrawal);
		
		return "withdrawal";
	}
	
	@RequestMapping("/newwithdrawalcus")
	public String showNewWithdrawalPage(Model model) {
		Withdrawal withdrawal = new Withdrawal();
		model.addAttribute("withdrawal", withdrawal);
		
		return "new_withdrawal";
	}
	
	
	
	@RequestMapping(value = "/savew", method = RequestMethod.POST)
	public String saveWithdrawal(@ModelAttribute("withdrawal") Withdrawal withdrawal) {
		service.save(withdrawal);
		
		return "redirect:/withdrawalcus";
	}
	
	@RequestMapping("/editw/{wid}")
	public ModelAndView showEditCustomerPage(@PathVariable(name = "wid") int wid) {
		ModelAndView mav = new ModelAndView("edit_withdrawal");
		Withdrawal withdrawal = service.get(wid);
		mav.addObject("withdrawal", withdrawal);
		
		return mav;
	}
	
	@RequestMapping("/deletew/{wid}")
	public String deleteWithdrawal(@PathVariable(name = "wid") int wid) {
		service.delete(wid);
		return "redirect:/withdrawalcus";		
	}

}