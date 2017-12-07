package foodlovers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Combinacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCombinacao;
	
	protected Combinacao() {}
	
	private Date data = new Date( );

	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn (name="usuario1",referencedColumnName="idUsuario")
	  private Usuario usuario1;
	  
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn (name="usuario2",referencedColumnName="idUsuario")
	  private Usuario usuario2;

	public Combinacao(Date data, Usuario usuario1, Usuario usuario2) {
		this.data = data;
		this.usuario1 = usuario1;
		this.usuario2 = usuario2;
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
	
	public Usuario getUsuario1() {
		return usuario1;
	}

	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}
	
	public Usuario getUsuario2() {
		return usuario2;
	}

	public void setUsuario2(Usuario usuario2) {
		this.usuario2 = usuario2;
	}
}
