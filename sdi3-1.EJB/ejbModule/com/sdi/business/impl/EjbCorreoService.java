package com.sdi.business.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import com.sdi.business.impl.classes.correo.FindByLogin;
import com.sdi.business.impl.classes.correo.Save;
import com.sdi.model.Correo;

@Stateless
@WebService(name = "CorreoService")
public class EjbCorreoService implements RemoteCorreoService,
		LocalCorreoService {

	@Override
	public List<Correo> findByLogin(String login) {
		return new FindByLogin().find(login);
	}

	@Override
	public void save(Correo correo) {
		new Save().save(correo);
	}

}
