import java.util.*;
import java.util.stream.Stream;

public class Register implements Nameable, Comparator<Student> {

    public static List<Student>students;
    public static List<Student>levelList;
    static Map<Student.Level, List<Student>>levelListMap = new HashMap<>();

    Stream<Student>fff;

    // Register constructor
    public Register(List<Student> s) {
        students = s;
    }

    @Override
    public String getName() {
        return null;
    }

    // Get names of all students
    public String getRegister(){
        for(Student s : students){
            return s.getName();
        }
        return null;
    }

    // Get student by name
    public Student getStudentByName(String  name) throws StudentNotFoundException{
        for (Student s : students){
            if (s.getName() == name){
                return s;
            }  else {
                throw new StudentNotFoundException("Name not found");
            }
        }
        return  null;
    }

    // Get register by level
    public Map<Student.Level, List<Student>> getRegisterByLevel(Student.Level level){
        for (Student s : students){
            if (s.getLevel() == level){
                levelList.add(s);
                levelListMap.put(level, levelList);
            }
        }
        return levelListMap;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
