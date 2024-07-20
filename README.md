# ConatctAPI - Spring Boot Backend for Full Stack Project

## Features
- Create, read, update, delete contacts
- Photo upload and retrieval
- Pagination for contacts

## Getting Started

### Prerequisites
- Java 17+
- Maven
- PostgreSQL

### Installation
1. Clone the repo:
   ```bash
   git clone https://github.com/spring-contactapi/spring-contactapi.git
   cd spring-contactapi
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```

### Configuration
Update `application.yml`:
```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/your-database
    username: your-username
    password: your-password
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
file:
  upload-dir: ${user.home}/Downloads/uploads/
```

## Usage
Run the application:
```bash
mvn spring-boot:run
```

## API Endpoints
- `POST /contacts` - Create contact
- `GET /contacts` - Get contacts with pagination
- `GET /contacts/{id}` - Get contact by ID
- `PUT /contacts/photo` - Upload contact photo
- `GET /contacts/image/{filename}` - Get contact photo
- `DELETE /contacts/delete/{id}` - Delete contact
