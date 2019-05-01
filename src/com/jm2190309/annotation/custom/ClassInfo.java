package com.jm2190309.annotation.custom;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ClassInfo {
	String author() default "Atul";

	String[] reviewers() default { "Fowler" };

	String purpose();

	int version() default 1;
}
