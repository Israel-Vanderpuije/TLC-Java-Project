import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {

    List<Student>bagofstudents = new ArrayList<>();

    // Add student to bagofstudents
    public void addStudent(Student s){
        bagofstudents.add(s);
    }

    // Remove student from bagofstudent
    public void removeStudent(Student s){
        bagofstudents.remove(s);
    }

    // Remove all students from bagofstudents
    public void clearAllStudents(){
        bagofstudents.clear();
    }


}
