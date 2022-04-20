/* * *
 * 
 * SIW - Homework 1 - 20210420
 * Francesco Martino - 547193
 * 
 * * */

package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Corso {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private LocalDate dataInizio;
	
	@Column(nullable = false)
	private Integer durata;
	
	//qui posso assumere che la strategia di fetch di default (Eager) sia coerente con i casi d'uso:
	//quando accedo ad un corso accedo in automatico al docente
	@ManyToOne
	private Docente docenteAssegnato;

	//qui assumo che non valga la pena modificare la strategia fetch di default (Lazy), perche' nei casi d'uso
	//non e' specificato che un accesso ad un corso implichi l'accesso a tutti i suoi allievi iscritti
	@ManyToMany
	private List<Allievo> allieviIscritti;
	
	protected Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected LocalDate getDataInizio() {
		return dataInizio;
	}

	protected void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	protected Integer getDurata() {
		return durata;
	}

	protected void setDurata(Integer durata) {
		this.durata = durata;
	}

	protected List<Allievo> getAllieviIscritti() {
		return allieviIscritti;
	}

	protected void setAllieviIscritti(List<Allievo> allieviIscritti) {
		this.allieviIscritti = allieviIscritti;
	}

	protected Docente getDocenteAssegnato() {
		return docenteAssegnato;
	}

	protected void setDocenteAssegnato(Docente docenteAssegnato) {
		this.docenteAssegnato = docenteAssegnato;
	}
	
	

}
