# Spring Cloud using Spring Microservices
Learnt from [Here](https://github.com/in28minutes/spring-microservices/tree/master/03.microservices)


## Contents
... This project contains 3 modules right now.
| Modules        | Description           |
| ------------- |:-------------:|
| limits-service  | Connects to the spring-cloud-config-service to retrieve the 'limits-services' configurations based on active profile |
| spring-cloud-config-server | Defines the 'limits-service' configurations based on profiles  |
| currency-exchange-service | Queries conversion rate from JPA & returns back from, to, id and conversionMultiple along with the active port # |
