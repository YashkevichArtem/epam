package actions;

import University.Student;
import University.Subject;

import java.util.List;

public class StudentAction extends Calculator {
    public static List<Integer> getGradesBySubject(Student student, Subject subject){
        return student.getGrades().getSubjectAndGrades().get(subject);
    }
}
