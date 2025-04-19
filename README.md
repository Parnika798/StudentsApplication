Student Data Entry Application - 


This application provides a simple and efficient way to manage student data, including details such as PRN, Name, Branch, Batch, and CGPA, using MySQL as the database and JDBC for database connectivity.

Technologies Used -

Java, MySQL, JDBC (Java Database Connectivity)

Features - 

The application supports the following features:


Insert Student: Adds a new student record to the database.


View Students: Retrieves and displays all student records.


Update Student: Updates the details of an existing student record.


Delete Student: Deletes a student record from the database.


Project Structure
Student.java: The model class representing a student.

StudentOperations.java: Class that handles CRUD operations (Create, Read, Update, Delete).

Main.java: The main entry point to run the application.

Functionality
1. Insert Student (insertStudent() method):
This method allows the user to input a student's details (PRN, Name, Branch, Batch, CGPA) via the console. The data is then inserted into the students table in the MySQL database.


2. View Students (viewStudent() method):
This method retrieves all student records from the database and displays them in the console.


3. Update Student (updateStudent() method):
This method allows the user to update specific fields (Name, Branch, Batch, or CGPA) of an existing student record identified by PRN.

4. Delete Student (deleteStudent() method):
This method allows the user to delete a student record by PRN.


