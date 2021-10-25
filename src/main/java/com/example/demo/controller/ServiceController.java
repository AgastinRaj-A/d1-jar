package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Test1Model;
import com.example.demo.model.Test2Model;
import com.example.demo.repository.Test1Repo;
import com.example.demo.service.Proxy2;

@RestController
public class ServiceController {
	
	@Autowired
	private Test1Repo repo;
	
	@Autowired
	private Proxy2 proxy;
	
	@GetMapping("/hello")
	public String returnString() {
		return "Hello, I'm service1";
	}
	
	@GetMapping("/dbTest")
	public List<Test1Model> returnTest1() {
		return repo.findAll();
	}

	@GetMapping("/dbTest2")
	public List<Test2Model> returnTest2() {
		return proxy.returnTest2();
	}
}
