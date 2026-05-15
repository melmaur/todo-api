# Sprint 2 Retrospective — Todo REST API

## Sprint Goal
Build a fully working REST API with Spring Boot for managing todo tasks with complete CRUD operations.

## Result
 Sprint Goal achieved — all 5 user stories completed.

## What went well
- Spring Boot setup via Spring Initializr was fast and clean
- MVC architecture kept code organized and readable
- JPA handled all database operations automatically
- Postman made API testing intuitive and visual
- Screenshots committed to GitHub as transparent proof of testing
- Daily standup maintained consistently throughout sprint

## What could improve
- Package structure should follow Spring Boot conventions
  from the start — all packages inside the main application package
- Should have tested each endpoint immediately after writing it instead of waiting for the full stack to be complete 
- - Need to get more comfortable reading Spring Boot logs to diagnose issues faster

## Action points for next sprint
- Follow standard Spring Boot package structure from day one
- Commit after every meaningful feature, not just at end of day
- Read Spring Boot documentation on package scanning before starting Project 3
- Set up Project 3 repo and backlog before writing any code

## Scrum values reflection
- **Transparency**: daily standup and backlog kept up to date 
- **Inspection**: retrospective identifies real improvement areas 
- **Adaptation**: package structure lesson applied to Project 3 



### Sprint Maintenance - Retrospective

**Date:** 15/05/2026 (one day only)

### What went well 
- Multi-stage Docker build keeps the final image lightweight (JRE only, not full JDK)
- Application ran correctly on first container launch after resolving the path issue
- Postman verification confirmed full API functionality inside the container

### What could be improved 
- Initial Dockerfile was placed at the wrong directory level — learned to always verify project root structure before building
- A docker-compose.yml would further simplify the run command — planned for future sprints

### What I learned 
- Docker multi-stage builds: separate build and runtime environments
- The role of .dockerignore in optimizing build context
- How a containerized Spring Boot app behaves identically to a locally run instance from the client perspective

### Next Steps 
- Add docker-compose.yml for simplified orchestration
- Explore Docker integration for Project 3 (library-booking)
- Investigate Kubernetes basics for future deployment
