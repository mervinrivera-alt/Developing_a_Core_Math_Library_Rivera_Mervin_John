# Math & Analysis Library (Sem2Act1)

A Java-based mathematical framework demonstrating core Object-Oriented Programming (OOP) principles through arithmetic, geometry, and number analysis.

## Table of Contents
* [Project Overview](#project-overview)
* [Inheritance Structure](#inheritance-structure)
* [Class Responsibilities](#class-responsibilities)
* [Encapsulation & Data Integrity](#encapsulation---data-integrity)

---

## Project Overview
This project, located in the `sem2act1` package, provides an extensible library for performing calculations. It utilizes abstract classes and inheritance to manage different mathematical operations and data analysis tasks efficiently.

---

## Inheritance Structure
The project is organized into two primary inheritance trees to separate arithmetic logic from number analysis:

### 1. Mathematical Operations Tree
* **sem2base (Abstract)**: The root class that holds the primary value and defines the mandatory `calculate()` method.
    * **sem2ArithMath (Abstract)**: Extends the base to include a second value (`value2`) for two-operand math.
        * **addition, subtraction, multiplication, division**: Concrete classes that perform the actual calculations.
    * **sem2GeomMath (Abstract)**: The base for geometric calculations.
        * **circleClass**: Implements area and circumference logic.

### 2. Number Analysis Tree
* **NumberAnalysisClass (Abstract)**: A separate base for analyzing single integers.
    * **PrimeCheckerClass**: Implements logic to check if a number is prime.
    * **factorialClass**: Designed for factorial logic (currently utilizes primality logic).

---

## Class Responsibilities
Each class follows the Single Responsibility Principle:

| Class | Primary Responsibility |
| :--- | :--- |
| **sem2base** | Manages the primary data and defines the calculation interface. |
| **sem2ArithMath** | Manages the secondary data for binary operations. |
| **addition** | Performs $Value1 + Value2$. |
| **division** | Performs $Value1 / Value2$ with zero-division safety. |
| **circleClass** | Handles radius-based calculations for circles. |
| **PrimeCheckerClass** | Validates if an integer is prime. |
| **Sem2Act1** | Serves as the main entry point to run tests and output results. |

---

## Encapsulation & Data Integrity
The project ensures data safety and program stability through strict encapsulation:

* **Private Fields**: Core variables such as `value`, `value2`, and `radius` are marked `private` to prevent unauthorized external access.
* **Accessors**: Public "Getter" and "Setter" methods are used to read and update data safely (e.g., `getValue()`, `setRadius()`).
* **Input Validation**:
    * **Division Safety**: The `division` class checks if the divisor is zero and returns an error message instead of crashing the program.
    * **Geometric Bounds**: The `circleClass` throws an `IllegalArgumentException` if a radius is less than or equal to zero.

