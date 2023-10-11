package com.Project.parkingOnline.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Project.parkingOnline.Entity.RegisterUser;
import com.Project.parkingOnline.Service.RegisterService;


@Controller
public class RegController {
	
	private RegisterService service ;

	@GetMapping("/reg")
	public String register(Model model) {
		RegisterUser user = new RegisterUser();
		model.addAttribute(user);
		return "Reg" ;
	}
	
	@PostMapping("/register")
	public String registered(@ModelAttribute("user") RegisterUser user) {
		service.register(user);
		System.out.println(user);
		return "redirect:/reg" ;
	}
}
