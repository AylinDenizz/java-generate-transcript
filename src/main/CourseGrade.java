package main;

import hw3.util.GradeEnum;

public class CourseGrade {
    private String courseDepartment;
    private int courseCode;
    private int courseCredit;
    private GradeEnum gradeTaken;

    public CourseGrade(String courseDepartment) {
        this(courseDepartment, 100,4, GradeEnum.F.getNumericValue() );
    }

    public CourseGrade(String courseDepartment, int courseCode) {
        this(courseDepartment, courseCode,4, GradeEnum.F.getNumericValue());
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit) {
        this(courseDepartment, courseCode,courseCredit, GradeEnum.F.getNumericValue() );
    }

    public CourseGrade(String courseDepartment, int courseCode, int courseCredit, double gradeTakenNumb) {
       setCourseCode(courseCode);
       setCourseCredit(courseCredit);
       setCourseDepartment(courseDepartment);
       setGradeTaken(gradeTakenNumb);
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {

        String[] defaultDepartments = {"CENG", "COMP", "ECE", "ME", "MATH"};
        for (String department : defaultDepartments) {
            if (courseDepartment.toUpperCase().equals(department)) {
                this.courseDepartment = courseDepartment;
                return;
            }
        }
        this.courseDepartment = "CENG";
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        if ((courseCode <= 599) && (courseCode >= 100)) {
            this.courseCode = courseCode;
        } else {
            this.courseCode = 100;
        }

    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        if (courseCredit == 3 || courseCredit == 4) {
            this.courseCredit = courseCredit;
        } else {
            this.courseCredit = 4; // Change this.courseCode to this.courseCredit
        }
    }

    public GradeEnum getGradeTaken() {
        return gradeTaken;
    }

    public void setGradeTaken(double gradeTakenNumb) {
        if (gradeTakenNumb >= 0 && gradeTakenNumb <= 4) {
            int roundedGradeTaken = (int)Math.round(gradeTakenNumb);
            for (GradeEnum grade : GradeEnum.values()) {
                if (grade.getNumericValue() == roundedGradeTaken) {
                    this.gradeTaken = grade;
                    return;
                }
            }
        } else {
            this.gradeTaken = GradeEnum.F;
        }
    }

    @Override
    public String toString() {
        return "Department: " + this.courseDepartment +
                " CourseCode: " + this.courseCode +
                " Credit: " + this.courseCredit +
                " Grade: " + this.gradeTaken.getStringValue() + "\n";
    }

}