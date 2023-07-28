package main;

import main.CourseGrade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenerateTranscript {
    Scanner scanner = new Scanner(System.in);

    public Transcript takeInputFromUser() {

        System.out.println("Enter Student Id:");
        int studentId = scanner.nextInt();
        // Consume the newline character after reading the integer.
        main.Transcript transcript = new main.Transcript(studentId);

        while (true) {
            System.out.println("Enter Department (or type 'end' to finish):");
            String department = scanner.next();

            if (department.equalsIgnoreCase("end")) {
                break;
            } else {
                System.out.println("Enter Course Code:");
                int courseCode = scanner.nextInt();

                System.out.println("Enter Credit:");
                int credit = scanner.nextInt();

                System.out.println("Enter Grade:");
                double gradeTakenNumb = scanner.nextDouble();

                CourseGrade courseGrade = new CourseGrade(department, courseCode, credit, gradeTakenNumb);
                transcript.addCourseTaken(courseGrade);
            }
        }
        System.out.println(transcript.toString());
        return transcript;
    }

    public void takeInputFromFile() {
        try {
            System.out.println("Enter a file name: ");
            String fileName = scanner.nextLine();
            Scanner fileScanner = new Scanner(new File(fileName));

            int studentID = fileScanner.nextInt();
            fileScanner.nextLine(); // Consume newline character
            Transcript transcript = new Transcript(studentID);

            while (fileScanner.hasNextLine()) {
                String department = fileScanner.next();
                int courseCode = fileScanner.nextInt();
                int credit = fileScanner.nextInt();
                double grade = fileScanner.nextDouble();
                fileScanner.nextLine(); // Consume newline character

                CourseGrade courseGrade = new CourseGrade(department, courseCode, credit);
                courseGrade.setGradeTaken(grade);

                transcript.addCourseTaken(courseGrade);
            }

            fileScanner.close();
            System.out.println(transcript);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}




