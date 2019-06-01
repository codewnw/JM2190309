package com.jm2190309.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

	public MyServletContextAttributeListener() {
	}

	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println(scae.getName() + " : " + scae.getValue() + " is ADDED.");
	}

	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println(scae.getName() + " is REMOVED.");
	}

	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println(scae.getName() + " : " + scae.getValue() + " is REPLACED.");
	}

}
