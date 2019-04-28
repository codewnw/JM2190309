package com.jm2190309.annotation.predefined;

public class Bike implements Vehicle {

	@Override
	public void kickStart() {
		System.out.println(this.getClass().getSimpleName() + " is kick started.");
	}

	@Override
	public void move() {
		System.out.println(this.getClass().getSimpleName() + " is moving.");

	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " is stoped.");
	}

	@Override
	public void selfStart() {
		// TODO Auto-generated method stub
		
	}

}
