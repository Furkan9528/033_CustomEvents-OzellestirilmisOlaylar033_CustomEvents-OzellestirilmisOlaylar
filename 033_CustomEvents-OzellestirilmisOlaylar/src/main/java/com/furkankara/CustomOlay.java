package com.furkankara;

import org.springframework.context.ApplicationEvent;

public class CustomOlay extends ApplicationEvent{
	
	private static final long serialVersionUID = 4964742612580373254L;

	public CustomOlay(Object object) {
		super(object);
		System.out.println(object.toString());
	}

	@Override
	public String toString() {
		return "CustomOlay (Özelleştirilmiş Olay)";
	}
	


}
