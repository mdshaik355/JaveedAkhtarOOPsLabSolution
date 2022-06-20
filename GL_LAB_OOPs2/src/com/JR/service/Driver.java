package com.JR.service;

import java.util.Scanner;

import com.JR.model.Employee;

public class Driver {

	public static void main(String[] args) {

		Employee employee = new Employee("Javeed", "Akhtar");
		CredentialsService credentialsService = new CredentialsService();
		String generatedEmailAddress;
		char[] generatedPassword;
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			generatedEmailAddress = credentialsService.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			generatedPassword = credentialsService.generatePassword();
			credentialsService.showCredentials(employee, generatedEmailAddress, generatedPassword);
			break;
		case 2:
			generatedEmailAddress = credentialsService.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "adm");
			generatedPassword = credentialsService.generatePassword();
			credentialsService.showCredentials(employee, generatedEmailAddress, generatedPassword);
			break;
		case 3:
			generatedEmailAddress = credentialsService.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "hr");
			generatedPassword = credentialsService.generatePassword();
			credentialsService.showCredentials(employee, generatedEmailAddress, generatedPassword);
			break;
		case 4:
			generatedEmailAddress = credentialsService.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "lg");
			generatedPassword = credentialsService.generatePassword();
			credentialsService.showCredentials(employee, generatedEmailAddress, generatedPassword);
			break;
		default:
			System.out.println("Please enter the valid choice");
		}

		sc.close();
	}

}
