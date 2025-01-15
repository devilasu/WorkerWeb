package com.our.ww.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class mainController {
	
	@GetMapping("/")
	public String main(Model model) {
		
		model.addAttribute("test", "<h1>테스트 확인</h1>");
		
		return "/index";
	}
	
}
