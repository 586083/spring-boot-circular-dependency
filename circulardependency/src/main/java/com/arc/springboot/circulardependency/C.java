package com.arc.springboot.circulardependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class C {

	private D d;
	
	public C(@Lazy D d) {
		System.out.println("In constructor C");
		this.d=d;
	}
	
	public void printClassname() {
		System.out.println("C");
	}
	
	public D getD() {
		return this.d;
	}
}
