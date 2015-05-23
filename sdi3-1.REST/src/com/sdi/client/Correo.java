package com.sdi.client;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;

@XmlRootElement(name = "correo")
public class Correo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8790547852387168756L;
	private Integer id;
	private double fechahora;
	private String asunto;
	private String cuerpo;
	private int carpeta;
	private String login_Usuario;
	private List<Contacto> destinatarios;

	@XmlElement
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElement
	public double getFechahora() {
		return fechahora;
	}

	public void setFechahora(double d) {
		this.fechahora = d;
	}

	@XmlElement
	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	@XmlElement
	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	@XmlElement
	public int getCarpeta() {
		return carpeta;
	}

	public void setCarpeta(int carpeta) {
		this.carpeta = carpeta;
	}

	@XmlElement
	public String getLogin_Usuario() {
		return login_Usuario;
	}

	public void setLogin_Usuario(String login_Usuario) {
		this.login_Usuario = login_Usuario;
	}

	@XmlElement
	public List<Contacto> getDestinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(List<Contacto> destinatarios) {
		this.destinatarios = destinatarios;
	}

	@JsonIgnore
	public String getFormatedDate() {
		return date(getFechahora());
	}

	@Override
	public String toString() {
		return "Correo [asunto=" + asunto + "]";
	}

	public static String date(double d) {
		SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date now = new Date((long) d);
		String strDate = sdfDate.format(now);
		return strDate;
	}

}
