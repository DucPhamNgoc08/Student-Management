# Student Management System

A simple **Student Management System** built using **Java Swing** for GUI and **ArrayList** for data storage.  
This application allows users to **manage student records**, including **adding, updating, deleting, searching**, and **viewing the student list**.

---

## Features
- **Login System** (Default: `Admin / 1234`)
- **Student Management**  
  - Add new students  
  - Update student details  
  - Delete students  
  - View student list  
- **Search for Students**  
  - Search by **Student ID**
- **Data Validation**  
  - Prevent duplicate **Student ID**
  - Ensure all fields are filled before adding a student  
- **GUI-based Application** using **Java Swing**  

---

## Project Structure
```
📁 Student-Management-System
│── 📁 src
│   ├── 📁 Login                 # Login functionality
│   │   ├── Login.java
│   │   ├── Login.form
│   │
│   ├── 📁 Management             # Main student management features
│   │   ├── Student.java          # Student model
│   │   ├── StudentManagement.java
│   │   ├── StudentManagement.form
│   │
│   ├── 📁 SearchForStudents      # Search functionality
│   │   ├── SearchForStudents.java
│   │   ├── SearchForStudents.form
│   │
│   ├── 📁 StudentList            # Student list display
│   │   ├── StudentList.java
│   │   ├── StudentList.form
│   │
│   ├── 📁 main                   # Entry point for application
│   │   ├── Main.java
│
│── 📄 README.md
│── 📄 LICENSE 
```

---

## Installation & Usage
### Clone the Repository  
```bash
git clone https://github.com/yourusername/Student-Management-System.git
cd Student-Management-System
```

### Compile & Run  
**Using Command Line**  
```bash
javac -d bin -sourcepath src src/main/Main.java
java -cp bin main.Main
```
**Or Run from an IDE (Eclipse/IntelliJ/NetBeans)**  
- Open the project  
- Run `Main.java`  

---

## 📝 Notes
- **No database is used** (Students are stored in memory using `ArrayList<Student>`)
- You can **extend** this project by adding a database (MySQL, SQLite)
- Feel free to **contribute** or **customize** as needed!

---

## Contribution
1. Fork the repository 🍴  
2. Create a new branch: `git checkout -b feature-new`  
3. Commit your changes: `git commit -m "Added new feature"`  
4. Push the branch: `git push origin feature-new`  
5. Open a **Pull Request**  

---

## License
This project is **open-source** under the **MIT License**.

---

### **Give this repository a star if you like it!** ⭐

