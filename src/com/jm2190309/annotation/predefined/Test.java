package com.jm2190309.annotation.predefined;

public class Test {

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

	}

}
