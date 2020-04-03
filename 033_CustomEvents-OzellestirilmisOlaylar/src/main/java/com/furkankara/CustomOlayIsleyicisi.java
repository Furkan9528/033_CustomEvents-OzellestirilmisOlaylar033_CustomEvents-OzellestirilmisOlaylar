package com.furkankara;

import org.springframework.context.ApplicationListener;

public class CustomOlayIsleyicisi implements ApplicationListener<CustomOlay> {

	@Override
	public void onApplicationEvent(CustomOlay event) {
		System.out.println(" *_*_*_*_* " + event.toString() + " *_*_*_*_* "  );
	}

}
