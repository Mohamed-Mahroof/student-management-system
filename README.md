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

## Screenshots

### Add Student (POST)
![Add Student]<img width="1575" height="957" alt="post-add-student" src="https://github.com/user-attachments/assets/e1d70e50-6ea0-4db4-8309-c99386eda2e9" />


### Fetch All Students (GET)
![Fetch All]<img width="1572" height="957" alt="get-all-students" src="https://github.com/user-attachments/assets/a5c79239-ed15-4509-91bd-224b33811b51" />


### Get Student by ID (GET)
![Get By ID]<img width="1571" height="963" alt="get-by-id" src="https://github.com/user-attachments/assets/a917d0db-5bd8-43a7-bf60-e2f2246b2da6" />


### Update Student (PUT)
![Update]<img width="1572" height="962" alt="put-update-student" src="https://github.com/user-attachments/assets/d8ad645f-3f9b-4804-84a5-ab3250f1051f" />


### Delete Student (DELETE)
![Delete]<img width="1572" height="962" alt="delete-student" src="https://github.com/user-attachments/assets/f6c2f0f3-5697-4f46-9a83-6786381570f9" />
