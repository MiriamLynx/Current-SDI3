package com.sdi.business.impl.classes.usuario;

import com.sdi.infrastructure.Factories;
import com.sdi.model.Usuario;
import com.sdi.persistence.UsuarioDao;
import com.sdi.persistence.exception.NotPersistedException;
import com.sdi.persistence.exception.PersistenceException;

public class Update {

	public void update(Usuario user) {
		UsuarioDao dao = Factories.persistence.createUsuarioDao();
		try {
			dao.update(user);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} catch (NotPersistedException e) {
			e.printStackTrace();
		}
	}

}
