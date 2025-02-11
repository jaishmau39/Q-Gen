# Question Paper Generator

## Overview
A mobile application for automatically generating questions for teachers and students. Developed using **Android Studio** with an **SQLite** database for storing users and questions.

## Features
- **User Authentication:** Signup and login functionality with password storage.
- **Question Generation:** Automatic question paper generation.
- **Database Management:** Uses SQLite for storing student and question data.
- **User Interface:** Intuitive UI for teachers and students to manage questions.
- **Question Storage:** Allows saving and retrieving generated questions.

## Technologies Used
- **Android Studio** (Java)
- **SQLite Database**

## Project Structure
- **ModuleImplementation** → Output images for reference
- **DatabaseModule1.java** → Database helper class for storing student data
- **DatabaseModule2.java** → Additional database operations
- **Generation.java** → Question generation logic
- **HomePage.java** → Main activity with navigation to question generation
- **LoginPage.java** → User authentication logic
- **PushQuestions.java** → Stores new questions in the database
- **SignUpPage.java** → User registration and profile creation


## Database Schema (SQLite)
The application uses an SQLite database with the following schema:

**Table: `Student_table`**
| Column   | Type      | Description               |
|----------|----------|---------------------------|
| ID       | INTEGER  | Primary key (auto-increment) |
| NAME     | TEXT     | Student name |
| ROLL     | INTEGER  | Roll number |
| BRANCH   | TEXT     | Student branch |
| SEC      | TEXT     | Section |
| YEAR     | INTEGER  | Year of study |
| SEM      | INTEGER  | Semester |
| CONTACT  | INTEGER  | Contact number |
| EMAIL    | TEXT     | Email address |
| PASSWORD | TEXT     | Password (stored as plain text, recommend hashing) |

## How to Run
1. Open **Android Studio**.
2. Import the project.
3. Build and run the application on an emulator or physical device.
