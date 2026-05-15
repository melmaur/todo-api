## Daily - 20 April 2026

 Yesterday: completed Project 1 - Library Management System
 
 Today: started Project 2 - built full MVC stack for Todo REST API - model, repository, service, controller, H2 database configured and working

 Blockers: Spring package scanning required manual configuration

## Daily - 21 April 2026

 Yesterday: started Project 2 - built full MVC stack for Todo REST API - model, repository, service, controller, H2 database configured and working
 
 Today: tested all CRUD endpoints with Postman, added screenshots to GitHub

 Blockers: Postman had to be downloaded and installed

## Daily - 23 April 2026

 Yesterday: day off
 
 Today: resume Project 2 - Sprint Review and Retrospective, begin planning Project 3 - Community Library Booking System
 
 Blockers: none


## Sprint Maintenance Daily 

## Day 1 — 15 May 2026

**Yesterday:** Suddenly came to mind the idea of improvement by applying containerization via Docker to the completed project 2 todo-api.

**Today:** Created Dockerfile with multi-stage build (eclipse-temurin:21). Resolved build context issue — Dockerfile correctly placed in project root. Successfully built image and ran container. Verified API response via browser and Postman — POST and GET working as expected.

**Blockers:** Initial build failed due to incorrect Dockerfile placement (one level above project root). Resolved by moving Dockerfile into the correct directory.
