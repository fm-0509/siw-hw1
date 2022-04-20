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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity

// impongo con un vincolo che non possano esistere piu' docenti con stesso nome, cognome e p.IVA
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"nome","cognome", "partitaIVA"}))
public class Docente {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome, cognome;
	
	private LocalDate dataNascita;
	
	private String luogoNascita;
	
	private String partitaIVA;
	
	//assumo che dai casi d'uso un accesso ad un Docente abbia interesse ad avere i corsi che il docente tiene
	//quindi utilizzo un fetch di tipo Eager
	@OneToMany(mappedBy = "docenteAssegnato", fetch = FetchType.EAGER)
	private List<Corso> corsiTenuti;

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

	protected String getPartitaIVA() {
		return partitaIVA;
	}

	protected void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}

	protected List<Corso> getCorsiTenuti() {
		return corsiTenuti;
	}

	protected void setCorsiTenuti(List<Corso> corsiTenuti) {
		this.corsiTenuti = corsiTenuti;
	}
	
	

}
