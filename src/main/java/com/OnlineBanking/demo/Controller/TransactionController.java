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

import com.OnlineBanking.demo.Beans.Transaction;
import com.OnlineBanking.demo.Service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	private TransactionService service; 
	
	@RequestMapping("/indext")
	public String viewHomePage(Model model) {
		List<Transaction> listTransaction = service.listAll();
		model.addAttribute("listTransaction", listTransaction);
		
		return "indext";
	}
	/*
	@RequestMapping("/newt")
	public String showNewTransactionPage(Model model) {
		Transaction transaction = new Transaction();
		model.addAttribute("transaction", transaction);
		
		return "new_transaction";
	}
	*/
	@RequestMapping("/newtran")
	public String showNewTransactionPage1(Model model) {
		Transaction transaction = new Transaction();
		model.addAttribute("transaction", transaction);
		
		return "new_transaction";
	}
	
	@RequestMapping(value = "/savet", method = RequestMethod.POST)
	public String saveTransaction(@ModelAttribute("transaction") Transaction transaction) {
		service.save(transaction);
		
		return "redirect:/indext";
	}
	
	@RequestMapping("/editt/{tid}")
	public ModelAndView showEditCustomerPage(@PathVariable(name = "tid") int tid) {
		ModelAndView mav = new ModelAndView("edit_transaction");
		Transaction transaction = service.get(tid);
		mav.addObject("transaction", transaction);
		
		return mav;
	}
	
	@RequestMapping("/deletet/{tid}")
	public String deleteTransaction(@PathVariable(name = "tid") int tid) {
		service.delete(tid);
		return "redirect:/indext";		
	}
}