/**
 * 
 */
package com.example.demo.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.services.DemoService;


/**
 * @author abraj
 *
 */

@RestController
public class DemoController {
	
	@Autowired
	private DemoService demoservice; 

	@GetMapping("/")
	@Consumes("application/xml")
	@Produces("application/xml")
	public String home() {
		return demoservice.home();
	}
	
	@GetMapping("/process")
	@Consumes("application/xml")
	@Produces("application/xml")
	public ResponseEntity<?> processUser(@RequestBody User user) {
		return demoservice.processUser(user);
	}

}
