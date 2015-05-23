package com.sdi.rest;

import java.util.List;

import com.sdi.business.ContactoService;
import com.sdi.infrastructure.Factories;
import com.sdi.model.Contacto;

public class ContactoServiceRestImpl implements ContactoServiceRest {

	ContactoService service = Factories.services.getContactoService();

	@Override
	public List<Contacto> findByLogin(String login) {
		return service.findByLogin(login);
	}

	@Override
	public List<Contacto> findAdmin() {
		return service.findAdmin();
	}

	@Override
	public void addContact(Contacto c) {
		service.addContact(c);
	}

}
