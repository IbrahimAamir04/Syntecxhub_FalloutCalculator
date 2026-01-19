# Fallout Calculator ☢️

A retro-styled Android calculator inspired by **Fallout 3** and **Fallout: New Vegas**, built using **Kotlin** and **XML layouts**.  
This project demonstrates clean architecture, responsive UI design, and proper separation of logic and presentation.

---

## 📱 Project Overview

Fallout Calculator is a simple yet polished calculator application that supports basic arithmetic operations while maintaining a strong retro aesthetic inspired by classic Fallout terminals.

The project was developed as part of an internship task to demonstrate Android fundamentals, clean code practices, and UI responsiveness.

---

## ✨ Features

- Basic arithmetic operations:
  - Addition (+)
  - Subtraction (−)
  - Multiplication (×)
  - Division (÷)
- Clear (C) functionality
- ON / OFF power button
- Divide-by-zero handling
- Basic input validation
- Fallout-style retro green terminal UI
- Perfectly optimized layouts for:
  - Portrait mode
  - Landscape mode
- Responsive UI using ConstraintLayout and GridLayout

---

## 🧠 Architecture & Design

- **UI Layer**
  - XML layouts for portrait and landscape
  - ConstraintLayout for adaptive screen sizing
  - GridLayout for evenly spaced calculator buttons

- **Logic Layer**
  - Calculation logic separated from UI
  - Clean, reusable functions
  - No business logic inside UI click handlers

This separation improves readability, maintainability, and scalability.

---

## 🛠 Tech Stack

- **Language:** Kotlin
- **Minimum SDK:** 21
- **UI:** XML Layouts
- **Layouts Used:**
  - ConstraintLayout
  - GridLayout
- **Architecture:** Activity + Logic class separation

---

## 🎮 Theme Inspiration

The UI design is inspired by:
- Fallout 3 Pip-Boy interface
- Fallout: New Vegas terminal screens

Key visual elements include:
- Dark backgrounds
- Green monospace text
- Retro terminal feel

---

## 📂 Project Structure

app/
├── java/
│ └── com.example.simplecalculator/
│ ├── MainActivity.kt
│ └── CalculatorLogic.kt
├── res/
│ ├── layout/
│ │ ├── activity_main.xml
│ │ └── activity_main_land.xml
│ ├── values/
│ │ ├── colors.xml
│ │ └── styles.xml


---

## 🚀 How to Run

1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle
4. Run on an emulator or physical device (SDK 21+)

---

## 🧪 Edge Cases Handled

- Division by zero
- Multiple operator presses
- Leading zeros
- Disabled input when calculator is OFF

---

## 👤 Author

**Raja Muhammad Ibrahim Aamir**
Software Engineering Generalist
Android Developer  
Kotlin | XML | Clean Architecture  

---

## 📄 License

This project is for educational and internship evaluation purposes.
