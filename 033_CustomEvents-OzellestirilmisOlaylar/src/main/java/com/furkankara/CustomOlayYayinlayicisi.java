package com.furkankara;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomOlayYayinlayicisi implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void kontrolYap(int gelenId) {
		CustomOlay customOlay = new CustomOlay(gelenId);
		applicationEventPublisher.publishEvent(customOlay);
	}
}
