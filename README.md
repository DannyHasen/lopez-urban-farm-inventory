# Lopez Urban Farm Inventory System

The **Lopez Urban Farm Inventory System** is a Spring Boot–based application designed to support inventory management for the Lopez Urban Farm, a community-focused agricultural project located on West Mission Boulevard in Pomona.

The goal of this project is to help track seeds and inventory levels while supporting sustainable and responsible urban farming practices.

---

## 🌱 Project Overview

The Lopez Urban Farm provides fresh vegetables and green space to the local community. This application serves as a backend system to manage:

- Seed inventory records
- Stock levels (add/remove inventory)
- Basic administrative access
- Data persistence using a relational database

This project is currently focused on delivering a functional MVP suitable for demonstration and academic evaluation.

---

## 🛠️ Tech Stack

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security**
- **PostgreSQL**
- **Maven**

---

## 🚀 Features (MVP)

- Create, read, update, and delete seed records
- Track inventory quantities
- Prevent invalid inventory operations (e.g., negative stock)
- Secure endpoints with basic authentication
- RESTful API design

---

## ▶️ Running the Application

### Prerequisites
- Java 17+
- Maven (or use the Maven wrapper)
- PostgreSQL

### Run locally
```bash
./mvnw spring-boot:run
