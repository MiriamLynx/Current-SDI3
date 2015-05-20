package com.sdi.business.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import com.sdi.business.impl.classes.contacto.AddContact;
import com.sdi.business.impl.classes.contacto.FindAdmin;
import com.sdi.business.impl.classes.contacto.FindByLogin;
import com.sdi.model.Contacto;

@Stateless
@WebService(name = "ContactoService")
public class EjbContactoService implements RemoteContactoService,
		LocalContactoService {

	@Override
	public List<Contacto> findByLogin(String login) {
		return new FindByLogin().find(login);
	}

	@Override
	public List<Contacto> findAdmin() {
		return new FindAdmin().find();
	}

	@Override
	public void addContact(Contacto c) {
		new AddContact().addContact(c);
	}
}
