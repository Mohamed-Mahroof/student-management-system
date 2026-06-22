# Student Management System

A REST API built with Java Spring Boot and MySQL.

## Tech Stack
- Java 21
- Spring Boot 3.4.5
- Spring Data JPA
- MySQL
- Maven

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/students | Add a new student |
| GET | /api/students | Get all students |
| GET | /api/students/{id} | Get student by ID |
| PUT | /api/students/{id} | Update student |
| DELETE | /api/students/{id} | Delete student |

## How to Run

1. Clone the repository
2. Create MySQL database: `CREATE DATABASE studentdb;`
3. Update `application.properties` with your MySQL credentials
4. Run `./mvnw spring-boot:run`
5. API runs on `http://localhost:8080`