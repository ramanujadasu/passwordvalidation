package com.example.passwordvalidation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.passwordvalidation.utils.CommonUtils;

import reactor.core.publisher.Mono;

/**
 * 
 * @author vsrr.ramanujadasu
 *
 */
@Service("passwordValidationService")
public class PasswordValidationServiceImpl implements PasswordValidationService {

	
	@Autowired
	@Qualifier("passwordValidationService")
	PasswordValidationService passwordValidationService;
	
	@Override
	public Mono<Boolean> validatePassword(String password) {
		//CommonUtils.validate
		
		return Mono.just(CommonUtils.is_Valid_Password(password));
	}
}
