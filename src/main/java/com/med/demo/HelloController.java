package com.med.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "Текстовый HTTP GET запрос. Hello World !!!";
	}
}
