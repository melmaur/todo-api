# Sprint 2 Review — Todo REST API

## Sprint Goal
Build a fully working REST API with Spring Boot for managing todo tasks with complete CRUD operations.

## Result
Sprint Goal achieved — all 5 user stories completed.

## Demo — What was built

| Endpoint | Method | Status | Notes |
|---|---|---|---|
| /api/todos | GET | ✅ Done | Returns all todos as JSON |
| /api/todos | POST | ✅ Done | Creates new todo from JSON body |
| /api/todos/{id} | GET | ✅ Done | Returns single todo by ID |
| /api/todos/{id} | PUT | ✅ Done | Updates todo including completed flag |
| /api/todos/{id} | DELETE | ✅ Done | Returns 204 No Content |

## Velocity
- Story points committed: 9
- Story points delivered: 9
- Velocity: 100% ✅

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