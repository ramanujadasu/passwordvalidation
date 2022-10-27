package com.example.passwordvalidation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * 
 * @author vsrr.ramanujadasu
 *
 */
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
//@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDTO {
	@JsonProperty("user_name")
	//@JsonInclude(JsonInclude.Include.NON_NULL)
	private String userName;
	@JsonProperty("password")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	String password;
}
