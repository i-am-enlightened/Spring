package com.zensar.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@PostMapping("/validate")
	public String validateUser(User user,ModelMap map) {
		if(user.getUsername().equals("swapnil") && user.getPassword().equals("zxc123")) {
			map.addAttribute("user",user);
			return "Success";
		}
		else {
			map.addAttribute("LoginError","Error logging in");
			return "Login";
		}
	}
}
