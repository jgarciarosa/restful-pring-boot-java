# restful-pring-boot-java

Projeto desenvolvido e disponibilizado para fins de consultas e estudos.

---

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
 
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

- [MySQL](https://www.mysql.com/)

- [Lombok](https://projectlombok.org/)

- [ModelMapper](https://modelmapper.org/)

- [Flyway Core](https://flywaydb.org/)

- [Jackson Dataformat XML](https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-xml)

- [Soring HATEOAS](https://spring.io/projects/spring-hateoas)


# Setup da aplicação (local)

## Pré-requisito

Antes de rodar a aplicação é preciso garantir que as seguintes dependências estejam corretamente instaladas:
```
Java 21
MySQL 8
Maven 3.9.5 
```
Bem como o plugin do Lombok instalado em sua IDE (acesse a página de instalação no site do Lombok), segue orientação para IntelliJ IDEA:
```
 * Go to File > Settings > Plugins
 * Click on Browse repositories...
 * Search for Lombok Plugin
 * Click on Install plugin
 * Restart IntelliJ IDEA 
```

## Preparando ambiente

É necessário a criação da base de dados relacional no MySQL

```
CREATE DATABASE 'rest_spring_boot_java';
```

## Instalação da aplicação

Primeiramente, faça o clone do repositório:
```
https://github.com/jgarciarosa/rest-pring-boot-java.git
```
Feito isso, acesse o projeto:
```
cd productivity-with-spring
```
É preciso compilar o código e baixar as dependências do projeto:
```
mvn clean package
```
Antes de iniciar o projeto, acesse o arquivo application.yml e altere o campo password, com a senha configurada no seu banco:
```
password: Dev@1234
```
Finalizado esse passo, vamos iniciar a aplicação:
```
mvn spring-boot:run
```
Pronto. A aplicação está disponível em http://localhost:8080

# API

O projeto disponibiliza uma API RESTful: Person, onde utiliza o padrão RESTful de comunicação, produzindo e consumindo arquivos no formato JSON(padrão) e XML. O cliente da RESTful API pode expressar qual o tipo de informação que ele deseja receber a resposta através do hearder Accept.

Ex: Accept: Accept: application/xml ou application/json

Segue abaixo a API disponível no projeto:

#### Person

 - /api/person/v1 (GET)
 - /api/person/v1/{id} (GET)
 - /api/person/v1 (POST)
     - Espera atributos no formato JSON para serem critérios de criação no body da requisição.
     - exemplo json:
    ```
    {
      "person_gender": "Masculino",
      "person_first_name":"Jonas",
      "person_last_name": "Garcia Rosa"
    }
    ```
     - exemplo xml:
    ```
    <PersonVO>
      <person_gender>Masculino</person_gender>
      <person_first_name>Jonas</person_first_name>
      <person_last_name>Garcia Rosa</person_last_name>
    </PersonVO>
    ```
    
 - /api/person/v1/{id} (PUT)
     -  Espera atributos no formato JSON para serem critérios de atualização no body da requisição.
     - exemplo json:
    ```
    {
      "person_gender": "Masculino",
      "person_first_name":"Jonas",
      "person_last_name": "G. R."
    }
    ```
     - exemplo xml:
    ```
    <PersonVO>
      <person_gender>Masculino</person_gender>
      <person_first_name>Jonas</person_first_name>
      <person_last_name>G. R.</person_last_name>
    </PersonVO>
    ```
 - /api/person/v1/{id} (DELETE)
