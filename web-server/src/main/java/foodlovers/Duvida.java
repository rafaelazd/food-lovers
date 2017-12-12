package foodlovers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duvida {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idDuvida;

	protected Duvida() {}

	private String nome;
	private String email;
	private String avaliacao;
	
	@Column( columnDefinition = "TEXT" )
	private String duvida;

	public Duvida(String nome, String email, String avaliacao, String duvida) {
		this.nome = nome;
		this.email = email;
		this.avaliacao = avaliacao;
		this.duvida = duvida;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public String getDuvida() {
		return duvida;
	}

	public void setDuvida(String duvida) {
		this.duvida = duvida;
	}

}
