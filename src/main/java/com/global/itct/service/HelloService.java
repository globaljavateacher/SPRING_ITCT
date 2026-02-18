package com.global.itct.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String hi() {
		System.out.println("HelloService.hi");
		return "hi";
	}
	
	public String hello() {
		System.out.println("HelloService.hello");
		return "hello";
	}
	
	public String helloHi() {
		System.out.println("HelloService.helloHi");
		return UUID.randomUUID().toString();
	}

}
