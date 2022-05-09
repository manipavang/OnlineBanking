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

import com.OnlineBanking.demo.Beans.AccountDetail;
import com.OnlineBanking.demo.Service.AccountDetailService;

@Controller
public class AccountDetailsController {

	@Autowired
	private AccountDetailService service; 
	
	
	@RequestMapping("/indexacc")
	public String viewHomePage(Model model) {
		List<AccountDetail> listAccountDetails = service.listAll();
		model.addAttribute("listAccountDetails", listAccountDetails);
		
		return "indexacc";
	}
	
	@RequestMapping("/indexcustacc")
	public String viewHomePage1(Model model) {
		List<AccountDetail> listAccountDetails = service.listAll();
		model.addAttribute("listAccountDetails", listAccountDetails);
		
		return "indexcustacc";
	}
	
	@RequestMapping("/newacc")
	public String showNewAccountDetailPage(Model model) {
		AccountDetail accountdetail = new AccountDetail();
		model.addAttribute("accountdetail", accountdetail);
		
		return "new_accountdetail";
	}
	
	@RequestMapping(value = "/saveacc", method = RequestMethod.POST)
	public String saveAccountDetail(@ModelAttribute("accountdetail") AccountDetail accountdetail) {
		service.save(accountdetail);
		
		return "redirect:/indexacc";
	}
	
	@RequestMapping("/editacc/{id}")
	public ModelAndView showEditAccountDetailPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_accountdetail");
		AccountDetail accountdetail = service.get(id);
		mav.addObject("accountdetail", accountdetail);
		
		return mav;
	}
	
	@RequestMapping("/deleteacc/{id}")
	public String deleteAccountDetail(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/indexacc";		
	}
}

