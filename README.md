🚀 Selenium Automation Framework (Portfolio Project)

A complete Selenium WebDriver + Java + TestNG + Maven automation framework built to demonstrate professional automation engineering skills.
This project follows Page Object Model (POM), uses Thread-Safe DriverFactory, and generates rich Extent Reports—all designed from scratch for scalability & maintainability.

📘 Table of Contents

Project Overview
Features
Tech Stack
Folder Structure Explained
Prerequisites
Setup & Installation
Configuration
Running Tests
Reports
Test Cases Included
Git Workflow
Future Enhancements
About Me

📌 Project Overview

This project automates the Signup Module of a demo e-commerce application.
It showcases core automation skills such as:

Writing reusable page objects

Framework-level coding

Driver management

Test design

Reporting

Git branching & merging

⭐ Features

✔ Page Object Model

✔ Thread-safe DriverFactory

✔ Single-browser execution for full suite

✔ Maven dependency management

✔ Extent HTML reports (with screenshots)

✔ Configurable browser/app URL

✔ Clear, scalable project structure

✔ TestNG suite execution

✔ Professional Git workflow

🧰 Tech Stack

| Component                    | Technology                   |



| Language          | Java        
                 
| Automation        | Selenium WebDriver  
         
| Test Runner       | TestNG    
                   
| Build Tool        | Maven      
                  
| Reports           | Extent Reports 
              
| Design Pattern    | Page Object Model  
          
| Version Control   | Git & GitHub   
              
| IDE               | Eclipse / IntelliJ / VS Code
 
| Driver Management | WebDriverManager             |

🔧 Prerequisites

Install the following:

✔ Java JDK 17+

Check:

java -version

✔ Maven

Check:

mvn -version

✔ Git
git --version

✔ Browser (Chrome latest)
✔ IDE (Eclipse / VS Code / IntelliJ)
⚙️ Setup & Installation
1️⃣ Clone the repository
git clone https://github.com/Udit2507/SeleniumPractice.git

2️⃣ Navigate to folder
cd SeleniumPractice

3️⃣ Install Maven dependencies
mvn clean install

4️⃣ Open project in your IDE
🔧 Configuration

Located in:

src/main/resources/config/config.properties


Example:

browser=chrome
appUrl=https://www.demoblaze.com


To switch browser:

browser=edge
browser=firefox

▶️ Running Tests
✔ Run all tests using Maven:
mvn test

✔ Run TestNG suite:
mvn -DsuiteXmlFile=testng.xml test

✔ Run from IDE:

Right-click → Run As → TestNG Suite

📊 Reports
📄 1. Extent HTML Report

Location:

/reports/AutomationReport.html

📷 2. Screenshots for failures
/reports/screenshots/

📈 3. TestNG HTML Report
/test-output/index.html

🧪 Test Cases Included
✔ 1. Verify signup modal opens
✔ 2. Validate missing fields trigger JavaScript alert
✔ 3. Register user with unique username
✔ 4. Validate duplicate username error
✔ 5. Verify UI flow after registration

Upcoming modules:

Login

Logout

Add to Cart

Product Search

End-to-End checkout

🌳 Git Workflow

This project uses a professional Git branching strategy:

main → stable code

signup-feature → feature development

Pull Request (PR) → code review

Merge into main

Commands for new branch:

git checkout -b new-feature
git add .
git commit -m "Your message"
git push -u origin new-feature

🚀 Future Enhancements

✔ Add Log4j2 logging
✔ Add retry logic for failed tests
✔ Add parallel execution
✔ Integrate Jenkins / GitHub Actions
✔ Add Data-Driven Testing (Excel/CSV)
✔ Dockerized Selenium Grid support
✔ API + UI Hybrid framework

🎥 Demo – Automation Script Running

Watch the full execution video:
👉 https://www.awesomescreenshot.com/video/46706893?key=955e31adc3b0f9db5ee96e6fe4ce30ee

👨‍💻 About Me

Udit Kumar Gupta
QA Automation Engineer — 3+ Years

I specialize in:

Selenium, Playwright
TestNG, JUnit
API Testing (Postman, Rest Assured)
POM frameworks
CI/CD basics
Git branching
SQL & Performance testing basics

📧 Email: iuditkumargupta@gmail.com

🌐 LinkedIn:https://www.linkedin.com/in/udit-kumar-gupta-341694280



