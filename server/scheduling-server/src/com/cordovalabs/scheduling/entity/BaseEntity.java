package com.cordovalabs.scheduling.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public abstract class BaseEntity {
	
	@Id
	protected String id;
	
	public BaseEntity() {
		this.id = UUID.randomUUID().toString().replace("-", "");
	}

	public String getId() {
		return id;
	}

	protected void setId(String id) {
		if (this.id != null){
			this.id = id;
		}
	}
}
