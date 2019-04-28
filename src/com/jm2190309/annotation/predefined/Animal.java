package com.jm2190309.annotation.predefined;

public class Animal {

	public void eat() {
		System.out.println(this.getClass().getSimpleName() + " is eating.");
	}

	public void makeSound() {
		System.out.println(this.getClass().getSimpleName() + " is making sound.");
	}

	public void sleep() {
		System.out.println(this.getClass().getSimpleName() + " is sleeping.");
	}
}
