# Employee Management System API

A REST API built with Spring Boot for managing employee records.

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/employees | Get all employees |
| GET | /api/employees/{id} | Get employee by ID |
| POST | /api/employees | Create employee |
| PUT | /api/employees/{id} | Update employee |
| DELETE | /api/employees/{id} | Delete employee |

## How to Run
1. Clone the repo
2. Configure `application.properties` with your MySQL credentials
3. Run `mvn spring-boot:run`