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

import com.OnlineBanking.demo.Beans.Deposit;
import com.OnlineBanking.demo.Service.DepositService;

@Controller
public class DepositController {
	@Autowired
	private DepositService service;
	
	
	@RequestMapping("/depositcus")
	public String viewHomePage(Model model) {
		List<Deposit> listDeposit = service.listAll();
		model.addAttribute("listDeposit", listDeposit);
		
		return "deposit";
	}
	
	@RequestMapping("/newdepositcus")
	public String showNewDepositPage(Model model) {
		Deposit deposit = new Deposit();
		model.addAttribute("deposit",deposit);
		
		return "new_deposit";
	}
	
	@RequestMapping(value = "/saved", method = RequestMethod.POST)
	public String saveDeposit(@ModelAttribute("deposit") Deposit deposit) {
		service.save(deposit);
		
		return "redirect:/depositcus";
	}
	
	@RequestMapping("/editd/{did}")
	public ModelAndView showEditDepositPage(@PathVariable(name = "did") int did) {
		ModelAndView mav = new ModelAndView("edit_deposit");
		Deposit deposit = service.get(did);
		mav.addObject("deposit", deposit);
		
		return mav;
	}
	
	@RequestMapping("/deleted/{did}")
	public String deleteTransaction(@PathVariable(name = "did") int did) {
		service.delete(did);
		return "redirect:/depositcus";		
	}
}