package com.stewartlavenia.htmlController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ColoredController {

	@GetMapping("yellow")
	public String yellow() {
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
