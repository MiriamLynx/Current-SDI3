package com.sdi.rest;

import java.util.HashSet;
import java.util.Set;

public class Application extends javax.ws.rs.core.Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> res = new HashSet<>();
		res.add(UsuarioServiceRestImpl.class);
		res.add(ContactoServiceRestImpl.class);
		res.add(ResetServiceRestImpl.class);
		res.add(CorreoServiceRestImpl.class);
		return res;
	}

}
