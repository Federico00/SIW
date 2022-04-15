import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Società {
	
	@Id
	private String ragioneSociale;
	
	private int numeroTelefonico;
	private String via;
	private String numeroCivico;
	private String comune;
	private String provincia;
	private int cap;
	
	public Società() {
    }	
	
    public Società(String ragioneSociale, int numeroTelefonico, String via, String numeroCivico, String comune, String provincia, int cap) {
    	
		this.ragioneSociale = ragioneSociale;
		this.numeroTelefonico = numeroTelefonico;
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.comune = comune;
		this.provincia = provincia;
		this.cap = cap;
	}



	public String getRagioneSociale() {
		return ragioneSociale;
	}



	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}



	public int getNumeroTelefonico() {
		return numeroTelefonico;
	}



	public void setNumeroTelefonico(int numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}



	public String getVia() {
		return via;
	}



	public void setVia(String via) {
		this.via = via;
	}



	public String getNumeroCivico() {
		return numeroCivico;
	}



	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}



	public String getComune() {
		return comune;
	}



	public void setComune(String comune) {
		this.comune = comune;
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public int getCap() {
		return cap;
	}



	public void setCap(int cap) {
		this.cap = cap;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Società other = (Società) obj;
		if (ragioneSociale == null) {
			if (other.ragioneSociale != null)
				return false;
		} else if (!ragioneSociale.equals(other.ragioneSociale))
			return false;
		return true;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ragioneSociale == null) ? 0 : ragioneSociale.hashCode());
		return result;
	}

    @Override
	public String toString() {
		return "Società [ragioneSociale=" + ragioneSociale + ", numeroTelefonico=" + numeroTelefonico + ", via=" + via
				+ ", numeroCivico=" + numeroCivico + ", comune=" + comune + ", provincia=" + provincia + ", cap=" + cap
				+ "]";
	}

}
