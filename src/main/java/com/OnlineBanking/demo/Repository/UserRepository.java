package com.OnlineBanking.demo.Repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OnlineBanking.demo.Beans.Role;
import com.OnlineBanking.demo.Beans.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	   User findByEmail(String email);
	   
	
}
