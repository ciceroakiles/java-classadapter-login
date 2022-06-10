package model;

public class DadosLoginBuilder {

	private DadosLogin dadosLogin;
	
	public DadosLoginBuilder() {
		this.dadosLogin = new DadosLogin();
	}
	
	public static DadosLoginBuilder builder() {
		return new DadosLoginBuilder();
	}
	
	public DadosLoginBuilder addNomeSenha(String nome, String senha) {
		dadosLogin.setNome(nome);
		dadosLogin.setSenha(senha);
		return this;
	}
	
	public DadosLoginBuilder addChave(int chave) {
		dadosLogin.setChave(chave);
		return this;
	}
	
	public DadosLoginBuilder addToken(String token) {
		dadosLogin.setToken(token);
		return this;
	}
	
	public DadosLogin get() {
		return this.dadosLogin;
	}
}
