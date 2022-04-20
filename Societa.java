/* * *
 * 
 * SIW - Homework 1 - 20210420
 * Francesco Martino - 547193
 * 
 * * */

package it.uniroma3.siw.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Societa {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//impongo che la ragione sociale debba essere univoca
	@Column(nullable = false, unique = true)
	private String ragioneSociale;
	
	private String telefono;
	
	//più società possono avere lo stesso indirizzo legale --
	//visto che un indirizzo esiste solamente collegato ad una Societa' ho adottato un cascade su Persist e Remove
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	
	private Indirizzo indirizzoSede;

	protected Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	protected String getRagioneSociale() {
		return ragioneSociale;
	}

	protected void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	protected String getTelefono() {
		return telefono;
	}

	protected void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	protected Indirizzo getIndirizzoSede() {
		return indirizzoSede;
	}

	protected void setIndirizzoSede(Indirizzo indirizzoSede) {
		this.indirizzoSede = indirizzoSede;
	}

	
}
