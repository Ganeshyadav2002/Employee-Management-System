# Employee-Management-System

A brief description of what this project does and who it's for


## Project Description
The Employee Management System is a desktop application developed in Java using Swing and AWT for the graphical user interface. It uses MySQL as the database, connected via JDBC. The application allows users to manage employee data effectively.


## Requirement
1. MySQL-Connector-j JAR (Java ARchive)
2. rs2xml JAR
3. jCalender JAR
## Features

1. Add Employee: Add new employee records to the database.
2. Edit Employee: Update existing employee details.
3. Delete Employee: Remove employee records from the database.
4. Search Employee: Find employees by various criteria.
5. Display Employees: View a list of all employees in a table format.
6. Date Picker: Utilize JCalendar for selecting dates.
7. Database Connectivity: Connect to MySQL database using JDBC.
## Technologies Used:
 
1. **Java Swing :** For creating the graphical user interface.
2. **Java AWT :** For event handling and additional GUI components.
3. **JCalendar :** For date selection.
4. **JDBC :** For database connectivity.
5. **rs2xml :** For converting ResultSet to TableModel.
6. **MySQL Database :** For storing employee data.
7. **JConnector :** MySQL Connector/J for connecting Java applications with MySQL database.
8. **JRE :** Java Runtime Environment for running the application.
## Installation and Setup

Clone the repository: bash

```git clone https://github.com/Ganeshyadav2002/Employee-Management-System.git```
## Setup the database:

Install MySQL and create a database named employeemanagementsystem .
## Configure Database Connection:

Update the database URL, username, and password to match your MySQL configuration.
## Java
```String url = "jdbc:mysql://localhost:3306/employeemanagementsystem";
String username = "your_username";
String password = "your_password";```

Build and Run the Application: i) Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse). ii) Build the project to resolve dependencies. iii) Run the Main.java file to start the application.
## Usage

1. **Launch the Application:**
Execute the Main.java file to open the Employee Management System.

2. **Add Employee:**
Navigate to the "Add Employee" section. Fill in the employee details and click "Submit".

3. **Edit Employee:**
Navigate to the "Edit Employee" section. Search for the employee and update the necessary details.

4.**Delete Employee:**
Navigate to the "Delete Employee" section. Search for the employee and click "Delete".

5. **Search Employee:**
Use the search functionality to find employees by name, department, or ID.

6. **Display Employees:**
View all employee records in a table format.
## Acknowledgements
Thanks to the developers of Java, MySQL, and all the libraries used in this project.
