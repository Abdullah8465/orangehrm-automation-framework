# OrangeHRM_Automation_Framework (Selenium + TestNG + POM)

## Overview
This project is a robust automation framework for the OrangeHRM web application. It leverages Selenium WebDriver for browser automation, TestNG for test management and reporting, and the Page Object Model (POM) design pattern for maintainable, scalable code. The framework is designed to reflect industry best practices and is suitable for enterprise-level automation projects.

## Key Features
- **Page Object Model (POM):** Each web page or module is represented by a dedicated Java class, encapsulating locators and actions for maintainable and reusable code.
- **TestNG Integration:** Efficient test management, grouping, parameterization, and detailed reporting using TestNG suites and annotations.
- **Maven Build Tool:** Handles all project dependencies and build lifecycle.
- **Explicit and Implicit Waits:** Ensures reliable and stable test execution across dynamic web elements.
- **Modular Test Structure:** Easily add, update, or remove test cases with minimal code changes.
- **Parameterization:** Test data is managed via TestNG XML for flexible test execution.
  
## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven

## Project Structure
src/
main/
java/
orangehrm/
library/ # Page classes (LoginPage, Employee, etc.)
testscases/ # Test classes (AdminLogin, Add_Employee)
utils/ # Utility classes (AppUtils)
pom.xml # Maven configuration
testing.xml # TestNG suite file

## Getting Started
1. **Clone the repository** git clone
2. **Install dependencies via Maven** mvn clean install
3. **Update the ChromeDriver path** in `AppUtils.java` if needed.
4. **Run tests using TestNG XML** - From IDE: Right-click `testing.xml` → Run as TestNG Suite

## Why Page Object Model (POM)?
- **Maintainability:** UI changes require updates only in page classes, not in every test.
- **Reusability:** Centralizes common actions and locators.
- **Scalability:** Easily add new features or test cases without rewriting existing logic.
  
## Skills Demonstrated
- Selenium WebDriver automation
- TestNG test organization and reporting
- Java programming (OOP concepts)
- POM design pattern implementation
- Maven build and dependency management
- Git version control
  


