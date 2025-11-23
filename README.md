🌐 Selenium Automation Framework – Portfolio Project

A professionally designed Selenium WebDriver + Java + TestNG + Maven automation framework built from scratch to demonstrate real-world automation expertise.
This project showcases my ability to design scalable, extensible, maintainable UI automation suites using industry-standard patterns like POM, DriverFactory, Utilities, Extent Reporting, Config Handling, and more.

📘 Table of Contents

Introduction

Key Features

Tech Stack

Architecture Overview

Folder Structure

Prerequisites / Requirements

Setup & Installation

Configuration (config.properties)

Running the Tests

Reporting

Test Cases Covered

Git Workflow Used

CI/CD (Optional Integration)

Future Enhancements

About Me

📌 Introduction

This framework automates the Signup functionality of a demo web application.
It follows a clean, modular, object-oriented automation design suitable for growing enterprise-level test automation.

It highlights:

My understanding of writing maintainable automation code

Application of TestNG + Selenium with proper annotations

Ability to work with reporting, utilities, cross-browser capability

Real Git workflow (branches, merges, PRs)

Professional project documentation

🚀 Key Features

✔ Page Object Model (POM)

Pages are separated with clear page methods and web elements.

✔ Thread-Safe DriverFactory

Uses ThreadLocal for safe parallel execution support.

✔ BaseTest with Suite-level Management

Single browser instance → faster execution → stable tests.

✔ Config File Support

Easily change URL, browser, and settings without code modification.

✔ Extent Reports Included

Generates full HTML reports with screenshots.

✔ TestNG Suite Execution (testng.xml)

Run full project with a single click.

✔ Reusable Utilities

Reporting

Screenshot

WebDriver

Base methods

✔ Clean Git Branch Workflow

Feature branches → pull requests → merge to main.

🛠 Tech Stack
Category	Technologies
Language	Java
Automation	Selenium WebDriver
Test Framework	TestNG
Build Tool	Maven
Reporting	Extent Reports
Design Pattern	Page Object Model (POM)
Version Control	Git, GitHub
IDE	Eclipse 2025-03 / VS Code
Driver Management	WebDriverManager
🧱 Architecture Overview

This framework is structured around these core components:

1️⃣ Base Layer

Contains:

BaseTest (suite setup)

BasePage (common Selenium wrapper methods)

2️⃣ Driver Layer

DriverFactory:

Initializes WebDriver

Manages ThreadLocal driver instance

Handles browser setup

3️⃣ Page Layer (POM)

Each webpage gets a dedicated Page Object class.
Example:

SignupPage

4️⃣ Test Layer

Contains all TestNG test classes.
Example:

SignupTest

5️⃣ Utilities Layer

Reporting utilities:

ExtentReports initialization

Screenshot capture

Report logging support

📂 Folder Structure
AutomationProject/
│   pom.xml
│   testng.xml
│   .gitignore
│
├───drivers/
├───logs/
├───reports/
│   ├── AutomationReport.html
│   ├── extent/
│   └── screenshots/
│
├───src/main/java/
│   ├── base/
│   │     BaseTest.java
│   ├── driver/
│   │     DriverFactory.java
│   ├── Pages/
│   │     BasePage.java
│   └── utilities/
│         ReportManager.java
│         ReportUtils.java
│
├───src/main/resources/
│   ├── config/
│   │     config.properties
│   └── testdata/
│
└───src/test/java/
    └── com/AutomationProject/
        ├── pages/
        │     SignupPage.java
        └── tests/
              SignupTest.java

📦 Prerequisites / Requirements

To run this project, install:

✔ Java JDK 17+

https://adoptium.net/

Check:

java -version

✔ Maven

https://maven.apache.org/download.cgi

Check:

mvn -version

✔ Git
git --version

✔ Browser (Chrome Latest)

Project uses WebDriverManager (no manual driver needed).

✔ IDE (Optional)

Eclipse 2025-03

IntelliJ IDEA

VS Code (Java Pack extension)

⚙️ Setup & Installation
1️⃣ Clone the project:
git clone https://github.com/Udit2507/SeleniumPractice.git

2️⃣ Open in your IDE
3️⃣ Install Maven dependencies:
mvn clean install

4️⃣ Check configuration file:
src/main/resources/config/config.properties

⚙️ Configuration (config.properties)

Example:

browser=chrome
appUrl=https://www.demoblaze.com


To run in Edge or Firefox later:

browser=edge
browser=firefox

▶️ Running the Tests
✔ Run from Maven:
mvn test

✔ Run the suite:
mvn -DsuiteXmlFile=testng.xml test

✔ Run from IDE:

Right-click → Run As → TestNG Suite

📊 Reporting
✔ Extent HTML Report

Path:

/reports/AutomationReport.html

✔ Screenshots on Failure

Path:

/reports/screenshots/

✔ TestNG Default Report

Path:

/test-output/index.html

🧪 Test Cases Covered
🔹 Signup Test Flow

Open Signup modal

Verify modal title

Validate empty fields alert

Register new user

Validate success

Detect already-existing username

More test modules coming soon:

Login

Logout

Add to cart

Product search

End-to-end checkout

🌳 Git Workflow Used

This project uses a professional Git strategy:

main → stable production-ready code

signup-feature → feature branch

Pull Requests to merge

Clean commit history

GitHub branch protections

⚙️ CI/CD (Optional)

You can integrate:

GitHub Actions

Jenkins

Azure DevOps

I can prepare a complete .yml pipeline if needed.

🚀 Future Enhancements

✔ Parallel execution
✔ Retry failed tests
✔ Logging using Log4j2
✔ API + UI combined tests
✔ Dockerized Selenium Grid
✔ PageFactory removal (migrate to Selenium 4 relative locators)
✔ Data-driven testing with Excel/CSV

👨‍💻 About Me

Udit Kumar Gupta
QA Automation Engineer (3 Years Experience)

Skills:

Selenium

Playwright

TestNG

API (Postman/RestAssured)

Performance Testing (Locust)

SQL

Jenkins

GitHub CI

📧 Email: iuditkumargupta@gmail.com

🔗 LinkedIn: https://www.linkedin.com/in/udit-kumar-gupta-341694280
