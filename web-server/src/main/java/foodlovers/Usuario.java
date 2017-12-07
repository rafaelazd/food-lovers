package foodlovers;
	
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idUsuario;
	
	private String nome;
	private String sobrenome;
	private String email;
	private int idade;
	private String prefsex;
	private String sexo;
	private String usuario;
	private String senha;
	private String local;
	private String Facebook;
	private String Whatsapp;
	private String Snapchat;
	private String Twitter;
	private String Instagram;
	private String pathfoto;
	
	@Column( columnDefinition = "TEXT" )
	private String biografia;
	
	protected Usuario() {}
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name="usuario_preferencia",
				joinColumns={@JoinColumn(name="idUsuario")},
				inverseJoinColumns={@JoinColumn(name="idPreferencia")})
	private Set<Preferencias> preferencias = new HashSet<Preferencias>();
	
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name="usuario_combinacao",
				joinColumns={@JoinColumn(name="idUsuario")},
				inverseJoinColumns={@JoinColumn(name="idCombinacao")})
	private Set<Combinacoes> combinacoes = new HashSet<Combinacoes>();

	public Usuario(String nome, String sobrenome, String email, int idade, String prefsex, String sexo, String usuario, String senha, String biografia, String local, String Facebook, String Whatsapp, String Snapchat, String Twitter, String Instagram, String pathfoto, HashSet<Preferencias> preferencias, HashSet<Combinacoes> combinacoes) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.idade = idade;
		this.prefsex = prefsex;
		this.sexo = sexo;
		this.usuario = usuario;
		this.senha = senha;
		this.biografia = biografia;
		this.local = local;
		this.Facebook = Facebook;
		this.Whatsapp = Whatsapp;
		this.Snapchat = Snapchat;
		this.Twitter = Twitter;
		this.Instagram = Instagram;
		this.pathfoto = pathfoto;
		this.preferencias = preferencias;
		this.combinacoes = combinacoes;
	}

	public Usuario(String nome, String sobrenome, String email, int idade, String prefsex, String sexo, String usuario, String senha, String biografia, String local, String Facebook, String Whatsapp, String Snapchat, String Twitter, String Instagram, String pathfoto) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.idade = idade;
		this.prefsex = prefsex;
		this.sexo = sexo;
		this.usuario = usuario;
		this.senha = senha;
		this.biografia = biografia;
		this.local = local;
		this.Facebook = Facebook;
		this.Whatsapp = Whatsapp;
		this.Snapchat = Snapchat;
		this.Twitter = Twitter;
		this.Instagram = Instagram;
		this.pathfoto = pathfoto;
	}

	public long getIdusu() {
		return idUsuario;
	}

	public void setIdusu(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPrefSex() {
		return prefsex;
	}

	public void setPrefsex(String prefsex) {
		this.prefsex = prefsex;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getFacebook() {
		return Facebook;
	}

	public void setFacebook(String Facebook) {
		this.Facebook = Facebook;
	}

	public String getWhatsapp() {
		return Whatsapp;
	}

	public void setWhatsapp(String Whatsapp) {
		this.Whatsapp = Whatsapp;
	}

	public String getSnapchat() {
		return Snapchat;
	}

	public void setSnapchat(String Snapchat) {
		this.Snapchat = Snapchat;
	}

	public String getTwitter() {
		return Twitter;
	}

	public void setTwitter(String Twitter) {
		this.Twitter = Twitter;
	}

	public String getInstagram() {
		return Instagram;
	}

	public void setInstagram(String Instagram) {
		this.Instagram = Instagram;
	}
	
	public String getFoto() {
		return pathfoto;
	}

	public void setFoto(String pathfoto) {
		this.pathfoto = pathfoto;
	}
	
	public Set<Preferencias> getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(Set<Preferencias> preferencias) {
		this.preferencias = preferencias;
	}
	
	public Set<Combinacoes> getCombinacoes() {
		return combinacoes;
	}

	public void setCombinacoes(Set<Combinacoes> combinacoes) {
		this.combinacoes = combinacoes;
	}
	
	public void addPreferencia(Preferencias p) {
		this.preferencias.add(p);
		p.addUsuario(this);
	}
	
	public void addCombinacao(Combinacoes c) {
		this.combinacoes.add(c);
		c.addUsuario(this);
	}
}