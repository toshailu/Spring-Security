/**
 * 
 */
package com.shailu.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shailu
 *
 */
@RestController
public class HomeController {
	
	
	@RequestMapping("/")
	public String home() {
		
		return (" <h1> Welcome to Spring Security.. </h1>");
	}

	
	@RequestMapping("/user")
	public String user() {
		
		return (" <h1> Welcome USER to Spring Security.. </h1>");
	}
	
	
	
	@RequestMapping("/admin")
	public String admin() {
		
		return (" <h1> Welcome ADMIN to Spring Security.. </h1>");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
