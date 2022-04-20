/* * *
 * 
 * SIW - Homework 1 - 20210420
 * Francesco Martino - 547193
 * 
 * * */

package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Allievo {
	
	//utilizzo come chiave primaria la matricola dell'allievo
	@Id
	private String matricola;

	@Column(nullable = false)
	private String nome, cognome;
	
	private LocalDate dataNascita;
	
	private String luogoNascita;
		
	private String email;
	
	//qui posso assumere che la strategia di fetch di default (Eager) sia coerente con i casi d'uso:
	//quando accedo ad un allievo accedo in automatico alla sua societa' di appartenenza
	@ManyToOne(cascade = {CascadeType.PERSIST})
	private Societa societa;
	
	//qui assumo che non valga la pena modificare la strategia fetch di default (Lazy), perche' nei casi d'uso
	//non e' specificato che un accesso ad un allievo implichi l'accesso a tutti i suoi corsi frequentati	
	@ManyToMany(mappedBy = "allieviIscritti")
	private List<Corso> corsiFrequentati;

	protected String getMatricola() {
		return matricola;
	}

	protected void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getCognome() {
		return cognome;
	}

	protected void setCognome(String cognome) {
		this.cognome = cognome;
	}

	protected LocalDate getDataNascita() {
		return dataNascita;
	}

	protected void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	protected String getLuogoNascita() {
		return luogoNascita;
	}

	protected void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected Societa getSocieta() {
		return societa;
	}

	protected void setSocieta(Societa societa) {
		this.societa = societa;
	}

	protected List<Corso> getCorsiFrequentati() {
		return corsiFrequentati;
	}

	protected void setCorsiFrequentati(List<Corso> corsiFrequentati) {
		this.corsiFrequentati = corsiFrequentati;
	}
	

}
