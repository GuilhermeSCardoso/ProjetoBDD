package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import funcionalidades.ClienteFuncionalidade;
import cucumber.api.java.pt.Entao;

public class ClienteSteps {
	
	ClienteFuncionalidade clienteFuncionalidade = new ClienteFuncionalidade();
	
	@Dado("que eu faca login no sistema")
	public void fazerLogin() {
		
		clienteFuncionalidade.acessarPagina();
	}
	
	@E("acesso o menu clientes")
	public void acessarMenu() {
		
		clienteFuncionalidade.setMenuClientes();
		clienteFuncionalidade.setInserirClientes();
	}
	
	@Quando("informo os dados da pessoa")
	public void informarDadosPessoa() {
		
		clienteFuncionalidade.informarDadosPessoa();
	}
	
	@E("clico em avancar")
	public void clicarAvancar() {
		
		clienteFuncionalidade.clicarAvancar();		
	}
	
	@E("informo os enderecos")
	public void informarEnderecos() {
		
		clienteFuncionalidade.informarEnderecos();
	}
	
	@E("clico em salvar")
	public void clicarSalvar() {
		
		clienteFuncionalidade.clicarSalvar();
	}
	
	@Entao("eu valido a mensagem de sucesso")
	public void validarMensagemSucesso() {
		
		clienteFuncionalidade.validarMsg();
	}
	
	@E("faco o logout do sistema")
	public void fazerLogout() {
		
		clienteFuncionalidade.setLogout();
	}

}
