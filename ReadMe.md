# University Management System (UMS)  

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)  
![OOP](https://img.shields.io/badge/OOP-Concepts-blue?style=for-the-badge)  
![University Management](https://img.shields.io/badge/University-Management-green?style=for-the-badge)  

## 📌 Overview
This project is a **simple University Management System** built using Java. It serves as an ID assignment to demonstrate Object-Oriented Programming (OOP) concepts such as **Encapsulation, Inheritance, Polymorphism, and Abstraction**. The system allows basic management of departments, courses, and students.

## 💡 Features
- **Department Management** 🏛️
- **Course Enrollment** 📚
- **Basic Search Functionality** 🔍
- **OOP Concept Demonstration** ✅

## 🏗️ Technologies Used
- **Java** (JDK 17+ recommended)
- **OOP Principles**

## 📂 Project Structure
```
UMS/
│── src/                   # Source Code Folder
│   ├── UMS.java           # Entry Point
│   ├── Depart.java        # Department Class
│   ├── Cour.java          # Course Class
│   ├── Prof.java          # Professor Class
│── bin/                   # Compiled Class Files
│── dist/                  # JAR File Output
│── README.md              # Project Documentation
```

## 🚀 How to Run
1. **Compile the Code**:
   ```sh
   javac -d bin src/*.java
   ```
2. **Run the Program**:
   ```sh
   java -cp bin UMS
   ```
3. **Create a JAR (Optional)**:
   ```sh
   jar cvfm dist/UMS.jar -C bin .
   ```
4. **Run the JAR File**:
   ```sh
   java -jar dist/UMS.jar UMS
   ```

## 🔥 OOP Concepts Used
- **Encapsulation**: Private attributes with getter/setter methods.
- **Inheritance**: Student class inherits from a Person class (if applicable).
- **Polymorphism**: Method Overriding for different behaviors.
- **Abstraction**: Abstract classes/interfaces for better structure.

---
📌 **Note**: This is a basic implementation intended for learning and demonstration purposes only. 🚀

