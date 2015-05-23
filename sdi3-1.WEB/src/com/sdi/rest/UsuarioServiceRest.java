package com.sdi.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sdi.model.Usuario;

@Path("/UsuarioServiceRs")
public interface UsuarioServiceRest {

	@GET
	@Path("{login}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	Usuario find(@PathParam("login") String login);

	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	void updateProfile(Usuario user);

	@GET
	@Path("/activated")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<Usuario> getAllActivated();

	@GET
	@Path("/deactivated")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<Usuario> getAllDeactivated();

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	void newProfile(Usuario user);

}
