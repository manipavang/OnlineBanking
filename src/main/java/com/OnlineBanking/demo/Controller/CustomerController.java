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

import com.OnlineBanking.demo.Beans.Customer;
import com.OnlineBanking.demo.Service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service; 
	
	@RequestMapping("/indexcus")
	public String viewHomePage(Model model) {
		List<Customer> listCustomers = service.listAll();
		model.addAttribute("listCustomers", listCustomers);
		
		return "indexcus";
	}
	
	@RequestMapping("/newcus")
	public String showNewCustomerPage(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		
		return "new_customer";
	}
	
	@RequestMapping(value = "/savecus", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		service.save(customer);
		
		return "redirect:/indexcus";
	}
	
	@RequestMapping("/editcus/{cid}")
	public ModelAndView showEditCustomerPage(@PathVariable(name = "cid") int cid) {
		ModelAndView mav = new ModelAndView("edit_customer");
		Customer customer = service.get(cid);
		mav.addObject("customer", customer);
		
		return mav;
	}
	
	@RequestMapping("/deletecus/{cid}")
	public String deleteCustomer(@PathVariable(name = "cid") int cid) {
		service.delete(cid);
		return "redirect:/indexcus";		
	}
}
