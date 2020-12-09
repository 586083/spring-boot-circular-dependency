package com.arc.springboot.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * refrence
 * https://stackoverflow.com/questions/61961758/why-does-using-autowired-not-lead-to-a-circular-dependency-but-autowiring-the
 * */
@RestController
public class Controller {
	
	@Autowired
	private A a;
	
	@Autowired
	private B b;
	
	@Autowired
	private C c;
	
	@Autowired
	private D d;
	
	@GetMapping("/testCircular")
	public void testCircular() {
		a.printClassname();
		b.printClassname();
		c.printClassname();
		d.printClassname();
		c.getD().printClassname();
		d.getC().printClassname();
		c.getD().getC().getD().printClassname();
		d.getC().getD().getC().printClassname();
	}
}
