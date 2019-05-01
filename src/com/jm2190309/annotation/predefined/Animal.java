package com.jm2190309.annotation.predefined;

import com.jm2190309.annotation.custom.Description;

@Description(value = "The animal class")
public class Animal {

	public void eat() {
		System.out.println("Animal is eating.");
	}

	public void makeSound() {
		System.out.println("Animal is making sound.");
	}

	public void sleep() {
		System.out.println("Animal is sleeping.");
	}
}
