package hw3.main;

import main.CourseGrade;

import java.util.ArrayList;

public class Transcript {

    private int studentID;
    private ArrayList<CourseGrade> courseGrades;
    private double GPA;

    public Transcript(int studentID) {
        this.studentID = studentID;
        this.GPA = 0;
        this.courseGrades = new ArrayList<>();
    }

    public void addCourseTaken(CourseGrade courseGrade) {
        if (courseGrade != null) {
            this.courseGrades.add(courseGrade);
            double totalGrade = 0;
            for (CourseGrade courseGrade1 : this.courseGrades) {
                totalGrade += courseGrade1.getGradeTaken().getNumericValue();
            }
            this.GPA = totalGrade / this.courseGrades.size();
        } else {
            System.out.println("ERROR: There is no course grade.");
        }
    }


    @Override
    public String toString() {
        StringBuilder transcript = new StringBuilder();
        transcript.append("Student ID: ").append(this.studentID).append("\n");

            transcript.append(this.courseGrades.toString()).append("\n");

        transcript.append("GPA: ").append(this.GPA);

        return transcript.toString();
    }
}
