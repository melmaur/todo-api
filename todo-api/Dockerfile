# Stage 1 - Build
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src ./src
RUN chmod +x mvnw && ./mvnw package -DskipTests

# Stage 2 - Run
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

# note sul codice appena scritto
# Cosa fa riga per riga (importante saperlo spiegare):
#
# Stage 1 → prende Java 21, copia il codice, compila il JAR
# DskipTests → salta i test per velocizzare il build
#
# Stage 2 → immagine più leggera (solo JRE, non JDK), copia solo il JAR compilato
# EXPOSE 8080 → dice a Docker che l'app usa la porta 8080
# ENTRYPOINT → il comando che lancia l'app