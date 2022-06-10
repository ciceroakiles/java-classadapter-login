package view;

import controller.LoginDuasEtapas;
import controller.LoginToken;
import controller.adapt.Login2EAdapter;
import controller.adapt.LoginTKAdapter;
import controller.adapt._ILoginService;
import model.DadosLogin;
import model.DadosLoginBuilder;

public class Principal {

	public static void main(String[] args) {
		_ILoginService lserv;
		
		DadosLogin d1 = DadosLoginBuilder.builder()
				.addNomeSenha("user", "pass")
				.addChave(42)
				.get();
		LoginDuasEtapas log1 = new LoginDuasEtapas();
		
		//lserv = new Login2EAdapter(log1);
		//lserv.loginAdapt(d1);
		
		DadosLogin d2 = DadosLoginBuilder.builder()
				.addToken("tolkien")
				.get();
		LoginToken log2 = new LoginToken();
		
		//lserv = new LoginTKAdapter(log2);
		//lserv.loginAdapt(d2);
	}
}
