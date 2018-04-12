/**
 * 
 */
package com.example.demo.dao;

import org.springframework.http.ResponseEntity;

import com.example.demo.models.User;

/**
 * @author abraj
 *
 */
public interface CustomRepository {
	
	ResponseEntity<?> save(User user);
	
	ResponseEntity<?> add(User user);
	
	ResponseEntity<?> update(User user);
	
	ResponseEntity<?> delete(User user);

}
