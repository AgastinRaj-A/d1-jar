package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Test2Model;

@FeignClient(name="service2")
public interface Proxy2 {
	
	@GetMapping("/dbTest")
	public List<Test2Model> returnTest2();

}
