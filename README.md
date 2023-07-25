# Java Transcript Generation Application

This Java application is designed to generate transcripts for students based on their academic records. It follows Object-Oriented Programming (OOP) principles, making use of classes to organize and manage the data efficiently.

## Getting Started

To use this application, follow these steps:

1. Clone the repository to your local machine.
2. Make sure you have Java Development Kit (JDK) installed.
3. Open the project in your favorite Java Integrated Development Environment (IDE).

## Application Structure

The application consists of the following main classes:

### 1. `Student`

The `Student` class represents a student and contains the following attributes:

- `studentId`: A unique identifier for each student.
- `firstName`: First name of the student.
- `lastName`: Last name of the student.
- `courses`: A list of courses taken by the student.
- `grades`: A list of corresponding grades for each course.

The class includes methods to add courses and grades, calculate the grade point average (GPA), and display the student's information.

### 2. `Course`

The `Course` class represents an academic course and contains the following attributes:

- `courseCode`: A unique code for the course.
- `courseName`: The name of the course.
- `creditHours`: The number of credit hours for the course.

### 3. `TranscriptGenerator`

The `TranscriptGenerator` class is responsible for generating the transcript for each student. It takes a `Student` object as input and produces a formatted transcript as output. The transcript includes the student's personal information, a list of courses taken, corresponding grades, and GPA.
