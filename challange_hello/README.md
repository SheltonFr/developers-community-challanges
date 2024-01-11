<h1 align="center">
    Desafio#01 Olá Mundo
</h1>
<p align="center">
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Challange&color=8257E5&labelColor=000000" alt="Desafio" />
</p>
Desafio de backend 01 da comunidade Developers, para desenvolver uma REST API, que retorna:

```json
{
  message: "Olá, Mundo!"
}
```
## Tecnologias
- [Spring Boot](https://spring.io/projects/spring-boot)
- Java 21

## Como executar
- Clonar o repositorio
- Fazer build do projecto (Build e rodar testes)

```bash
$ ./mvnw clean install
```

- Rodar o projecto
```bash
$ java -jar target/challange_01-0.0.1-SNAPSHOT.jar
```
A API pode ser acessada em [localhost:8080/api/hello](http://localhost:8080/api/hello)  

```
$ http GET :8080/api/hello (httpie)

{
    message: "Olá, Mundo!"
}
```