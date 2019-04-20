
[![Build Status](https://travis-ci.org/caiovlf/api-controle-ponto.svg?branch=master)](https://travis-ci.org/caiovlf/api-controle-ponto)
# API Controle de Ponto
Controle de Ponto API, this system processes and stores the input and output records of an employee in a particular company.

# Tools Used
- Java 1.8
- Spring Boot
- JPA & Spring Data
- FlyWay
- TravisCI
- Swagger
- JWT Authentication
- EhCache
- MySQL
- Heroku

# Running the project
- At the root of the project run the command**mvn install**
- At the root of the project run the command **java -jar target\controle-de-ponto-0.0.1-SNAPSHOT.jar**

# JWT Authentication
- Create the person record through the endpoints **/api/cadastrar-pf** or **/api/cadastrar-pj**
- Use **/auth** passing the email and password of the created user
- To use the rest of the APIs, pass the generated token in the Authorization property on the Request Header  "Bearer **generatedToken**"

Or

Use the person record created during project execution with api **/auth** as below:

       {
        	"email": "admin@caiovlf.com",
        	"senha": "caiovlf"
        }

  
and use the token generated in the Authorization property in the request header in the format "Bearer  **generatedToken**

# API Documentation
- To access the API documentation go to the **/swagger-ui.html**
