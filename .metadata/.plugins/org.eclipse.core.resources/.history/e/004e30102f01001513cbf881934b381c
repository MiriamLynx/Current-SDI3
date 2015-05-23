package com.sdi.rest;

import java.util.List;

import com.sdi.business.CorreoService;
import com.sdi.infrastructure.Factories;
import com.sdi.model.Correo;

public class CorreoServiceRestImpl implements CorreoServiceRest {

	CorreoService service = Factories.services.getCorreoService();

	@Override
	public List<Correo> findByLogin(String login) {
		return service.findByLogin(login);
	}

	@Override
	public void save(Correo correo) {
		service.save(correo);
	}

}
