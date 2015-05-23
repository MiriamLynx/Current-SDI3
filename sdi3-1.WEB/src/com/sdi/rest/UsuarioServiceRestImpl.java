package com.sdi.rest;

import java.util.List;

import com.sdi.business.UsuarioService;
import com.sdi.infrastructure.Factories;
import com.sdi.model.Usuario;

public class UsuarioServiceRestImpl implements UsuarioServiceRest {

	UsuarioService service = Factories.services.getUsuarioService();

	@Override
	public Usuario find(String login) {
		return service.find(login);
	}

	@Override
	public void updateProfile(Usuario user) {
		service.updateProfile(user);
	}

	@Override
	public List<Usuario> getAllActivated() {
		return service.getAllActivated();
	}

	@Override
	public List<Usuario> getAllDeactivated() {
		return service.getAllDeactivated();
	}

	@Override
	public void newProfile(Usuario user) {
		service.newProfile(user);
	}

}
