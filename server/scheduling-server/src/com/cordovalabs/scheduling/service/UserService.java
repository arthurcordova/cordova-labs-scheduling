package com.cordovalabs.scheduling.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cordovalabs.scheduling.entity.*;


@Path("/user")
@Stateless
public class UserService {

	@Inject
	private UserRepository user;
	
	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response insert(UserEntity newUser){
		return Response.status(Response.Status.OK).entity(user.save(newUser)).build();
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(UserEntity newUser){
		return Response.status(Response.Status.OK).entity(user.update(newUser)).build();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id") String id){
		return Response.status(Response.Status.OK).entity(user.find(id)).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(){
		return Response.status(Response.Status.OK).entity(user.find()).header("Access-Control-Allow-Origin","*").build();
	}
	
}
