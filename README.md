# Trabalho acadêmico, Engenharia da computação (Instituto Infnet - 3 semestre)
## Assessment - Desenvolvimento de Serviços Web e Testes com Java

## O que é ?  
Projeto tem como objetivo de demostrar a compreensão do uso do Framework Spark na construção de uma aplicação, 
utilizando camadas de controller, services para a criação de CRUD e rotas enquanto utiliza maps como um banco de dados em memória (Simulando uma tabela para cada classe) e Lading pages acessadas por meio de rotas 
definidas pela controller e a classe main do projeto.

## OBS: Sobre o projeto
O projeto não possui nenhuma campo validado, processo de CRUD pode e vai lança algum erro caso algum campo seja preenchido com algum dado inválido, 
, também a questão de relacionamento é simples, como o navegador não aceita método http diferente de get, estárei usando o método GET e Post para realizar o 
método DELETE e PUT e também as landings pages possuem uma CSS bem simples.
O Projeto tem como objetivo demostrar a capacidade e a compreenção de trabalhar com o Spark na construção de uma API RSTFUL.

## Sobre Spark

### Vantagens de usar Spark Java
Irei listar 3 motivos que notei durante o uso do spark:
-	Leveza: O spark é muito leve, não exigi muito do computador para iniciar e ele compila o código muito rápido.
-	Simplicidade: O spark ele possui uma organização de projeto pequena para iniciar aplicações.
-	Integração com Front-end: O spark é bem fácil de resgatar dados de um front-end.

### Comparando Spark com SpringBoot
Irei está fazendo está comparação com base em minha experiência, Comparando o Spark com o SpringBoot notei algumas diferenças, 
o Spark compila o código e inicia o servidor muito rápido, com Spring leva cerca de uns 10 segundos com Spark é 2 segundo é muito para fazer 
alterações pequenas e especificas, O Spark também tem a opção de escolhe qual porta o servidor será iniciado com apenas um método , a quantidade de 
dependências para iniciar uma aplicação spark também é menor, em geral o Spark é muitos mais simples que o Spring, entretanto o Spring se destaca 
ao utilizar uma API (caso que não conseguir fazer com Spark), e as rotas com Spring são definidas direto na controller com Spark elas são definidas n
o classe main do programa, considerações finais o Saprk é muito bom de se usar mas possuo mais conhecimento no Framework SpringBoot atualmente, 
logo me sinto meio limitado com o Spark.

## Como o Sark facilita a criação de APIs RestFul
Roteamento simples: fácil de cria uma rota basta um Path (“/URL”) e um atributo Route
Fácil regaste de parâmetros: é fácil recuperar um parâmetro passado para uma rota ou a resposta desta rota, pelos parâmetros (req, res) 
Serialização e desserialização de JSON: O Spark tem suporte integrado para serialização e desserialização de objetos Java para JSON e vice-versa.

## Sobre projeto

### Classes
- Aeroporto (Classe informações sobre o aeroporto, há apenas uma)
- Passagem (Classe "Tabela" está classe possui um numeró fixo,10, e representa as passgens disponiveis
- Cliente (Classe com informções de uma pessoa que terá uma passagem atribuida à ela)
- Funcionario (Responsável por atribuir uma passagem a classe Cliente)
- Endereço (Classe com o Endereço todas as classes do projeto, que se encaixam no contexto)

### Estrutura do projeto
- Classes model.domain (Classes com atributos, getters ,setters, constructos e método toString, classes models)
- Classes model.services (Classes que possui uma estrutura de dados map e métodos que seram usados na controller, cada service faz referência a uma classe model)
- Classe controller (Classes onde será associado um método da classe service a uma rota e também é onde será resgatado os dados das requisiões e dos formulários)
- Classe app (Clase que possui o método main e onde será terá as rotas do projetos)

## Ferramentas usadas
- JDK 17
- InTellij
- maven
- spark


