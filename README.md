# 📝 Todo REST API

A RESTful API built with Spring Boot to manage todo tasks, developed as part of a Java backend portfolio for learning purposes.

## Features
- Create, read, update and delete todos (full CRUD)
- RESTful endpoints following REST conventions
- Persistent storage via H2 in-memory database
- Layered MVC architecture

## Technologies
- Java 21
- Spring Boot 3.5.13
- Spring Data JPA
- H2 Database
- Maven
- Git & GitHub

## Agile Process
This project was developed following the **Scrum framework**:
- Work organized in a Sprint with a defined Sprint Goal
- User stories tracked in the Product Backlog
- Daily standup log maintained throughout development
- Sprint concluded with a Review and Retrospective

> Developer holds a Professional Scrum Master I (PSM I) certification issued by Scrum.org

## Architecture

controller  → receives HTTP requests

service     → applies business logic

repository  → talks to the database

model       → data structure

## API Endpoints

| Method | URL | Description |
|---|---|---|
| GET | /api/todos | Get all todos |
| GET | /api/todos/{id} | Get todo by ID |
| POST | /api/todos | Create new todo |
| PUT | /api/todos/{id} | Update todo |
| DELETE | /api/todos/{id} | Delete todo |

## API Testing with Postman

All endpoints tested and verified with Postman.

### POST — Create a todo
![POST request](docs/screenshots/post-todo.png)

### GET — Retrieve all todos
![GET request](docs/screenshots/get-all-todos.png)

### GET — Retrieve by ID
![GET by ID](docs/screenshots/get-by-id.png)

### PUT — Update a todo
![PUT request](docs/screenshots/put-todo.png)

### DELETE — Delete a todo
![DELETE request](docs/screenshots/delete-todo.png)

## How to Run
1. Clone the repository
   git clone https://github.com/yourusername/todo-api
2. Open the project in IntelliJ IDEA
3. Run TodoApiApplication.java
4. API available at http://localhost:8080/api/todos
5. H2 console available at http://localhost:8080/h2-console

## Project Structure
```
src/main/java/
├── controller/    → TodoController.java
├── model/         → Todo.java
├── repository/    → TodoRepository.java
├── service/       → TodoService.java
└── todo_api/      → TodoApiApplication.java
```
