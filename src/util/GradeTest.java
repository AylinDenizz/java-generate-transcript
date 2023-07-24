package hw3.util;


public class GradeTest {

    public static void main(String[] args) {
        hw3.util.GradeEnum[] grades = hw3.util.GradeEnum.values();
        for (hw3.util.GradeEnum grade : grades) {
            System.out.println(grade.toString());
        }
    }
}
