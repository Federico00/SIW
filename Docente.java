import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Docente {
	
	@Id
	private int partitaIva;
	
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private String luogoNascita;
	
	@OneToMany(mappedBy = "docente",cascade = {CascadeType.PERSIST})
	private List<Corso> corsi;
	
	public Docente( ) {}
	
	public Docente(int partitaIva, String nome, String cognome, LocalDate dataNascita, String luogoNascita) {
		super();
		this.partitaIva = partitaIva;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
	}



	@Override
	public String toString() {
		return "Docente [partitaIva=" + partitaIva + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita="
				+ dataNascita + ", luogoNascita=" + luogoNascita + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + partitaIva;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Docente other = (Docente) obj;
		if (partitaIva != other.partitaIva)
			return false;
		return true;
	}



	public int getPartitaIva() {
		return partitaIva;
	}
	public void setPartitaIva(int partitaIva) {
		this.partitaIva = partitaIva;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	
	

}
