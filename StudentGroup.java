import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private String groupName;
    private List<Student> students;
    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }
    public String getGroupName() {
        return groupName;
    }
    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Maksymalna liczba osób w grupie została osiągnięta.");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Ten student jest już w grupie.");
        }
        students.add(student);
    }
}
