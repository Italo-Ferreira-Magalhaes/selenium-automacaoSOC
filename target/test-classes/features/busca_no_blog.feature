# language: pt


  Funcionalidade: Realizar uma busca no Blog do site SOC
    Eu como usuário
    Quero realizar uma busca no blog
    Para visualizar as informações necessárias


  @Regressivo
  @Test_Blog
  Cenário: Verificar se busca no blog é realizada corretamente
    Dado acesso o blog da SOC
    Quando eu realizo uma busca "Formação Super SOC"
    Então valido o resultado da busca por "Formação Super SOC" "https://www.soc.com.br/formacao-super-soc/"