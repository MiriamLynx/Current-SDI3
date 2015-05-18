package com.sdi.business;

public interface ServicesFactory {

	UsuarioService getUsuarioService();

	CorreoService getCorreoService();

	ContactoService getContactoService();

	ResetService getResetService();

}
