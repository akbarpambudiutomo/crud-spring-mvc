/**
 * 
 */
package com.akbarcode.ums.service;

import java.util.*;
import com.akbarcode.ums.entity.User;

/**
 * @author
 *  Akbar Pambudi Utomo Oct 3, 2023 2:15:55 PM
 */
public interface UserService {
	List<User> getAllUsers();
	
	User saveUser(User user);
	
	User getUserById(Long id);
	
	User updateUser(User user);
	
	void deleteUserById(Long id);
}
