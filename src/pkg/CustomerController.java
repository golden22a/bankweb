package pkg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import dao.*;

@Controller
@SessionAttributes("user")
public class CustomerController {

	@RequestMapping(value = "/")
	public String createCustomerForm(ModelMap map){
		map.addAttribute("command", new Customer());
		return "createcustomerform";
	}
	
	@RequestMapping(value = "/createaccount")
	public String createAccountform(@ModelAttribute Customer c,ModelMap map){
	
		map.addObject("user",c);
		map.addAttribute("command", new Account());
		return "createaccountform";
	}
	@RequestMapping(value = "/saveaccountandcustomer")
	public String saveAccountAndCustomer(@ModelAttribute("user") Customer c,@ModelAttribute("command") Account acc ,ModelMap map){
		map.addAttribute("name",c.getCustName());
		return "success";
	}
	
}
