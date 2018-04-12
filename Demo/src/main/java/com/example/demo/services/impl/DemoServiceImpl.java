/**
 * 
 */
package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.demo.common.Constants;
import com.example.demo.dao.DemoRepository;
import com.example.demo.models.User;
import com.example.demo.services.DemoService;

/**
 * @author abraj
 *
 */

@Component
public class DemoServiceImpl implements DemoService{
	
	@Autowired
	private DemoRepository demoRepository;
	
	@Override
	public ResponseEntity<?> processUser(User user) {
		return demoRepository.process(user);
	}

}
