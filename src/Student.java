import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable, HasLevel {

    // Class attributes
    String studentName;
    public List<Double>studentGrades;
    enum Level {level1, level2, level3, level4;}
    private Level level;

    @Override
    public Level getLevel() {
        return level;
    }

    //Implementing getName method
    @Override
    public String getName() {
        return studentName;
    }

    //Get average grades
    public double getAverageGrade(){

        int numOfCourses = 0;
        double totalScore = 0.0;

        for (double i : studentGrades){
            numOfCourses += 1;
            totalScore += i;
        }

        return (totalScore/numOfCourses);
    } // End of getAverageGrade method


    // Student class constructor
    public Student(String studentName, List<Double> studentGrades, Level level) {
        this.studentName = studentName;
        this.studentGrades = studentGrades;
        this.level = level;

        Register.students.add(new Student(studentName, studentGrades, level));
    } //End of constructor

}
