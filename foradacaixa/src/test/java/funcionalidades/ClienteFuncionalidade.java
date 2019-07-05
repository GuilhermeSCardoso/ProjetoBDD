package funcionalidades;

import pages.ClientePage;
import pages.EnderecoPage;
import readers.Config;

public class ClienteFuncionalidade extends ClientePage {
	
	ClientePage clientePage = new ClientePage();
	EnderecoPage enderecoPage = new EnderecoPage();

	public void informarDadosPessoa() {
		
		if(Config.getProperty("cliente.tipo_pessoa").equals("fisica"))
			clientePage.setFisica();
		
		if(Config.getProperty("cliente.tipo_pessoa").equals("juridica"))
			clientePage.setJuridica();
		
		clientePage.setCpfCnpj(Config.getProperty("cliente.cpf_cnpj"));
		clientePage.setNomeRazaoSocial(Config.getProperty("cliente.nome_razao_social"));
		clientePage.setEmail(Config.getProperty("cliente.email"));
		clientePage.setDataNasc(Config.getProperty("cliente.data_nasc"));
		clientePage.setSexo(Config.getProperty("cliente.sexo"));
		clientePage.setEstadoCivil(Config.getProperty("cliente.estado_civil"));
	}

	public void clicarAvancar() {
		
		clientePage.setAvancar();
	}

	public void informarEnderecos() {
		
		enderecoPage.setCepPrincipal(Config.getProperty("endereco.cep"));
		enderecoPage.setEnderecoPrincipal(Config.getProperty("endereco.endereco"));
		enderecoPage.setNumeroPrincipal(Config.getProperty("endereco.numero"));
		enderecoPage.setComplementoPrincipal(Config.getProperty("endereco.complemento"));
		enderecoPage.setCidadePrincipal(Config.getProperty("endereco.cidade"));
		enderecoPage.setEstadoPrincipal(Config.getProperty("endereco.estado"));
		enderecoPage.setTelefonePrincipal(Config.getProperty("endereco.telefone"));
		enderecoPage.setCelularPrincipal(Config.getProperty("endereco.celular"));		
		enderecoPage.setCepCobranca(Config.getProperty("endereco.cep"));
		enderecoPage.setEnderecoCobranca(Config.getProperty("endereco.endereco"));
		enderecoPage.setNumeroCobranca(Config.getProperty("endereco.numero"));
		enderecoPage.setComplementoCobranca(Config.getProperty("endereco.complemento"));
		enderecoPage.setCidadeCobranca(Config.getProperty("endereco.cidade"));
		enderecoPage.setEstadoCobranca(Config.getProperty("endereco.estado"));
		enderecoPage.setTelefoneCobranca(Config.getProperty("endereco.telefone"));
		enderecoPage.setCelularCobranca(Config.getProperty("endereco.celular"));
	}

	public void clicarSalvar() {
		
		enderecoPage.setSalvar();
	}

	public void validarMsg() {
		
		//TODO
	}

}
