# 📰 Workshop-3 — *El Espectador* News App  

## 📚 Object-Oriented Programming — Semester 2025-I  
**Universidad Distrital Francisco José de Caldas**  
**Professor**: Eng. Carlos Andrés Sierra, M.Sc.  

---

## 👥 Authors  
- **Angie Nathaly Cisneros Guerrero** — 20242020084  
- **Luis Sebastián Correa Barreto** — 20242020085  

---

## 🎯 Project Overview  
This project is a functional replica of the digital news platform *El Espectador*, designed to showcase modern OOP principles. It enables users to:  
- Browse **featured**, **latest**, and **international** news  
- Navigate categorized sections with intuitive filtering  
- Access full articles with summaries and visual content  

Built with **Java**, the system emphasizes **SOLID principles**, **modularity**, and **scalability** for future extensions.  

---

## 🌟 Key Features  
### Core Functionalities  
✅ **Homepage**: Displays main news and highlights  
✅ **Latest News**: Shows the 9 most recent articles (sorted by date)  
✅ **International News**: Filters non-Colombian content  
✅ **News Management**: CRUD operations for articles with validation  

### OOP Implementation  
| Principle          | Example                                  |  
|--------------------|------------------------------------------|  
| **Encapsulation**  | Private attributes with validated setters |  
| **Inheritance**    | `InternationalNews` extends `News`       |  
| **Polymorphism**   | Custom `getLatestNews()` implementations |  
| **Composition**    | `Homepage` aggregates `Section` objects  |  

### SOLID Compliance  
- ✔️ **Single Responsibility**: Clean class separation  
- ✔️ **Open/Closed**: Extensible via abstract `Section` class  
- ✔️ **Liskov Substitution**: Seamless parent-child substitution  

---

## 📂 Project Structure  
```bash
src/
├── ui/                          # User interface
│   ├── App.java                 # Main UI
│   └── Images/                  # Assets
├── model/                       # Data classes
│   ├── News.java                # Base news
│   ├── InternationalNews.java   # Specialized
│   └── NewsImage.java           # Images
├── manager/                     # Logic
│   ├── Section.java             # Abstract
│   └── InternationalNewsSection # Filtered
├── Workshop-3.pdf               # Documentation
└── README.md
