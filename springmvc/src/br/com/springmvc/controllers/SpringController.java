package br.com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("message","Spring Com Thymeleaf");
		return "index";
		
	}
}
