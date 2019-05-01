package com.jm2190309.annotation.predefined;

import com.jm2190309.annotation.custom.ClassInfo;

@ClassInfo(purpose = "Dog")
public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Dog is barking.");
	}
}
