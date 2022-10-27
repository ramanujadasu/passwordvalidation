package com.example.passwordvalidation.utils;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * 
 * @author vsrr.ramanujadasu
 *
 */
public class CommonUtilsTest {
	@Test
	public void validatePassword_Null() {
		// setup
		String password = null;

		// execute
		boolean actual = CommonUtils.is_Valid_Password(password);

		// assert
		assertFalse(actual);
	}

	@Test
	public void validatePassword_EmptyString() {
		// setup
		String password = "";

		// execute
		boolean actual = CommonUtils.is_Valid_Password(password);

		// assert
		assertFalse(actual);
	}

	@Test
	public void validatePassword_Missing_OneNumber() {
		// setup
		String password = "Abcdefg#";

		// execute
		boolean actual = CommonUtils.is_Valid_Password(password);

		// assert
		assertTrue(actual); // Add Feature pass this test
	}

	@Test
	public void validatePassword_Missing_OneUpperCaseLetter() {
		// setup
		String password = "abcdefg5#";

		// execute
		boolean actual = CommonUtils.is_Valid_Password(password);

		// assert
		assertTrue(actual); // Add Feature pass this test
	}

	@Test
	public void validatePassword_Missing_OneLowerCaseLetter() {
		// setup
		String password = "ABCDEFG5#";

		// execute
		boolean actual = CommonUtils.is_Valid_Password(password);

		// assert
		assertTrue(actual); // Add Feature pass this test
	}

	@Test
	public void validatePassword_Missing_MinLenth() {
		// setup
		String password = "Abcde";

		// execute
		boolean actual = CommonUtils.is_Valid_Password(password);

		// assert
		assertFalse(actual);
	}

	@Test
	public void validatePassword_AllRulesMet() {
		// setup
		String password = "Abcdefg555";

		// execute
		boolean actual = CommonUtils.is_Valid_Password(password);

		// assert
		assertTrue(actual);
	}

}
