import main.CourseGrade;
import main.GenerateTranscript;
import main.Transcript;

public class Main {
    public static void main(String[] args) {

        CourseGrade course1 = new CourseGrade("CENG", 201, 5, 3.2);
        CourseGrade course2 = new CourseGrade("CENG", 201, 5, 3.8);
        CourseGrade course3 = new CourseGrade("CENG", 201, 5, 3.1);
        CourseGrade course4 = new CourseGrade("CENG", 201, 5, 3.5);
        CourseGrade course5 = new CourseGrade("CENG", 201, 5, 3.5);

        CourseGrade course6 = new CourseGrade("CENG", 201, 5, 3.5);

        CourseGrade course7 = new CourseGrade("CENG", 201, 5, 3.5);


        Transcript transcript1 = new Transcript(1112234);
        transcript1.addCourseTaken(course1);
        transcript1.addCourseTaken(course2);
        transcript1.addCourseTaken(course3);
        transcript1.addCourseTaken(course4);
        transcript1.addCourseTaken(course5);
        transcript1.addCourseTaken(course6);
        transcript1.addCourseTaken(course7);


        System.out.println(transcript1.toString());

        GenerateTranscript transcript2 = new GenerateTranscript();
        transcript2.takeInputFromFile();

        GenerateTranscript transcript3 = new GenerateTranscript();
        transcript3.takeInputFromUser();





    }
}