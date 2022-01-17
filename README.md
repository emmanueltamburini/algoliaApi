# README #
This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###
The purpose of the following project is to make use of an external api provided by a url, in this case https://hn.algolia.com/api/v1/search_by_date?query=java, to obtain the information it must be used endpoint http://localhost:8080/api.

As an additional point, the http://localhost:8080/api endpoint was designed so that a query parameter can be added to search for other news, for example http://localhost:8080/api?query=phyton, otherwise add this parameter by default it will look for JAVA information

## Requirements:
* OpenJDK 11 or greater
* Maven 3.6 or greater

## Installing dependencies
* Using maven (java): `mvn dependency:resolve`

## How to run it during development:
* Using maven: `mvn spring-boot:run`

## Quick setup:
* Para usar la aplicación solo debe realizar una copia en su ordenador en local.

* Configurar el campo url.to.get si desea cambiar la url que se desea consultar (ya viene por defecto con la dirección https://hn.algolia.com/api/v1/search_by_date)

* Luego en una consola dentro de la carpeta deberá correr el comando 
`mvn dependency:resolve`

* Y por último el comando `mvn spring-boot:run`

* Y ya estará todo listo para usar la api mediante la dirreción http://localhost:8080/api

* Recodatorio: puede usar un parámetro query (http://localhost:8080/api?query=phyton) para realizar búsquedas de otras noticias

### Some Dev references:

* [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
* [Spring Data REST](https://docs.spring.io/spring-data/rest/docs/current/reference/html/)
* [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/current/reference/html/)
* [Structuring Your Code](https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-structuring-your-code.html)
* [Java Bean Validation Basics](https://www.baeldung.com/javax-validation)
