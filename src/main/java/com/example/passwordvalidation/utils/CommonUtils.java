package com.example.passwordvalidation.utils;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author vsrr.ramanujadasu
 *
 */
public class CommonUtils {

	public static final int PASSWORD_LENGTH = 8;

	public static boolean is_UppderCase_Letter(char ch) {

		return Character.isUpperCase(ch);
	}

	public static boolean is_LowerCase_Letter(char ch) {

		return Character.isLowerCase(ch);
	}

	public static boolean is_Numeric(char ch) {

		return Character.isDigit(ch);
	}

	public static boolean is_Valid_Password(String password) {

		// Add feature: Password is OK if at least three of the previous conditions is
		// true
		int condition = 0;
		boolean mondatoryCondition = false;

		if (StringUtils.isEmpty(password)) {
			System.out.println("Password is Empty");
			return false;
		}

		if (password.length() < PASSWORD_LENGTH) {
			System.out.println("Password is lessthan 8 characters");
			return false;
		}
		{
			condition++;
			mondatoryCondition = true;
		}

		int upperCaseCharCount = 0;
		int lowerCaseCharCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);
			if (is_UppderCase_Letter(ch)) {
				upperCaseCharCount++;
				continue;
			}
			if (is_LowerCase_Letter(ch)) {
				lowerCaseCharCount++;
				continue;
			} else if (is_Numeric(ch)) {
				numCount++;
				continue;
			}
			// To check other character found - It is not requirement
			// else
			// return false;
		}
		System.out.println("\n Password contains the UpperCaseChar: " + upperCaseCharCount + ", LowerCaseCharCount: "
				+ lowerCaseCharCount + ", DigitCount: " + numCount);

		if (upperCaseCharCount >= 1) {
			condition++;
		}
		if (lowerCaseCharCount >= 1) {
			condition++;
		}
		if (numCount >= 1) {
			condition++;
		}
		System.out.println("\n Password contains the Add Feature1: number of conditions are satified: " + condition);
		// upperCaseCharCount >= 1 && lowerCaseCharCount >= 1 && numCount >= 1 &&
		return (condition >= 3 && mondatoryCondition);
	}

//	public static void main(String[] args) {
//
//		System.out.println("1. password should be larger than 8 chars.\n" + "2. password should not be null. \n"
//				+ "3. password should have one uppercase letter at least.\n"
//				+ "4. password should have one lowercase letter at least \n"
//				+ "5. password should have one number at least. \n"
//				+ "Add Feature1: password is OK if at least three of the previous conditions is true.\n"
//				+ "Add Feature2: password is never OK if item password is 1.d is not true.\n"
//				+ "Input a password (You are agreeing to the above Terms and Conditions.): ");
//		String test0 = "Te@123";// invalid
//		String test1 = "12345566";// invalid
//		String test2 = "Test12345"; // valid
//		String test3 = "";// invalid
//		String test4 = "test12345"; // invalid
//		String test5 = "testtest";// invalid
//		String test6 = "TTTTTTTT"; // invalid
//		String test7 = "Test@123"; // valid
//
//		String givenPassword = test0;
//		if (is_Valid_Password(givenPassword)) {
//			System.out.println("Password is valid: " + givenPassword);
//		} else {
//			System.out.println("Not a valid password: " + givenPassword);
//		}
//	}

}
