package University;

public class Student {

    private static int studentId = 0;

    private StudentInfo studentInfo;

    Student(){
        studentId++;
        this.studentInfo = new StudentInfo(studentId);
        System.out.println("Number of student: " + studentId + " ");
    }

    StudentInfo getStudentInfo(){
        return studentInfo;
    }
}
