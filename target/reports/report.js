$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/busca_de_credenciado.feature");
formatter.feature({
  "name": "Realizar uma busca de credenciado SOC",
  "description": "    Eu como usuário\n    Quero realizar uma busca de credenciados SOC\n    Para visualizar as informações necessárias",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Verificar se busca de credenciado é realizada corretamente",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@Regressivo"
    },
    {
      "name": "@Test_Credenciado"
    }
  ]
});
formatter.step({
  "name": "acesso o blog da SOC",
  "keyword": "Dado "
});
formatter.match({
  "location": "BlogSteps.acesso_o_blog_da_SOC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso o menu Rede SOCNET",
  "keyword": "Quando "
});
formatter.match({
  "location": "BlogSteps.acesso_o_menu_Rede_SOCNET()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso a busca Rede Credenciado SOCNET",
  "keyword": "E "
});
formatter.match({
  "location": "RedeCredSocnetSteps.acesso_a_busca_rede_credenciado_socnet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "realizo a busca do credenciado \"GMP Treinamento\"",
  "keyword": "E "
});
formatter.match({
  "location": "SocnetSteps.realizo_a_busca_do_credenciado(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso o perfil do credenciado",
  "keyword": "E "
});
formatter.match({
  "location": "SocnetSteps.acesso_o_perfil_do_credenciado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido o nome do credenciado \"GMP TREINAMENTO SERVICOS E CONSULTORIA PROFISSIONAL LTDA\"",
  "keyword": "Então "
});
formatter.match({
  "location": "SocnetSteps.valido_o_nome_do_credenciado(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido o CNPJ do credenciado \"56.966.070/0001-53\"",
  "keyword": "E "
});
formatter.match({
  "location": "SocnetSteps.valido_o_cnpj_do_credenciado(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/busca_no_blog.feature");
formatter.feature({
  "name": "Realizar uma busca no Blog do site SOC",
  "description": "    Eu como usuário\n    Quero realizar uma busca no blog\n    Para visualizar as informações necessárias",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Verificar se busca no blog é realizada corretamente",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@Regressivo"
    },
    {
      "name": "@Test_Blog"
    }
  ]
});
formatter.step({
  "name": "acesso o blog da SOC",
  "keyword": "Dado "
});
formatter.match({
  "location": "BlogSteps.acesso_o_blog_da_SOC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu realizo uma busca \"Formação Super SOC\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "BlogSteps.eu_realizo_uma_busca(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido o resultado da busca por \"Formação Super SOC\"",
  "keyword": "Então "
});
formatter.match({
  "location": "BuscaSteps.valido_o_resultado_da_busca(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
});