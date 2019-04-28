package com.jm2190309.annotation.predefined;

public interface Vehicle {

	@Deprecated
	void kickStart();

	void move();

	void stop();
	
	void selfStart();

}
