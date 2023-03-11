
# Mediator

A little case of mediator pattern





## Authors

- [@Harisatul](https://www.github.com/Harisatul)


## Run Test

To run test case this project :
- make sure you run java 17
```bash
  java --version
```
- Installed Maven
```bash
  mvn --version
```
- Axon server instance 
you can create axon server instance via docker

```bash
  sudo docker run -d --name axon-server -p 8024:8024 -p 8124:8124 axoniq/axonserver:latest
```
- Postgres 
connect to postgres instance. to achieve that, you can configure it in application.properties 
```bash
spring.datasource.url=jdbc:postgresql://yourhost:yourport/yourdb
spring.datasource.username=yourpostgresusername
spring.datasource.password=yourpostgrespassword
```
- Run App
```bash
  mvn spring-boot:run
```

