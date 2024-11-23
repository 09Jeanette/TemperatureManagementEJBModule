# Temperature Management EJB Module

This repository contains the source code for an Temperature Management System using Java EE and EJB. The system includes functionalities for managing employees and monitoring their temperatures, classifying them based on predefined thresholds.

## Features

- **Employee Management**: CRUD operations for employee entities.
- **Temperature Monitoring**:
  - Find employees with high temperatures (above 38°C).
  - Find employees with acceptable temperatures (38°C or below).
  - Find employees who have recorded multiple high temperature readings.
- **Persistence**: Uses JPA for ORM (Object-Relational Mapping) and data persistence.
- **Stateless Session Bean**: Implements business logic in stateless EJBs.

## Code Overview

### Main Components

- **EmployeeFacade**: This is a stateless session bean that provides methods to interact with the `Employee` entities and their temperature records. It extends `AbstractFacade<Employee>` to inherit common CRUD operations.
  - `findHigh()`: Retrieves employees with any temperature readings above 38°C.
  - `findAcceptable()`: Retrieves employees with all temperature readings 38°C or below.
  - `findHigh2()`: Retrieves employees with multiple high temperature readings (above 38°C).

### Technologies Used

- **Java EE**
- **EJB (Enterprise JavaBeans)**
- **JPA (Java Persistence API)**
-  **JPQL (Java Persistence Query Language)**

## Getting Started

### Clone the Repository

```sh
git clone https://github.com/09Jeanette/TemperatureManagementEJBModule
