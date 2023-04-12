package actions;

import University.Student;
import University.Subject;
import UniversityExeptions.StudentWithoutSubjectsException;

import java.util.List;

public class Calculator {
    public static double calculateAverageGrade(List<Student> students, Subject subject) throws StudentWithoutSubjectsException {
        Double averageGrade = 0.0;
        int gradesCount = 0;

        for(Student student : students) {
            if(student.getSubjects().contains(subject)){
                List<Integer> grades = StudentAction.getGradesBySubject(student,subject);

                for(Integer grade : grades) {
                    averageGrade += grade;
                    gradesCount++;
                }
            }
        }
        averageGrade = (gradesCount != 0) ? averageGrade/gradesCount : averageGrade;
        return averageGrade;
    }
}
