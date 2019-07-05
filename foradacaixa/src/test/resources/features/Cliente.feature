#language: pt
#encoding: iso-8859-1

@GoogleChrome
Funcionalidade: Teste de Login

  @login
  Cenario: Inserir cliente pessoa fisica
    Dado que eu faca login no sistema
    E acesso o menu clientes
    Quando informo os dados da pessoa
    E clico em avancar
    E informo os enderecos
    E clico em salvar
    Entao eu valido a mensagem de sucesso
    E faco o logout do sistema
