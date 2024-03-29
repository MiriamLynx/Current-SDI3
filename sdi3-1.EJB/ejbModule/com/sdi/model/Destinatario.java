package com.sdi.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "destinatario")
public class Destinatario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1078497240380183983L;
	private int id;
	private int id_contacto;
	private int id_correo;

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public int getId() {
		return this.id;
	}

	public void setId_Contacto(int id) {
		this.id_contacto = id;
	}

	@XmlElement
	public int getId_Contacto() {
		return this.id_contacto;
	}

	public void setId_Correo(int id) {
		this.id_correo = id;
	}

	@XmlElement
	public int getId_Correo() {
		return this.id_correo;
	}
}
