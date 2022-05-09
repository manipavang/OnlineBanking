package com.OnlineBanking.demo.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.OnlineBanking.demo.Beans.User;
import com.OnlineBanking.demo.Dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User save( UserRegistrationDto registartionDto);
}
