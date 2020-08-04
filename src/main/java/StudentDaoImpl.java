import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    List<Student> studentList = new ArrayList<Student>();

    public StudentDaoImpl() {
        studentList.add(new Student(1,"张漾","nuaa1"));
        studentList.add(new Student(2,"qw","nuaa2"));
        studentList.add(new Student(3,"er","nuaa3"));
        studentList.add(new Student(4,"ty","nuaa4"));
    }

    public String isFindStudent(Student student) throws Exception {
        for(Student stu:studentList){
            if (stu.getSid()==student.getSid()){
                return "true";
            }
        }
        return "fasle";
    }
}
