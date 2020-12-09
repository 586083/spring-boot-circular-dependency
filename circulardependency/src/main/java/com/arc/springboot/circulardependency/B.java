package com.arc.springboot.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

	@Autowired
	private A a;
	
	public void printClassname() {
		System.out.println("B");
	}
}