package foodlovers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Combinacoes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCombinacao;
	
	protected Combinacoes() {}
	
	private Date data = new Date( );;

	@ManyToMany(mappedBy="combinacoes", cascade=CascadeType.MERGE)
	private Set<Usuario> usuario = new HashSet<Usuario>();
	
	public Combinacoes(Date data) {
		this.data = data;
	}
	
	public long getIdComb() {
		return idCombinacao;
	}

	public void setIdComb(long idCombinacao) {
		this.idCombinacao = idCombinacao;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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
