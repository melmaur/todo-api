# Sprint 2 Review — Todo REST API

## Sprint Goal
Build a fully working REST API with Spring Boot for managing todo tasks with complete CRUD operations.

## Result
Sprint Goal achieved — all 5 user stories completed.

## Demo — What was built

| Endpoint | Method | Status | Notes |
|---|---|---|---|
| /api/todos | GET |  Done | Returns all todos as JSON |
| /api/todos | POST |  Done | Creates new todo from JSON body |
| /api/todos/{id} | GET |  Done | Returns single todo by ID |
| /api/todos/{id} | PUT |  Done | Updates todo including completed flag |
| /api/todos/{id} | DELETE |  Done | Returns 204 No Content |

## Velocity
- Story points committed: 9
- Story points delivered: 9
- Velocity: 100% 

## Feedback and Observations
- MVC layered architecture clean and well organized
- Spring Data JPA eliminated need for manual SQL
- H2 in-memory database perfect for development scope
- Postman testing confirmed all endpoints working correctly
- Screenshots of all tests committed to GitHub as proof of work

## Technical highlights
- Dependency injection via constructor — no field injection
- ResponseEntity used for proper HTTP status codes
- Package scanning configured manually due to non-standard structure

## Next Sprint
Project 3 — Community Library Booking System


## Sprint Maintenance Review

**Sprint Goal:** Containerize the Library REST API using Docker

**Date:** 15/05/2026 (one day only)

### Completed
-  Multi-stage Dockerfile created (build stage: JDK 21, run stage: JRE 21)
-  .dockerignore configured to exclude target/, .idea/, .git/
-  Docker image built successfully: `todo-api`
-  Container tested locally — API responding on port 8080
-  Verified with Postman: POST and GET endpoints functional
-  README updated with Docker instructions
-  Scrum artifacts updated documenting improvements.
-  Changes pushed to GitHub

### Demo
Application previously required local Java 21 and IntelliJ to run.
After containerization, the full API runs with two commands:
`docker build -t todo-api .` and `docker run -p 8080:8080 todo-api`

### Outcome
Sprint Goal achieved. The API is now fully containerized and portable.