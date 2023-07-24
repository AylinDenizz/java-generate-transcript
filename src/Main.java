import hw3.main.Transcript;
import main.CourseGrade;

public class Main {
    public static void main(String[] args) {

        CourseGrade course1 = new CourseGrade("CENG", 201, 5, 3.2);
        CourseGrade course2 = new CourseGrade("CENG", 201, 5, 3.8);
        CourseGrade course3 = new CourseGrade("CENG", 201, 5, 3.1);
        CourseGrade course4 = new CourseGrade("CENG", 201, 5, 3.5);
        CourseGrade course5 = new CourseGrade("CENG", 201, 5, 3.5);

        CourseGrade course6 = new CourseGrade("CENG", 201, 5, 3.5);

        CourseGrade course7 = new CourseGrade("CENG", 201, 5, 3.5);


        hw3.main.Transcript transcript = new Transcript(1112234);
        transcript.addCourseTaken(course1);
        transcript.addCourseTaken(course2);
        transcript.addCourseTaken(course3);
        transcript.addCourseTaken(course4);
        transcript.addCourseTaken(course5);
        transcript.addCourseTaken(course6);
        transcript.addCourseTaken(course7);


        System.out.println(transcript.toString());
    }
}