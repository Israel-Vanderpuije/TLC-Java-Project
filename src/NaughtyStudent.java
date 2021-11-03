import java.util.List;

public class NaughtyStudent extends  Student{

    //Override methods
    @Override
    public double getAverageGrade() {
        int numOfCourses = 0;
        double totalScore = 0.0;

        for (double i : studentGrades){
            numOfCourses += 1;
            totalScore += i;
        }

        return ((totalScore + (totalScore * 0.10))/numOfCourses);
    }

    public NaughtyStudent(String studentName, List<Double> studentGrades, Level level) {
        super(studentName, studentGrades, level);
    }
}
