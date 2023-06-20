# language: pt

  Funcionalidade: Realizar uma busca de credenciado SOC
    Eu como usuário
    Quero realizar uma busca de credenciados SOC
    Para visualizar as informações necessárias

  @Regressivo
  @Test_Credenciado
  Cenário: Verificar se busca de credenciado é realizada corretamente
    Dado acesso o blog da SOC
    Quando acesso o menu Rede SOCNET
    E acesso a busca Rede Credenciado SOCNET
    E realizo a busca do credenciado "GMP Treinamento"
    E acesso o perfil do credenciado
    Então valido o nome do credenciado "GMP TREINAMENTO SERVICOS E CONSULTORIA PROFISSIONAL LTDA"
    E valido o CNPJ do credenciado "56.966.070/0001-53"