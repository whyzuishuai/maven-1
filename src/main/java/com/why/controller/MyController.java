package com.why.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/list")
	public String list() {
		System.out.println("666666666");
		return "list";
	}

}
