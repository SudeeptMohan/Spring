package main.java;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@RequestMapping("/hello")
	public String index () {
		return "Hello World!";
	}	
	
}
