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

```
## Demo


https://github.com/user-attachments/assets/d091477d-e4af-4ea9-9003-0a149de40198


- Les regles de securite doivent rester centralisees dans une configuration dediee.
