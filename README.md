# 📰 Workshop-2 — *El Espectador* News App

## 📚 Object-Oriented Programming — Semester 2025-I
**Universidad Distrital Francisco José de Caldas**  
**Professor**: Eng. Carlos Andrés Sierra, M.Sc.  

## 👥 Authors
- Angie Nathaly Cisneros Guerrero — 20242020084
- Luis Sebastián Correa Barreto — 20242020085

## 🎯 Project Description
This project replicates the basic functionality of the **El Espectador** news website, offering users the ability to easily browse, search, and view categorized news articles.

The main objective is to apply core Object-Oriented Programming (OOP) principles such as **encapsulation**, **inheritance**, and **polymorphism** to build a scalable and maintainable transactional application.

## ⏩ Table Of Contents

- [Updated Conceptual Design](#updated-conceptual-design)
- [Technical Design](#technical-design)
- [Initial Implementation](#initial-implementation)
- [Links (For mockup and detailed view of diagrams)](#links-for-mockup-and-detailed-view-of-diagrams)
- [Project Structure](#project-structure)
## Updated Conceptual Design
- Functional and Non-Functional Requirements
- Complete User Stories (with Acceptance Criteria)
- CRC Cards for all main classes

## Technical Design
- UML Class Diagram
- Sequence Diagram for key interactions

## Initial Implementation
- Java class skeletons with attributes and basic methods
- Application of encapsulation with getters and setters

## Links (For mockup and detailed view of diagrams):
You may need to log in.

- [Mockup](https://www.figma.com/proto/iNxlbwTLOjuXZIfmVmLjmf/P%C3%A1gina-EL-ESPECTADOR?node-id=1-7075&t=i2iDk84kHLAn7zfj-1)

- [UML diagram](https://lucid.app/lucidchart/b5c21a75-237b-49ee-b9a3-44912a94cb7e/edit?viewport_loc=-1322%2C-337%2C1226%2C600%2C0_0&invitationId=inv_8c881779-ebc8-45c8-8c8e-35963977164c)
  
- [Sequence Diagrams 1-2](https://lucid.app/lucidchart/9d085e80-6966-48f6-87fa-c8d8c4ae3f6d/edit?viewport_loc=1309%2C675%2C1479%2C724%2C0_0&invitationId=inv_11545c7a-5fb1-4a62-989c-27c643c718f0)

- [Sequence Diagrams 3-4](https://lucid.app/lucidchart/0f6ad412-4ed2-4cc6-93ae-11e8c72f1dc7/edit?viewport_loc=3169%2C663%2C1109%2C543%2C0_0&invitationId=inv_5d5e9643-774d-4b25-b83e-6bf98a502c87)

## Project Structure

```bash
Workshop-2/
├── src/
│   ├── Homepage.java          # Manages featured news and sections (composition)
│   ├── News.java              # Base class (encapsulation)
│   ├── InternationalNews.java # Derived class (inheritance)
│   ├── Section.java           # Groups news (composition)
│   └── InternationalNewsSection.java # Specialized section (polymorphism)
├── Workshop-2(2).pdf             # Design documentation
└── README.md                  # Project overview
