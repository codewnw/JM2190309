package com.jm2190309.annotation.custom;

// author = Atul
// purpose = Perform addition of two number
// reviewers = Dilip, Dheeraj
// version = 1
@ClassInfo(author = "John", reviewers = { "Martin", "Bob" }, purpose = "Perform sum of two numbers", version = 2)
public class Calculator {

	@Description(value = "Adds two numbers")
	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

}
