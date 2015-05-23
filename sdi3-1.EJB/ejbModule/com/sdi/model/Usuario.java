package com.sdi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -1814868382112461111L;

	private String login;
	private String passwd;
	private String rol;
	private boolean activo;

	private List<Correo> correos;

	private List<Contacto> contactos;

	// Esta información corresponde a infousuarios
	// Debido a que es una relación 1 a 1
	private int id;
	private String nombre;
	private String apellidos;
	private String email;

	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@XmlElement
	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@XmlElement
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@XmlElement
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public List<Correo> getCorreos() {
		return correos;
	}

	public void setCorreos(List<Correo> correos) {
		this.correos = correos;
	}

	public List<Contacto> getContactos() {
		List<Contacto> clone = new ArrayList<Contacto>();
		if (contactos != null) {
			for (Contacto item : contactos)
				clone.add(item);
		}
		return clone;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}

	public void addContacts(List<Contacto> contactos) {
		for (Contacto c : contactos) {
			this.contactos.add(c);
		}
	}

	public void addContact(Contacto contacto) {
		this.contactos.add(contacto);
	}

	public List<Correo> getBorradores() {
		List<Correo> borradores = new ArrayList<Correo>();
		for (Correo c : correos) {
			if (c.getCarpeta() == 2) {
				borradores.add(c);
			}
		}
		return borradores;
	}

	public List<Correo> getEnviados() {
		List<Correo> enviados = new ArrayList<Correo>();
		for (Correo c : correos) {
			if (c.getCarpeta() == 1) {
				enviados.add(c);
			}
		}
		return enviados;
	}

	public List<Correo> getEliminados() {
		List<Correo> eliminados = new ArrayList<Correo>();
		for (Correo c : correos) {
			if (c.getCarpeta() == 3) {
				eliminados.add(c);
			}
		}
		return eliminados;
	}

	public Correo getBorrador(Integer id) {
		for (Correo c : correos) {
			if (c.getCarpeta() == 2 && c.getId() == id) {
				return c;
			}
		}
		return null;
	}

}
