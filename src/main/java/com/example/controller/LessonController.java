package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson")
public class LessonController {
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Hello World!";
	}
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "Good Evening!";
	}
	
	@GetMapping("/sample")
	public String sample(Model model) {
		String text = "Hello Spring Boot!!";
		model.addAttribute("message", text);
		return "index";
	}
}
