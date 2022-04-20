/* * *
 * 
 * SIW - Homework 1 - 20210420
 * Francesco Martino - 547193
 * 
 * * */

package it.uniroma3.siw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Indirizzo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String via;
	private String provincia;
	private String cap; 
	private String numCivico;
	private String comune;
	
	
	protected Long getId() {
		return id;
	}
	protected void setId(Long id) {
		this.id = id;
	}
	protected String getVia() {
		return via;
	}
	protected void setVia(String via) {
		this.via = via;
	}
	protected String getProvincia() {
		return provincia;
	}
	protected void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	protected String getCap() {
		return cap;
	}
	protected void setCap(String cap) {
		this.cap = cap;
	}
	protected String getNumCivico() {
		return numCivico;
	}
	protected void setNumCivico(String numCivico) {
		this.numCivico = numCivico;
	}
	protected String getComune() {
		return comune;
	}
	protected void setComune(String comune) {
		this.comune = comune;
	}
	

}
