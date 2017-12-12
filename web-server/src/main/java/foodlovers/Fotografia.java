package foodlovers;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Fotografia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idFotografia;
	
	protected Fotografia() {}
	
	private String pathfotografia;
	
	@Column( columnDefinition = "TEXT" )
	private String descricao;
	
	
	  @ManyToOne(fetch = FetchType.LAZY)
	  @JoinColumn (name="usuario",referencedColumnName="idUsuario")
	  private Usuario usuario;
	  
	  	public Fotografia(String pathfotografia, String descricao) {
			this.pathfotografia = pathfotografia;
			this.descricao = descricao;
	  	}
	  
	  	public Fotografia(String pathfotografia, String descricao, Usuario usuario) {
			this.pathfotografia = pathfotografia;
			this.descricao = descricao;
			this.usuario = usuario;
	  	}
	  
	  	public long getIdFoto() {
			return idFotografia;
		}

		public void setIdFoto(long idFotografia) {
			this.idFotografia = idFotografia;
		}
		
		public String getPathFotografia() {
			return pathfotografia;
		}

		public void setPathFotografia(String pathfotografia) {
			this.pathfotografia = pathfotografia;
		}
		
		public String getDesc() {
			return descricao;
		}

		public void setDesc(String descricao) {
			this.descricao = descricao;
		}
		
		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
}
