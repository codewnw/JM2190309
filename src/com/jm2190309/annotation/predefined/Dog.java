package com.jm2190309.annotation.predefined;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println(this.getClass().getSimpleName() + " is barking.");
	}
}
