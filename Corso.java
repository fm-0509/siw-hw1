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
	
	@ManyToOne
	private Docente docenteAssegnato;

	@ManyToMany
	private List<Allievo> allieviIscritti;
	
	public Docente getDocenteAssegnato() {
		return docenteAssegnato;
	}

	public void setDocenteAssegnato(Docente docenteAssegnato) {
		this.docenteAssegnato = docenteAssegnato;
	}
	
	

}
