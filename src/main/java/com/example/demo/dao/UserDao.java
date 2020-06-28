package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;



/**
 * @author Manasa
 *
 */
@Repository


public interface UserDao extends CrudRepository<User, Integer> {

//THis is a use dAO

	
	/**
	 * This method is used to authenticate User 
	 * @param userName
	 * @param password
	 * @return
	 */
	public User findByUserNameAndPassword(String userName, String password);
}
