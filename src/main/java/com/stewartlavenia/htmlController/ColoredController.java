package com.stewartlavenia.htmlController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ColoredController {

	@GetMapping("yellow")
	public String yellow(Model model) {
		System.out.println("Getting all users!");
		List<Users> users = new ArrayList<>();
//		List<Users> users = new Users();
		
		model.addAttribute("one", 1);
		model.addAttribute("two", 2);
		
		model.addAttribute("us", users);
		
//		model.addAllAttributes(users);
		
//		new Users("Bobby Brown", "1234", 22);
//		model.addAttribute("Bobby Brown", "1234", 22);
//		users.add[new Users(name:"Bobby Brown", "1234", 22)];
//		users.addAll(users);
		
//		model.addAttribute("Bobby Brown", "1234", 22);
//		users.add("Michael Jackson", "1345", 12);
//		users.add("Sammy Davis Jr.", "2445", 35);
//		users.add("Denise Williams", "4444", 55);
//		
		
		return "yellow";
	}
	
	@GetMapping("blue")
	public String blue() {
		return "blue";
	}
	
	@GetMapping("green")
	public String green() {
		return "green";
	}
	
	@GetMapping("brown")
	public String brown() {
		return "brown";
	}
	
	@GetMapping("purple")
	public String purple() {
		return "purple";
	}
}
