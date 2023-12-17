# Microservices Project

## Overview
This project is a comprehensive example of a microservices architecture implemented using Spring Boot. It showcases several essential components and patterns used in modern microservices architectures, including:

- **Service Discovery**: Implemented with Eureka, allowing services to dynamically discover and communicate with each other.
- **API Gateway**: Central point for request routing, composition, and protocol translation.
- **Security**: Integrated with Keycloak for robust authentication and authorization.
- **Resilience**: Utilizing Resilience4j for circuit breaking to ensure the system can handle partial failures gracefully.
- **Event-Driven Architecture**: Implemented with Kafka, facilitating asynchronous communication and decoupling of services.
- **Containerization**: The entire ecosystem is dockerized for easy deployment and scaling.

## Architecture
Below is the architecture diagram of the microservices setup:
![Architecture](/architecture.png)

## Components
The project is structured into several key services:

- **api-gateway**: The gateway for all microservices, handling routing and load balancing.
- **discovery-server**: Eureka server for service registration and discovery.
- **inventory-service**: Service for managing inventory data.
- **notification-service**: Responsible for handling and sending notifications.
- **order-service**: Manages all order-related operations.
- **product-service**: Handles product management and related functionalities.

## Setup and Installation
To set up and run the project:

1. **Clone the Repository**: Clone this repository to your local machine.
2. **Install Dependencies**: Navigate to each service directory and install the required dependencies.
3. **Start the Eureka Server**: Run the discovery-server to allow service registration.
4. **Run Each Service**: Start each of the other services. They will automatically register with the Eureka server.
5. **Start the API Gateway**: Finally, start the api-gateway.

Ensure that all services are running and registered with Eureka before attempting to interact with the system.

## Usage
You can interact with the system through the API Gateway. The gateway routes requests to the appropriate services based on the configured paths.

## Dockerization
Each service is containerized using Docker. To build and run the services using Docker:

1. **Build Docker Images**: Run `docker build -t <service-name> .` in each service's directory.
2. **Run Containers**: Use `docker run` to start each service.

Refer to the individual Dockerfiles in each service directory for more details.

## Contributing
Contributions to this project are welcome. Please follow the standard fork-and-pull request workflow.

## License
This project is open-sourced under the [MIT License](LICENSE.md).
