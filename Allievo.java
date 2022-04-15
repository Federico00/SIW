import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

/**
 * 
 * @author Federico Paolucci
 * 
 * Ho deciso di modificare il fetch da Lazy a Eager
 * dell'associazione many to many poichè gli elementi successivi associati 
 * sono in relazione many to one.
 * 
 * Ho applicato un attributo cascade persist a tutte le associazioni in base alla loro direzione,
 * il cascade remove mi sembra giusto nel caso di rimozione di un corso, infatti a cascata rimuoverò i suoi allievi,
 * idem tra corso e docente e società.
 * 
 */

@Entity
public class Allievo {
	
	@Id
	private int matricola;
	
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private String luogoNascita;
	private String email;
	
	@ManyToMany(mappedBy = "allievi",fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST})
	private List<Corso> corsi;
	
	@ManyToOne(cascade = {CascadeType.PERSIST,  CascadeType.REMOVE})
	private Società società;
	
	public Allievo() {
    }	
	
	public Allievo(int matricola, String nome, String cognome, LocalDate dataNascita, String luogoNascita, String email) {
		
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.email = email;
	}

	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
    public boolean equals(Object obj) {
        Allievo allievo = (Allievo)obj;
        return this.getMatricola() == allievo.getMatricola();
   }

    public int hashCode() {
        return this.matricola + this.nome.hashCode();
     }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Allievo");
        sb.append("{matricola=").append(matricola);
        sb.append(", nome='").append(nome);
        sb.append(", cognome=").append(cognome);
        sb.append(", email='").append(email);
        sb.append(", dataNascita='").append(dataNascita);
        sb.append(", luogoNascita='").append(luogoNascita);
        sb.append("}\n");
        return sb.toString();
    }

}
