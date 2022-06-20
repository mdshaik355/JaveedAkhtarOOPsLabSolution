package com.JR.service;

import java.util.Random;

import com.JR.model.Employee;

public class CredentialsService {

	public char[] generatePassword() {

		char[] password = new char[8];
		String numbers = "1234567890";
		String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = capitalChars.toLowerCase();
		String specialChars = "!@#$%^&*_=+<>?./";
		String values = numbers + capitalChars + smallChars + specialChars;

		Random random = new Random();
		password[0] = capitalChars.charAt(random.nextInt(capitalChars.length()));
		password[1] = smallChars.charAt(random.nextInt(smallChars.length()));
		password[2] = numbers.charAt(random.nextInt(numbers.length()));
		password[3] = specialChars.charAt(random.nextInt(specialChars.length()));

		for (int i = 4; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}

		return password;

	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		StringBuffer sb = new StringBuffer();
		sb.append(firstName);
		sb.append(lastName);
		sb.append("@");
		sb.append(department);
		sb.append(".abc.com");
		return sb.toString();

	}

	public void showCredentials(Employee employee, String email, char[] generatePassword) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email--->" + email);
		System.out.println("Password-->" + new String(generatePassword));
	}
}
