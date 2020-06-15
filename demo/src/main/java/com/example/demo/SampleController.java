package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SampleController {

	@GetMapping("/sample1")
	public String sample1(Model model) {
		model.addAttribute("greeting", "Hello!!!");
		return "sample1";
	}

}
