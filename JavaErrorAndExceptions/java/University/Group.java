package University;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<Student> students;

    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudents() {
        try {
            if (students.isEmpty()) throw new Exception("The group " + getGroupName() + " is empty and has no students!");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public void setStudent(Student student) {
        students.add(student);
    }
}
