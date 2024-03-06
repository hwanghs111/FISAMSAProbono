package fisa.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class ViewController {
	
	@GetMapping
	public String indexForm() {
		
		return "index";
	}
	
	@GetMapping("/activistAllView")
	public String synchronousForm() {
		
		return "synchronous";
	}

}
