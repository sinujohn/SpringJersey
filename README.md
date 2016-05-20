A simple REST app created using Spring and JAX-RS(Jersey). Supports JSON formats.
Documentation is generated using Swagger. 

Do

    mvn jetty:run
    
Following REST APIs are available:

    GET http://localhost:8080/springcxf/api/greet
    GET http://localhost:8080/springcxf/api/greetJson

Swagger API documents in JSON and YAML are available at

    http://localhost:8080/springcxf/api/swagger.json
    http://localhost:8080/springcxf/api/swagger.yaml

To view Swagger UI, use Browser to go to:

    http://localhost:8080/springcxf/apidocs/?url=/springcxf/api/swagger.yaml
or

    http://localhost:8080/springcxf/apidocs/?url=/springcxf/api/swagger.json

Writing Swagger Annotations: https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X


Integrating Swagger with Jersey:
https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-Jersey-2.X-Project-Setup-1.5#using-a-custom-application-subclass