package io.javabrains.springbootstarter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@CrossOrigin(origins = "http://localhost:9000")
	@RequestMapping("/hello")
	public String index() {
		return "Hellóka nyalóka";
	
	}
}
