package University;

public class MainStudent {

    public static void main(String[] args) {


        Student st1 = new Student();
        st1.getStudentInfo().addFacyltyAndGroup("Biohimiya",1);
        st1.getStudentInfo().addSubjAndGrade("Biology",5);
        st1.getStudentInfo().addSubjAndGrade("Chimya",4);
        st1.getStudentInfo().sOut();

        Student st2 = new Student();
        st2.getStudentInfo().addFacyltyAndGroup("Fizmat",1);
        st2.getStudentInfo().addSubjAndGrade("Matem",4);
        st2.getStudentInfo().addSubjAndGrade("Fizika",7);

        st1.getStudentInfo().getTotalGradeOfAllStudentGrades();
    }
}
