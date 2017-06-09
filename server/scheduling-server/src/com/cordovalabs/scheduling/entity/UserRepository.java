package com.cordovalabs.scheduling.entity;

import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class UserRepository {

	@Inject
	private EntityManager em;

	/**
	 * Busca por um único usuário.
	 * 
	 * @param id
	 * @return {@link UserEntity}
	 */
	public UserEntity find(String id) {
		return em.find(UserEntity.class, id);
	}
	
	/**
	 * Busca todos os usuários.
	 * 
	 * @param id
	 * @return {@link List}{@link UserEntity}
	 */
	public List<UserEntity> find() {
		return em.createNamedQuery("all",UserEntity.class).getResultList();
	}

	/**
	 * Salva um novo usuário, gerando um UUID.
	 * 
	 * @param newUser
	 * @return {@link UserEntity}
	 */
	public UserEntity save(UserEntity newUser) {
		newUser.setId(UUID.randomUUID().toString());
		em.persist(newUser);
		return newUser;
	}

	/**
	 * Altera um usuário.
	 * 
	 * @param newUser
	 * @return {@link UserEntity}
	 */
	public UserEntity update(UserEntity user) {
		return em.merge(user);
	}

}
