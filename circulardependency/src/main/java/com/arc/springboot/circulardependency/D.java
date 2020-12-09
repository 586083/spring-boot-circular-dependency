package com.arc.springboot.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class D {

	private C c;
	
	@Autowired
	public D(C c) {
		System.out.println("In constructor D");
		this.c=c;
	}
	
	public void printClassname() {
		System.out.println("D");
	}
	
	public C getC() {
		return this.c;
	}
}
