# rest-pring-boot-java

Projeto desenvolvido e disponibilizado para fins de consultas e estudos.

---

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
 
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)

- [MySQL](https://www.mysql.com/)

- [Lombok](https://projectlombok.org/)

- [ModelMapper](https://modelmapper.org/)


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

O projeto disponibiliza uma API: Person, onde utiliza o padrão Rest de comunicação, produzindo e consumindo arquivos no formato JSON.

Segue abaixo a API disponível no projeto:

#### Person

 - /person (GET)
 - /person/{id} (GET)
 - /person (POST)
     - Espera atributos no formato JSON para serem critérios de criação no body da requisição, exemplo:
    ```
    {
      "firstName":"Jonas",
      "lastName: "Garcia Rosa",
      "gender": "Masculino"
    }
    ```
 - /person/{id} (PUT)
     -  Espera atributos no formato JSON para serem critérios de atualização no body da requisição, exemplo:
    ```
    {
      "id": "1"
      "firstName": "Jonas",
      "lastName: "G. R.",
      "gender": "Masculino"
    }
    ```
 - /person/{id} (DELETE)
