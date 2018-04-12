/**
 * 
 */
package com.example.demo.dao.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.CustomRepository;
import com.example.demo.models.User;


@Repository
public class CustomRepositoryImpl implements CustomRepository{

	@Override
	public ResponseEntity<?> save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> add(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> delete(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
