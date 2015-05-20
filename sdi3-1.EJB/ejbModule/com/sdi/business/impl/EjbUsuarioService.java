package com.sdi.business.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import com.sdi.business.impl.classes.usuario.AddUser;
import com.sdi.business.impl.classes.usuario.FindAllActivated;
import com.sdi.business.impl.classes.usuario.FindAllDeactivated;
import com.sdi.business.impl.classes.usuario.FindByLogin;
import com.sdi.business.impl.classes.usuario.Update;
import com.sdi.model.Usuario;

@Stateless
@WebService(name = "UsuarioService")
public class EjbUsuarioService implements RemoteUsuarioService,
		LocalUsuarioService {

	@Override
	public Usuario find(String login) {
		return new FindByLogin().find(login);
	}

	@Override
	public void updateProfile(Usuario user) {
		new Update().update(user);
	}

	@Override
	public List<Usuario> getAllActivated() {
		return new FindAllActivated().findActivated();
	}

	@Override
	public List<Usuario> getAllDeactivated() {
		return new FindAllDeactivated().findDeactivated();
	}

	@Override
	public void newProfile(Usuario user) {
		new AddUser().add(user);
	}
}
