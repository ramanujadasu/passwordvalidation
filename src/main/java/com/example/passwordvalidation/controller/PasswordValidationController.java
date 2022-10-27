package com.example.passwordvalidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.passwordvalidation.dto.UserDTO;
import com.example.passwordvalidation.service.PasswordValidationService;

import reactor.core.publisher.Mono;


/**
 * 
 * @author vsrr.ramanujadasu
 *
 */
@RestController
@RequestMapping("/pv")
public class PasswordValidationController {

	@Autowired
	private PasswordValidationService passwordValidationService;

	/**
	 * 
	 * @param userDTO
	 * @return
	 */
	@PostMapping(value = "/password", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Mono<Boolean>> validate(@RequestBody UserDTO userDTO) {
		ResponseEntity<Mono<Boolean>> response = null;
		try {
			response = new ResponseEntity<Mono<Boolean>>(passwordValidationService.validatePassword(userDTO.getPassword()), HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<Mono<Boolean>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}

}
