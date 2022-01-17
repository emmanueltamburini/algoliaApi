# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###


### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact

## Requirements:
* OpenJDK 11 or greater
* Maven 3.6 or greater
* Npm 6.14.5 or greater
* Docker version 18.03.1-ce


## Installing dependencies
* Using maven (java): `mvn dependency:resolve`
* Using npm (js): `npm install`

## How to run it during development:
* Using maven: `mvn spring-boot:run`
* Using maven (GUI refresh): `mvn frontend:webpack`
* Using npm (GUI refresh): `npm run-script dev`


### How do I get set up? ###

* Summary of set up
* Configuration
* Dependencies
* Database configuration
* How to run tests
* Deployment instructions### How to build the js:
* Run (build with automatic file change detection): `npm run-script watch`
* Run (build development): `npm run-script dev`
* Run (build production): `npm run-script prod`

## How to build and package this:
* Run: `mvn package`

## How to test
* Using maven (java, js): `mvn test`
* Using npm (js): `npm test`

## How to get the coverage
* Run: `mvn jacoco:report`

## How to run sonar
* Run: `mvn sonar:sonar`

## How to build and push the docker image
* For building the docker image: `mvn docker:build`
* For pushing the docker image: `mvn docker:push`

**Note**: before run sonar, you need to have SonarQube installed in your environment or configure a remote SonarQube in the project properties.
### Some Dev references:

* [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
* [Spring Data REST](https://docs.spring.io/spring-data/rest/docs/current/reference/html/)
* [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/current/reference/html/)
* [Structuring Your Code](https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-structuring-your-code.html)
* [Java Bean Validation Basics](https://www.baeldung.com/javax-validation)
