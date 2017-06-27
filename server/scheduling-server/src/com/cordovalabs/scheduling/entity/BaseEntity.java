package com.cordovalabs.scheduling.entity;

import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
	
	@Id
	protected String id;
	
	public BaseEntity() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id != null){
			this.id = id;
		}
	}
}
