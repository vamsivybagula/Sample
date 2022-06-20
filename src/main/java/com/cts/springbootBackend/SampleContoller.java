package com.cts.springbootBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleContoller {
	
	@GetMapping("/home")
	public String home()
	{
		return "Haii welcome";
	}
	
	

}
