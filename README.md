
## CRUD Básico com Spring Boot | Mysql | Hibernate | Java
Projeto simples de cadastro, usando quatro operações básicas usadas em banco relacional.

## Mundo Spring
Foi utilizado o Spring DevTools, Spring Web, Spring Data JPA.

## Classes do Processo: 
Projeto implementado na arquiterua MVC, contendo:
A * Model * do Cadastro, onde fiz o mapeamento da JPA e anotações.
A * Repository * é uma interface, sendo uma classe abstrata.
A * Controller * é realizado a lógica das requisições.

## Processo de decisão/implementação:
Este processo foi pensando de forma simples para o entendimento do CRUD, ou seja, um cadastro simples, contendo:
id, nome, email, cpf e data de nascimento. Onde é possível criar, alterar, deletar e consultar os cadastros.

## Tecnologia envolvidas no projeto:
* Spring DevTools serve para ajudar no start da aplicação;
* Spring Web, ajuda no mapeamento dos endpoints;
* Spring Data Jpa, facilita na persistência dos dados;
* Lombok, serve para ajudar na produtividade do desenvolvimento, de forma reduzir códigos, por meio de anotações.
* Hibernate Validation, foi usado para validações.
* Banco de Dados Relacional * MySQL *.

## Para Duplicação de E-mail e CPF:
Para não ter a duplicidade de e-mail e CPF, foi criado os campo no banco de dados como *Unique* e atribuido no projeto
à anotação @Column(unique=true) na Model.

## Endpoints

|Métodos  |     Caminho                       |
|---------|-----------------------------------|
|Get      |localhost://8080/cadastro          |
|Get{id}  |localhost://8080/cadastro{id}      |
|Post     |localhost://8080/cadastro/create   |
|Del      |localhost://8080/del/{id}          |
|Put      |localhost://8080/update/{id}       |



