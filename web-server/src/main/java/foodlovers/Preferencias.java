package foodlovers;

import java.util.HashSet;
import java.util.Set;

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
	private Set<Usuario> usuario = new HashSet<Usuario>();

	public Preferencias(String nome, String filepath) {
		this.nome = nome;
		this.filepath = filepath;
	}
	
	public long getIdpref() {
		return idPreferencia;
	}

	public void setIdPref(long idPreferencia) {
		this.idPreferencia = idPreferencia;
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
	
	public Set<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	public void addUsuario(Usuario u) {
		this.usuario.add(u);
	}

}