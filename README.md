# Workshop-4 — *El Espectador* News App  

## 📚 Object-Oriented Programming — Semester 2025-I  
**Universidad Distrital Francisco José de Caldas**  
**Professor**: Eng. Carlos Andrés Sierra, M.Sc.  

---

## 👥 Authors  
- **Angie Nathaly Cisneros Guerrero** — 20242020084  
- **Luis Sebastián Correa Barreto** — 20242020085  

---

## Contents

- [Workshop-3](#workshop-3)
  - [Project Overview](#project-overview)
  - [Key Features](#key-features)
  - [OOP Implementation](#oop-implementation)
  - [SOLID Compliance](#solid-compliance)
  - [Project Structure](#project-structure)

---
## Project Overview  
This project is a functional replica of the digital news platform *El Espectador*, designed to showcase modern OOP principles. It enables users to:  
- Browse **featured**, **latest**, and **international** news  
- Navigate categorized sections with intuitive filtering  
- Access full articles with summaries and visual content  

Built with **Java**, the system emphasizes **SOLID principles**, **modularity**, and **scalability** for future extensions.  

---

## Run Steps
Our app doesn't manages any kind of input from user, it objecitve is to keep the user informated using a intuitive user interface
feel free to execute the App.java file on the /presenter/App.java and navigate your own! thank you.

---

## Project Structure  
```bash
├── Workshop-4/
│ ├── bin/
│ │ ├── gui/
│ │ │├── CenterPanel.class
│ │ │├── Constants.class
│ │ │├── HeaderContainer.class
│ │ │├── MainFrame.class
│ │ │├── NewsView.class│ │ │├── OptionContainer.class
│ │ │└── StartPanel.class
│ │ ├── Images/
│ │ │├── test.jpeg
│ │ │├── testTwo.jpeg
│ │ │├── testThree.jpeg
│ │ │└── ... (other image files)
│ │ ├── model/
│ │ │├── Homepage.class
│ │ │├── InternationalNews.class
│ │ │├── InternationalNewsSection.class
│ │ │├── News.class
│ │ │├── NewsImage.class
│ │ │└── Section.class
│ │ └── presenter/
│ │     └── App.class
│ ├── lib/ ...
│ ├── src/
│ │ ├── gui/
│ │ │├── CenterPanel.java
│ │ │├── Constants.java
│ │ │├── HeaderContainer.java
│ │ │├── MainFrame.java
│ │ │├── NewsView.java
│ │ │├── OptionContainer.java
│ │ │└── StartPanel.java
│ │ ├── Images/
│ │ │   (same image files as in bin/Images/)
│ │ ├── model/
│ │ │├── Homepage.java│ │ │├── InternationalNews.java
│ │ │├── InternationalNewsSection.java
│ │ │├── News.java
│ │ │├── NewsImage.java
│ │ │└── Section.java
│ │ └── presenter/
│ │ └── App.java
│ └── README.md
└── Workshop-4.pdf
└── DiagramsIns.pdf

