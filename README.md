# Spring Boot Microservice

## About Services

- Product Service: Create and View Products, acts as Product Catalog.
- Order Service: Be Able to Order Products
- Inventory Service: Checking if product is in stock or not.
- Notification Service: Can send notifications, after order is placed.
- Order Service, Inventory Service and Notification Service are going to interact with each other.
- Synchronous and Asynchronous Communication.

## Technology Stack:

- Java Spring Boot: Leveraged Spring Boot to rapidly develop microservices, utilizing Spring Cloud components for seamless integration.
- Message Queue (Apache Kafka): Employed Apache Kafka for high-throughput, real-time event streaming and communication between microservices.
- Docker: Utilized Docker containers for efficient deployment, scalability, and consistent environments across microservices.
- MongoDB: Implemented MongoDB as a NoSQL database for flexible and scalable data storage.
- PostgreSQL: Utilized PostgreSQL for structured data storage, ensuring data consistency and reliability.
- Distributed Tracing (Zipkin): Integrated Zipkin for distributed tracing and monitoring, enabling real-time diagnostics of microservices interactions.
- Microservices Architecture: Designed and implemented a microservices architecture for modularity, flexibility, and independent scaling of services.
- API Gateway: Developed an API Gateway to centralize request management, routing, and load balancing for microservices.
- Circuit Breaker (Resilience4j): Implemented Resilience4j for enhanced fault tolerance, circuit breaking, and graceful degradation in the event of service failures.
- Discovery Server (Eureka Server): Deployed Eureka Server for service discovery, registration, and load balancing in the microservices ecosystem.
- Logging and Monitoring: Implemented logging and monitoring solutions, such as Prometheus, for centralized log management and real-time performance monitoring.

## ▷ About Microservices Architecture 
Microservices Architecture is a software architectural style that structures an application as a collection of loosely coupled, independently deployable services. In this approach, a complex application is broken down into smaller, self-contained services, each responsible for a specific business capability. These services communicate with each other through well-defined APIs (Application Programming Interfaces) and often follow principles of modularity, scalability, and maintainability.


## Reference

From Programming Techie: https://www.youtube.com/watch?v=mPPhcU7oWDU
