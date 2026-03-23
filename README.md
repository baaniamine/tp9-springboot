# TP9 - Spring Security

## Objectif

Ce projet suit les etapes montrees dans les images :

- configuration d'un projet Spring Boot avec `Spring Web`, `Spring Security` et `Thymeleaf`
- creation de deux utilisateurs en memoire
- protection des routes selon les roles
- personnalisation de la page de connexion

## Comptes de test

- `user / 1111` : acces a `/user/dashboard`
- `admin / 1234` : acces a toutes les pages securisees

## URLs utiles

- `http://localhost:8080/`
- `http://localhost:8080/user/dashboard`
- `http://localhost:8080/admin/dashboard`
- `http://localhost:8080/login`
- `http://localhost:8080/logout`

## Structure

```text
tp9/
|- pom.xml
|- mvnw
|- mvnw.cmd
|- src/
|  |- main/
|  |  |- java/ma/fstg/security/
|  |  |  |- Tp9Application.java
|  |  |  |- config/SecurityConfig.java
|  |  |  |- web/HomeController.java
|  |  |  `- web/LoginController.java
|  |  `- resources/
|  |     |- application.properties
|  |     `- templates/login.html
|  `- test/java/ma/fstg/security/Tp9ApplicationTests.java
`- README.md
```

## Bonnes pratiques

- En production, il faut encoder les mots de passe avec `BCryptPasswordEncoder`.
- Il vaut mieux eviter de coder les roles en dur dans une vraie application.
- Les regles de securite doivent rester centralisees dans une configuration dediee.

## Important

Spring Boot `3.3.x` demande Java `17` ou plus. Si la machine utilise encore Java 8, il faut installer un JDK 17+ avant de lancer l'application.
