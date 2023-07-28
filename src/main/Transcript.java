package main;

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

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public ArrayList<CourseGrade> getCourseGrades() {
        return courseGrades;
    }

    public void setCourseGrades(ArrayList<CourseGrade> courseGrades) {
        this.courseGrades = courseGrades;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
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
