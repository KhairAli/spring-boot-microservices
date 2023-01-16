# Spring Boot Microservice Ecosystem Demo

Demo of microservices ecosystem, making use of Netflix OSS and some microservice design patterns.

### Requirements
* Maven
* JDK 1.8

#### Running any service
* mvn spring-boot:run

#### Services Description
* **API-Gateway:** centralized point of access to all service, fetch list of available services from service-discovery

* **Serivce-Discovery:** implemented with Netflix Eureka 

* **User-Service:** responsible for communication with Product Service,to purchase item.

* **Product-Service:** storage of products in MongoDB as database.

#### Requests
* Some sample requests for each service is available in Postman Collection file.

