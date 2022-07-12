# Calculo sequencial Alticci

Cálculo sequencial usando cache de dados para melhor desempenho

# Tecnologias Utilziadas no back-end
Java 11
<br>
Maven 3.6.1
<br>
SpringBoot 2.7.0
<br>
Mockito 1.10.19
<br><br>
Padrão de camadas de controllers e serviços 
<br>

# Tecnologias Utilziadas no front-end
NODE.JS v14.9.0
<br>
Angular 8
<br>
Material Design 8.2.3

# Comandos para rodar a aplicação
### Back-end
1 - Na pasta 'alticci-back'
<br>
- comando: 'mvn package' (será gerado um jar alticci-sequential-1.0.0-SNAPSHOT.jar na pasta ./target) e criado uma imagem do back
- Subir a imagem gerada no docker (docker container run -it --rm -p 8080:8080 alticci-back:1.0.0-SNAPSHOT)
<br>
  
2- Opção utilizando uma IDE
  <br>
- Executar a classe com o main(AlticciSequentialApplication), irá subir a aplicação na porta 8080
  <br>

### Front-end
1 - Na pasta 'alticci-front'
- Gerar imagem do front 'docker build -t alticci-front .' Obs.: Atenção ao '.' (ponto) no final do comando
- Subir container alticci-front 'docker run --name alticci-container -d -p 4200:80 alticci-front'

#Swagger
http://localhost:8080/swagger-ui.html

# Telas do sistema
- Chamada no postman
<p align="center">
  <img src="./Documentacao/prints_tela/print_1.jpg">
</p>

- Documentação Swagger
<p align="center">
  <img src="./Documentacao/prints_tela/print_1.jpg">
</p>
<br>

- Tela inicial (iniciando com 20 números)
<p align="center">
  <img src="./Documentacao/prints_tela/print_1.jpg">
</p>
<br>
