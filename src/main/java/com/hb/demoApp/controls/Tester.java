package com.hb.demoApp.controls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class Tester {
	
	@GetMapping("/tester")
	public String Tester() {
		return "Tester";
	}
}
