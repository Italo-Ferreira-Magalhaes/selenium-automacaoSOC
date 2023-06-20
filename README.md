*PROJETO DE AUTOMAÇÃO WEB*

Criado: Italo Ferreira Magalhães


Teste de automação da empresa AGE

Automação WEB em Java com Selenium, Junit, Cucumber e Maven
Relatório: trivago (Cluecumber) com evidências.



*GERAÇÃO DE RELATÓRIO E EVIDÊNCIAS*

Execução via terminal com os códigos abaixo:

Primeiro:
- mvn test -Dtest=RunTest -Dbrowser=chrome;

Após a execução anterior, seguir com o código abaixo para gerar o html:
- mvn cluecumber-report:reporting

    
Relatório será criado na pasta "target/formated-report/index.html" contendo as evidências no próprio relatório.