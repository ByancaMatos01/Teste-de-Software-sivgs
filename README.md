# Configurando um projeto Spring Boot com o Spring Tool Suite 
# A configuração de inicialização é uma parte importante da configuração do Spring Boot. 
* Para utilizar o Spring Boot de forma eficaz, é necessário conhecer o processo de inicialização de aplicativos do Spring boot.
* O inicializador é utilizado para diminuir o esforço de configuração manual que precisa ser feita em qualquer projeto. 
* Um inicializador registra um conjunto de dependências específicas (utilizando o arquivo pom.xml do Maven) do tipo de aplicativo 
que o inicializador representa. Todos os inicializadores usam a convenção de nomenclatura: “spring-boot-starter-XYZ”, em que 
XYZ é o tipo de aplicativo que se deseja desenvolver.
* Alguns inicializadores populares do Spring Boot são: 
*  spring-boot-starter-web é utilizado para desenvolver serviços web que seguem o padrão RESTful usando Spring MVC e 
# Tomcat como contêiner do aplicativo integrado. 
* spring-boot-starter-jersey é uma alternativa ao spring-boot-starter-web que usa o Apache Jersey em vez do Spring MVC. 
* spring-boot-starter-jdbc é utilizado para definição do conjunto de conexões do JDBC. Baseia-se na implementação do  conjunto de conexões do JDBC do Tomcat.
  
# 3.1 Criando o projeto no Spring Initializr (API de criação do projeto na Web) 

O primeiro passo para criar o projeto é utilizar o serviço Spring Initializr https://start.spring.io, que fornece um projeto pronto para 
ser importado por uma IDE, além de uma classe “main” Java e o arquivo pom.xml do Maven com as dependências. Para este 
exemplo, as dependências necessárias são: Spring Web, Spring Data JPA, H2 Database (Figura 2): 
No campo Group inclua – “com.fatec”, no campo Name – “sigvs” (substitua pelo nome que identifica o domínio do projeto 
selecionado para o grupo) 
