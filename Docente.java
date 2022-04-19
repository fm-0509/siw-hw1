package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Docente {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome, cognome;
	
	private LocalDate dataNascita;
	
	private String luogoNascita;
	
	private String partitaIVA;
	
	@OneToMany(mappedBy = "docenteAssegnato")
	private List<Corso> corsiTenuti;
	
	

}
