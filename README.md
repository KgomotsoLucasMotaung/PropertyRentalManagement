# Property Rental Management

A simple **Java Maven application** for managing property rentals.  
This project allows you to create, update, and manage property data, including details like rental units, construction information, and property models.

---

## 📂 Project Structure

```
PropertyRentalManagement/
│
├── src/main/java/com/mycompany/propertyrentalmanagement/
│   ├── Property.java
│   ├── PropertyModel.java
│   ├── IRoadsConstructed.java
│   └── PropertyRentalManagement.java
│
├── pom.xml
└── README.md
```

---

## 🚀 Features
- Add and manage **Property** records.
- Define **Property Models** and link them to rentals.
- Track **Road Construction** interfaces for properties.
- Centralized execution from the `PropertyRentalManagement` main class.
- **JUnit 5** integration for unit testing.

---

## 🛠️ Technologies Used
- **Java 17**
- **Apache Maven** for build automation
- **JUnit 5** for testing
- **OOP Principles** (Interfaces, Models, etc.)

---

## ⚙️ Prerequisites
- Java 17 or higher installed
- Apache Maven installed
- A code editor or IDE (e.g., IntelliJ IDEA, NetBeans, or VS Code)

---

## ▶️ How to Run
1. Clone the repository or download the source code.
2. Navigate to the project directory in your terminal:
   ```bash
   cd PropertyRentalManagement
   ```
3. Compile and package the application:
   ```bash
   mvn clean install
   ```
4. Run the application using Maven Exec Plugin:
   ```bash
   mvn exec:java -Dexec.mainClass="com.mycompany.propertyrentalmanagement.PropertyRentalManagement"
   ```

---

## 🧪 Running Tests
JUnit 5 is configured in the `pom.xml`. To run the tests:
```bash
mvn test
```

---

## 📦 Maven Configuration
Key configurations from the `pom.xml`:
- **Java Version:** 17  
- **Main Class:** `PropertyRentalManagement`  
- **Plugins:** `maven-compiler-plugin`, `exec-maven-plugin`, `maven-surefire-plugin`

---

## 📄 License
This project is licensed under the MIT License – you are free to use, modify, and distribute.

---

## ✍️ Author
**Lucas Motso Motaung**  
_Backend Developer | ALX Intern_
