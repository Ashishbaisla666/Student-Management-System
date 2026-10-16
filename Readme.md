Student Management System

A REST API project for managing student records, built using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL. The project follows a layered architecture to keep the code organized and maintainable.

Features

* Create new student records
* Retrieve all students
* Retrieve a student by ID
* Update student details
* Delete student records
* RESTful API implementation
* MySQL database integration
* Exception handling
* Layered application architecture

Tech Stack

* Java 17
* Spring Boot
* Spring WebMVC
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Lombok
* IntelliJ IDEA

Project Structure

src/
└── main/
    ├── java/
    │   └── com/student/management/system/
    │       ├── controller/
    │       ├── service/
    │       ├── repository/
    │       ├── entity/
    │       ├── dto/
    │       ├── exception/
    │       └── StudentManagementSystemApplication.java
    └── resources/
        └── application.properties

API Endpoints

Method	         Endpoint	           Description
POST	         /student/save	    Create a new student
GET	           /student/all	      Retrieve all students
GET	           /student/{id}	    Retrieve a student by ID
PUT	        /student/update/{id}	Update student details
DELETE	       /student/{id}	    Delete a student by ID

Note: Confirm the endpoint paths and HTTP methods against the controller code.

Prerequisites

* Java 17
* MySQL Server
* Maven
* IntelliJ IDEA or another Java IDE
* Postman or another HTTP client for testing

Database Configuration

Create a MySQL database named student_db.

Configure the database connection in application.properties using environment variables:

spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=${DB_USERNAME:root}
spring.datasource.password=${DB_PASSWORD}
server.port=8934
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Set the DB_USERNAME and DB_PASSWORD environment variables before running the application.

Important: Never upload database passwords, API keys, or other secrets to GitHub.

How to Run the Project

1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Create the student_db database in MySQL.
4. Configure the database credentials using environment variables.
5. Build the project using Maven.
6. Run StudentManagementSystemApplication.java.
7. Test the API endpoints using Postman.

The application is configured to run on port 8934.

Sample JSON Request

Example request body for creating a student:

{
  "name": "John Doe",
  "email": "john@example.com",
  "course": "Information Technology",
  "age": 21
}

Adjust the field names to match the actual student entity or DTO.

Future Improvements

* Input validation
* Pagination and sorting
* Student search functionality
* Swagger/OpenAPI documentation
* Authentication and authorization using Spring Security
* Unit and integration testing

Author

Ashish Baisla

B.Tech (Computer Science and Engineering) | Aspiring Java Backend Developer
