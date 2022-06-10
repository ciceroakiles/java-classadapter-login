package controller.adapt;

import controller.LoginToken;
import model.DadosLogin;

public class LoginTKAdapter implements _ILoginService {

	private LoginToken loginToken;
	
	public LoginTKAdapter(LoginToken loginToken) {
		this.loginToken = loginToken;
	}
	
	@Override
	public void loginAdapt(DadosLogin dadosLogin) {
		loginToken.enviarToken(dadosLogin.getToken());
	}
}
