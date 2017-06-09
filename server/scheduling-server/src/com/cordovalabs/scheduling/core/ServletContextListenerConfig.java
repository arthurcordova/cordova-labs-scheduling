package com.cordovalabs.scheduling.core;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerConfig implements ServletContextListener{

	@Inject
	private StartupApp startupApp;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ContextServlet INICIALIZADO");
		startupApp.init();
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ContextServlet Destruido");
		startupApp.finaliza();
	}
	
}
