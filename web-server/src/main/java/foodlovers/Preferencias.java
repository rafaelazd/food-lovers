package foodlovers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Preferencias {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPreferencia;

	private String nome;

	protected Preferencias() {}
	
	public Preferencias(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}