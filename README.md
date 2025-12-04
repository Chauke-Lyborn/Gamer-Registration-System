# Gamer Registration System (OOP + GUI + JUnit Project)

## Overview
This project simulates the registration process for the South African National
Computer Gamers Association (SANCGA).  
Gamers are classified as amateurs or professionals, and their information is
processed using object-oriented principles, GUI interaction, and JUnit testing.

The system demonstrates:
  - Abstract classes  
  - Polymorphism  
  - Swing GUI development  
  - Code generation logic  
  - Discount calculation rules  
  - Unit testing using JUnit  

---

## Features

### Gamer Registration
Allows adding amateur and professional gamers to the system.

Fields captured:
  - ID number
  - Name
  - Age  
  - Category (Amateur)  
  - Rank + Registered Years (Professional)

### Registration Code Generation
Automatically generates registration codes:

Amateur Code Format:
  `A + ID + "-" + category digit`

Professional Code Format:
  `P + (rank + age padded to 4 digits) + "-" + registered years`

### Discount Calculation Logic
Professionals:
  - Base fee R500
  - 5% discount per registered year
  - Maximum 50% discount

Amateurs:
  - Base fee R250
  - Students: 20%
  - Learners 16+ years: 30%
  - Learners under 16: 40%

### GUI Application
The JFrame form allows:
  - Input through text fields and combo boxes
  - Selecting gamer type via radio buttons
  - Storing gamers in an ArrayList
  - Displaying registered gamers in a text area

### JUnit Testing
Includes test cases for:
  - Amateur code generation
  - Professional code generation
  - Discount calculations for both categories

---

## Technologies Used
- **Programming Language:** Java  
- **Framework:** Swing GUI + JUnit Testing  
- **IDE:** NetBeans  

---

## Usage Instructions
1. Run the application to open the registration form.  
2. Enter gamer details.  
3. Select Amateur or Professional.  
4. Click **Register Gamer** to add the gamer.  
5. Click **View All** to display stored gamers.  

Registration codes and discount calculations happen automatically.

---

## Author
This project was developed as part of an academic practical to explore OOP design,
inheritance, GUI programming, polymorphism and JUnit testing.
