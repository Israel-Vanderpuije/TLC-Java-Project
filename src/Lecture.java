import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

    String lectureName;
    Student student;
    List<Student>studentsInThisLecture = new ArrayList<>();
    List<Double> lectureGrades = new ArrayList<>();

    public void Enter (Student student){

    }

    // Get the highest score
    public void getHighestAverageGrade(){
        double max = Collections.max(lectureGrades);
        System.out.println("The highest score for this lecture is: " + max);

    }
}
