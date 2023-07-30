package main;

import main.CourseGrade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
            System.out.println("Enter a file name: ");
            String fileName = scanner.nextLine();

            InputStream inputStream = getClass().getResourceAsStream("/" + fileName);
            if (inputStream == null) {
                System.out.println("File not found: " + fileName);
                return;
            }

            int studentId= 0;

            scanner = new Scanner(inputStream);

            if (scanner.hasNextLine()) {
            studentId = Integer.parseInt(scanner.nextLine());
        }

        Transcript transcript = new main.Transcript(studentId);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            if (parts.length != 4) {
                System.out.println("Invalid line in the file: " + line);
                continue;
            }
            String department = parts[0];
            int courseCode = Integer.parseInt(parts[1]);
            int credit = Integer.parseInt(parts[2]);
            double grade = Double.parseDouble(parts[3]);

            CourseGrade courseGrade = new CourseGrade(department, courseCode, credit, grade);
            transcript.addCourseTaken(courseGrade);
        }

        scanner.close();
            System.out.println(transcript);

    }
}




