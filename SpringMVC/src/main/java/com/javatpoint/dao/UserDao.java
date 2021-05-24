/**
 * 
 */
package com.javatpoint.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.javatpoint.dao.exception.UserException;
import com.javatpoint.entity.User;

/**
 * @author naray
 *
 */
@Component
public class UserDao {

@Autowired
 JdbcTemplate jt;
	
	
	
	public void save(User usr) throws UserException {
		System.out.println("Dao layer started  ");
		try {
			String sql="insert into UserDetail(username,password,firstname,lastname) values('"+usr.getUsername()+"','"+usr.getPassword()+"','"+usr.getFirstname()+"','"+usr.getLastname()+"')";  
		     jt.update(sql) ;
		     
		}catch(Exception e) {
			throw new UserException("Unable to update database "+ e.getMessage());
		}
		
		System.out.println("Data added ");
		
	}

}
