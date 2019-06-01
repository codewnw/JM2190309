package com.jm2190309.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestAttributeListener implements ServletRequestAttributeListener {

	public MyRequestAttributeListener() {
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("RequestAttributeListener: " + srae.getName() + " is REMOVED.");
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("RequestAttributeListener: " + srae.getName() + " : " + srae.getValue() + " is ADDED.");
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("RequestAttributeListener: " + srae.getName() + " : " + srae.getValue() + " is REPLACED.");
	}

}
