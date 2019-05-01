package com.jm2190309.annotation.predefined;

import com.jm2190309.annotation.custom.Calculator;
import com.jm2190309.annotation.custom.Description;

public class Test {
	
	@Description(value = "At variable")
	String str = "Test";

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.makeSound();
		animal.sleep();

		System.out.println("----");

		Animal dog = new Dog();
		dog.eat();
		dog.makeSound();
		dog.sleep();

		System.out.println("----");

		Vehicle vehicle = new Bike();
		vehicle.kickStart();
		vehicle.move();
		vehicle.stop();
		
		System.out.println("----");
		
		Calculator calculator = new Calculator();
		int addition = calculator.add(10, 20);
		System.out.println(addition);

	}

}
