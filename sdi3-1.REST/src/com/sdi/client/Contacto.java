package com.sdi.client;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "contacto")
public class Contacto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2879705055112733469L;
	private Integer id;
	private String nombre;
	private String apellidos;
	private String email;
	private String direccion;
	private String ciudad;
	private String agenda_Usuario;

	@XmlElement
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@XmlElement
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	@XmlElement
	public String getAgenda_Usuario() {
		return agenda_Usuario;
	}

	public void setAgenda_Usuario(String agenda_Usuario) {
		this.agenda_Usuario = agenda_Usuario;
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

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElement
	public Integer getId() {
		return id;
	}

}
