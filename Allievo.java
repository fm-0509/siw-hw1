package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
@Entity
public class Allievo {
		
	@Id
	private String matricola;

	@Column(nullable = false)
	private String nome, cognome;
	
	private LocalDate dataNascita;
	
	private String luogoNascita;
	
//	private String matricola;
	
	private String email;
	
	@OneToOne
	private Societa societa;
	
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
