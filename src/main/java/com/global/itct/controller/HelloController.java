package com.global.itct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.global.itct.service.HelloService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class HelloController {
	
	private final HelloService HelloService;
	
	@GetMapping(value = "/hi")
	public String hi(HttpServletRequest request, Model model) {
		String requestURI = request.getRequestURI();
		System.out.printf("HelloController.hello requestURI:%s\n", requestURI);
		model.addAttribute("uuid", HelloService.hi() + "-" + requestURI);
		return "hello";
	}
	
	@GetMapping(value = "/hello")
	public String hello(HttpServletRequest request, Model model) {
		String requestURI = request.getRequestURI();
		System.out.printf("HelloController.hello requestURI:%s\n", requestURI);
		model.addAttribute("uuid", HelloService.hello() + "-" + requestURI);
		return "hello";
	}
	
	@GetMapping(value = "/hello/hi")
	public String helloHi(HttpServletRequest request, Model model) {
		String requestURI = request.getRequestURI();
		System.out.printf("HelloController.hello requestURI:%s\n", requestURI);
		model.addAttribute("uuid", HelloService.helloHi() + "-" + requestURI);
		return "hello";
	}
	
	

}
