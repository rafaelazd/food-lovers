package foodlovers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Preferencias {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPreferencia;

	protected Preferencias() {}

	private String nome;
	private String filepath;
	
	@ManyToMany(mappedBy="preferencias", cascade=CascadeType.ALL)
	private List<Usuario> usuario = new ArrayList<Usuario>();

	public Preferencias(String nome, String filepath) {
		this.nome = nome;
		this.filepath = filepath;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

}