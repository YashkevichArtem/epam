package University;

import UniversityExeptions.GradeOutOfRangeException;
import UniversityExeptions.StudentWithoutSubjectsException;

import java.util.*;

public class Student {

    private String name;
    private int studentId;
    private EnumSet<Subject> subjects;
    private static int studentsNumber;
    private Grades grades;


    public Student(String name, EnumSet<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
        this.studentId = studentsNumber;
        studentsNumber++;
    }

    public class Grades {
        private EnumMap<Subject,List<Integer>> subjectAndGrades = new EnumMap<Subject, List<Integer>>(Subject.class);

        public Grades() {
            for (Subject subject:subjects) {
                subjectAndGrades.put(subject,new ArrayList<>());
            }
        }

        public EnumMap<Subject,List<Integer>> getSubjectAndGrades() {
            return subjectAndGrades;
        }

        private void setSubject(Subject subject) {
            if (subjects.contains(subject)) {
                subjectAndGrades.put(subject,new ArrayList<>());
            }
        }



        private void setGrade(Subject subject,int grade) throws GradeOutOfRangeException {
                if (grade >= 0 && grade <= 10) {
                    List<Integer> grades = subjectAndGrades.get(subject);
                    grades.add(grade);
                    subjectAndGrades.put(subject,grades);
                }else {
                    throw new GradeOutOfRangeException("The grade must be from 1 to 10.");
                }
        }
        @Override
        public String toString() {
            return subjectAndGrades.toString();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public EnumSet<Subject> getSubjects() throws StudentWithoutSubjectsException {

        if(subjects.isEmpty()) throw new StudentWithoutSubjectsException("Student " + getName() + " with ID number = " + getStudentId()
                    + " don't have any subjects!");
        return subjects;
    }

    public void setSubjects(EnumSet<Subject> subjects) {
        this.subjects = subjects;
    }

    public Grades getGrades() {
        return grades;
    }
}
