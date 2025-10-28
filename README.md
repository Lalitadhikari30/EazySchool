
# EazySchool (Spring Boot)

Short description
A small Spring Boot application for managing school-related data (students, courses, etc.). This README gives setup, run, and development notes — inspect controllers and configuration for exact endpoints and properties.

# Prerequisites
- Java 11+ (or the Java version used by the project)
- Maven or Gradle (depending on project files)
- (Optional) Docker and Docker Compose if you prefer containerized DB

# Quick start (Maven)
1. Build:
   mvn clean package
2. Run:
   mvn spring-boot:run
   or
   java -jar target/<your-artifact>.jar

# Configuration
- Application properties are under src/main/resources/application.properties (or application.yml).
- Common properties to set:
  - spring.datasource.url
  - spring.datasource.username
  - spring.datasource.password
  - spring.jpa.hibernate.ddl-auto
- For environment-specific values, use application-{profile}.properties and activate with:
  -Dspring.profiles.active=dev

# Database
- The project may use an embedded DB (H2) for development; check application.properties.
- To use MySQL/Postgres:
  - Create database and update datasource properties.
  - Ensure JDBC driver dependency is present.

# Common endpoints
- Exact REST endpoints depend on controllers in src/main/java. Typical examples:
  - GET /api/students
  - POST /api/students
  - GET /api/courses
  - POST /api/courses
- Inspect controller classes to confirm routes and request/response DTOs.

# Running tests
- Maven:
  mvn test
- Gradle:
  ./gradlew test

# IDE tips
- Import the project as a Maven/Gradle project in IntelliJ IDEA or Eclipse.
- Enable annotation processing if using Lombok.

# Logging & troubleshooting
- Logs are controlled by application.properties (logging.level.*).
- For DB errors, enable SQL logging with:
  spring.jpa.show-sql=true

# Development notes
- Follow package structure and naming conventions used in the project.
- Add feature branches, keep commits small, and include tests for new behavior.

# Contribution
- Open issues and PRs for features or fixes.
- Include clear description, steps to reproduce, and tests.

# License
- This project is licensed under the MIT License

# Where to look next
- src/main/java/... for controllers, services, repositories
- src/main/resources/application.properties (or .yml) for configuration
- README is intentionally minimal: inspect code for exact entity fields and routes.

````</file>
