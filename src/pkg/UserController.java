package pkg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.*;


@Controller
public class UserController {
	@RequestMapping(value = "/login")
	public String loginForm(ModelMap map){
		
		map.addAttribute("command",new Login());
		
		return "login";
	}
	
	@RequestMapping(value = "/admin")
	public String admin(ModelMap map){
		
		
		map.addAttribute("name","Steven");
		return "admindashboard";
	}

}
