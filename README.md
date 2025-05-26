# springboot-category-product

# 📦 Spring Boot Product Management API

This is a Spring Boot-based RESTful web service that provides complete **CRUD operations** for managing **Categories** and **Products**, featuring:

- 📂 One-to-many relationship (Category → Products)
- ⚙️ REST API endpoints using Spring Web
- 💾 JPA/Hibernate for ORM with MySQL database
- 📄 Server-side pagination for product listings
- 🧪 Layered architecture (Controller → Service → Repository → Entity)

---

## 🔧 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Hibernate
- RESTful APIs

---

## 📁 Project Structure

```plaintext
src/
└── main/
    ├── java/
    │   └── com.example.springboot-category-product/
    │       ├── controller/
    │       │   ├── CategoryController.java
    │       │   └── ProductController.java
    │       ├── dto/
    │       ├── entity/
    │       │   ├── Category.java
    │       │   └── Product.java
    │       ├── repository/
    |       |   |__ CategoryRepository.java
    |       |   |__ ProductRepository.java
    │       ├── service/
    │       │   ├── CategoryService.java
    │       │   └── ProductService.java
    │       └── springboot-category-productApplication.java
    └── resources/
        ├── application.properties
