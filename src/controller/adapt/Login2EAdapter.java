package controller.adapt;

import controller.LoginDuasEtapas;
import model.DadosLogin;

public class Login2EAdapter implements _ILoginService {

	private LoginDuasEtapas loginDuasEtapas;
	
	public Login2EAdapter(LoginDuasEtapas loginDuasEtapas) {
		this.loginDuasEtapas = loginDuasEtapas;
	}
	
	@Override
	public void loginAdapt(DadosLogin dadosLogin) {
		loginDuasEtapas.fazerLogin(dadosLogin.getNome(), dadosLogin.getSenha());
		loginDuasEtapas.confirmarSegundaEtapa(dadosLogin.getChave());
	}
}
