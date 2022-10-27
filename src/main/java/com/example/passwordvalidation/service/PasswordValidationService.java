package com.example.passwordvalidation.service;

import reactor.core.publisher.Mono;

/**
 * 
 * @author vsrr.ramanujadasu
 *
 */
public interface PasswordValidationService {

	Mono<Boolean> validatePassword(String password);


}