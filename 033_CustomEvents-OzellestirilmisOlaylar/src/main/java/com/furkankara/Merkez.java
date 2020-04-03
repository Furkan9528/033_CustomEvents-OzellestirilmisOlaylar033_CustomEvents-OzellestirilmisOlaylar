package com.furkankara;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		
		appCtx.start();
		
		Sozler sozler = appCtx.getBean("sozlerBean", Sozler.class);
		sozler.ekranaYaz();
		
		appCtx.refresh();
		
		CustomOlayYayinlayicisi olayYayinlayicisi
		= appCtx.getBean("customOlayYayinlayicisiBean", CustomOlayYayinlayicisi.class );
		
		olayYayinlayicisi.kontrolYap(1453);
		
		appCtx.stop();
		appCtx.close();
	}

}
