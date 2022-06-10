package model;

public class DadosLogin {

	private String nome;
	private String senha;
	private int chave;
	private String token;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
