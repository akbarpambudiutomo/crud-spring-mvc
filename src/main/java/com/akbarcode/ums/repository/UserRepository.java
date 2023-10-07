/**
 * 
 */
package com.akbarcode.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akbarcode.ums.entity.User;

/**
 * @author
 *  Akbar Pambudi Utomo Oct 3, 2023 11:57:04 AM
 */
public interface UserRepository extends JpaRepository<User, Long>{

}
