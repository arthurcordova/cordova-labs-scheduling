package com.cordovalabs.scheduling.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User Entity
 * 
 * @author acstapassoli
 *
 */
@XmlRootElement
@Entity
@Table(schema="public", name="tbuser")
@NamedQuery(name="all", query="select u from UserEntity u order by u.login")
public class UserEntity extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	@Column(name="status")
	private Boolean status;
	
	@Column(name="salt")
	private String salt;
	

	public UserEntity() {
		super();
	}

	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public String getSalt() {
		return salt;
	}


	public void setSalt(String salt) {
		this.salt = salt;
	}
	
}
