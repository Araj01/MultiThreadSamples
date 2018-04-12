/**
 * 
 */
package com.example.demo.services;

import org.springframework.http.ResponseEntity;

import com.example.demo.models.User;

/**
 * @author abraj
 *
 */


public interface DemoService {
	
	ResponseEntity<?> processUser(User user);

}
