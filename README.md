
---

# Job Listing and Search API

This project is a RESTful API for managing job listings and searching for jobs. It leverages Spring Boot for backend implementation, MongoDB for data storage, and Swagger for API documentation.

## Features

- **Job Listing CRUD Operations**: Create, Read, Update, and Delete job listings.
- **Job Search**: Search for job listings based on keywords, location, job type, etc.
- **Swagger Documentation**: Easily explore and test API endpoints with Swagger UI.

## Technologies Used

- **Spring Boot**: Java-based framework for building robust, scalable applications.
- **MongoDB**: NoSQL database for storing job listings.
- **Swagger**: OpenAPI Specification and tools for designing, building, and documenting APIs.

## Prerequisites

- Java Development Kit (JDK) 8 or newer
- Apache Maven
- MongoDB server

## Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your/repository.git
   cd repository
   ```

2. **Configure MongoDB:**

   Ensure MongoDB is running locally or update application.properties in src/main/resources with your MongoDB connection details:

   ```
   spring.data.mongodb.host=localhost
   spring.data.mongodb.port=27017
   spring.data.mongodb.database=Rajat-learn
   ```

3. **Build and run the application:**

   ```bash
   mvn spring-boot:run
   ```

   The application will start on `http://localhost:8080`.

## API Documentation

- Swagger UI is integrated to provide API documentation and testing.
- Access the Swagger UI at `http://localhost:8080/swagger-ui.html`.

## Endpoints

### Job Listings

- `http://localhost:8080/posts`: Retrieve all job listings.
- `http://localhost:8080/posts/addPosts`: Create a new job listing.
- `http://localhost:8080/posts/{text}`: Retrieve a specific job listing by keyword.


### Job Search

- `http://localhost:8080/posts/{text}`: Retrieve a specific job listing by keyword.

#### Query Parameters for Job Search

- `profile`: Keywords to search for in job title.
- `desc`: descreption of the job.
- `techs`: Technologies required for the job.

Example search request:

```
GET /api/jobs/search?q=developer&location=New+York&type=full-time
```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.



