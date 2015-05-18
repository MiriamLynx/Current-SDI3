package com.sdi.business.impl;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.sdi.business.ContactoService;
import com.sdi.business.CorreoService;
import com.sdi.business.ResetService;
import com.sdi.business.ServicesFactory;
import com.sdi.business.UsuarioService;

public class LocalEjbServicesLocator implements ServicesFactory {

	private static final String CONTACTOS_SERVICE_JNDI_KEY = "java:global/"
			+ "sdi3-1/" + "sdi3-1.EJB/" + "EjbContactoService!"
			+ "com.sdi.business.impl.LocalContactoService";

	private static final String CORREOS_SERVICE_JNDI_KEY = "java:global/"
			+ "sdi3-1/" + "sdi3-1.EJB/" + "EjbCorreoService!"
			+ "com.sdi.business.impl.LocalCorreoService";

	private static final String RESET_SERVICE_JNDI_KEY = "java:global/"
			+ "sdi3-1/" + "sdi3-1.EJB/" + "EjbResetService!"
			+ "com.sdi.business.impl.LocalResetService";

	private static final String USUARIOS_SERVICE_JNDI_KEY = "java:global/"
			+ "sdi3-1/" + "sdi3-1.EJB/" + "EjbUsuarioService!"
			+ "com.sdi.business.impl.LocalUsuarioService";

	@Override
	public UsuarioService getUsuarioService() {
		try {
			Context ctx = new InitialContext();
			return (UsuarioService) ctx.lookup(USUARIOS_SERVICE_JNDI_KEY);
		} catch (NamingException e) {
			throw new RuntimeException("JNDI problem", e);
		}
	}

	@Override
	public CorreoService getCorreoService() {
		try {
			Context ctx = new InitialContext();
			return (CorreoService) ctx.lookup(CORREOS_SERVICE_JNDI_KEY);
		} catch (NamingException e) {
			throw new RuntimeException("JNDI problem", e);
		}
	}

	@Override
	public ContactoService getContactoService() {
		try {
			Context ctx = new InitialContext();
			return (ContactoService) ctx.lookup(CONTACTOS_SERVICE_JNDI_KEY);
		} catch (NamingException e) {
			throw new RuntimeException("JNDI problem", e);
		}
	}

	@Override
	public ResetService getResetService() {
		try {
			Context ctx = new InitialContext();
			return (ResetService) ctx.lookup(RESET_SERVICE_JNDI_KEY);
		} catch (NamingException e) {
			throw new RuntimeException("JNDI problem", e);
		}
	}

}
