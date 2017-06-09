package com.cordovalabs.scheduling.core;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@ApplicationScoped
public class StartupApp {

	@PersistenceUnit(name = "scheduling-server-pu")
	private EntityManagerFactory entityManagerFactory;

	public void init() {
		System.out.println("passou no INIT context");
	}

	public void finaliza() {
		this.entityManagerFactory.close();
		System.out.println("Passou no DestroyContext ");
	}

	@Produces
	@RequestScoped
	public EntityManager getEntityManager() {
		return this.entityManagerFactory.createEntityManager();
	}

	public void destroyEntityManager(@Disposes EntityManager em) {
		em.close();
	}

}
