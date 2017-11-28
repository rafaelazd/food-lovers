package foodlovers;
	
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.ArrayList;
import java.util.List;

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
	
	@Column( columnDefinition = "TEXT" )
	private String biografia;
	
	protected Usuario() {}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="usuario_preferencia",
				joinColumns={@JoinColumn(name="idUsuario")},
				inverseJoinColumns={@JoinColumn(name="idPreferencia")})
	private List<Preferencias> preferencias = new ArrayList<Preferencias>();

	public Usuario(String nome, String sobrenome, String email, int idade, String prefsex, String sexo, String usuario, String senha, String biografia, String local, String Facebook, String Whatsapp, String Snapchat, String Twitter, String Instagram) {
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
	
	public List<Preferencias> getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(List<Preferencias> preferencias) {
		this.preferencias = preferencias;
	}
}