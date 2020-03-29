Microservices with Spring Boot and Spring Cloud

Make your microservices cloud ready with Spring Cloud

You will learn

•	Establishing Communication between Microservices

•	Centralized Microservice Configuration with Spring Cloud Config Server

•	Simplify communication with other Microservices using Feign REST Client

•	Implement client side load balancing with Ribbon

•	Implement dynamic scaling using Eureka Naming Server and Ribbon

•	Implement API Gateway with Zuul

•	Implement Distributed tracing with Spring Cloud Sleuth


Ports

Application	Port

Client Service	8080

Client Service App	9090 , 9091 , …

Spring Cloud Config Server	8888

Netflix Eureka Naming Server	8761

Netflix Zull API Gateway Server	8765


URLS

Application	URL

Client Service	http://localhost:8080/product/2/3

Client Service App	http://localhost:9090/rootlevel/product/2/2

Spring Cloud Config Server	http://localhost:8888/client-service/default

Netflix Eureka Naming Server	http://localhost:8761/

Netflix Zull API Gateway Server	http://localhost:8765/{application-name}/{uri}

http://localhost:8765/client-service-app/rootlevel/product/2/3

http://localhost:8765/client-service/product/2/3


VM Argument

-Dserver.port=9091

