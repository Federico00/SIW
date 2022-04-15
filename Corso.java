import javax.persistence.*;

import java.time.LocalDate;
import java.util.*;

@Entity
public class Corso {
	
	@Id
	private String nome;
	
	private LocalDate dataInizio;
	private LocalDate dataFine;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Allievo> allievi;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Docente docente;
	
	public Corso() {}

	public Corso(String nome, LocalDate dataInizio, LocalDate dataFine) {
		super();
		this.nome = nome;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

	@Override
	public String toString() {
		return "Corso [nome=" + nome + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Corso other = (Corso) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}
	
	

}
