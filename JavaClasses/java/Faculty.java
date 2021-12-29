import java.util.Arrays;

public class Faculty {

    public void facultyCheck(String facultyToCheck){
        System.out.println("Список студентов относящихся к факультету " + facultyToCheck);
        for (int i = 0; i < 6; i++) {
            Student s = MainStudent.ss[i];
            if (s.getFaculty().equals(facultyToCheck)){
                System.out.println(s);
            }
        }
        System.out.println();
    }

    public void sortedListOfStudentsByCourseAndFaculty() {
        //сортировка студентов по курсам и факультетам
        Arrays.sort(MainStudent.ss, new CompByGroupAndFaculty() {
            @Override
            public int compare(Student o1, Student o2) {
                return super.compare(o1, o2);
            }
        });

        System.out.println("Отсортированный список студентов по курсам и факультетам");
        for (int i = 0; i < 6; i++) {
            Student s = MainStudent.ss[i];
            System.out.println(s);
        }
        System.out.println();
    }

    public void sortedListOfStudentsByDateOfBirth(int dateOfBirth){
        System.out.println("Список студентов родившихся после " + dateOfBirth + " года");
        for (int i = 0; i < 6; i++) {
            Student s = MainStudent.ss[i];
            if (Integer.parseInt(s.getDateOfBirth().substring(6)) > dateOfBirth){
                System.out.println(s);
            }
        }
        System.out.println();
    }

    public void sortedListOfStudentsByGroupNumber(int groupNumber){
        System.out.println("Список учебной группы номер " + groupNumber);
        for (int i = 0; i < 6; i++) {
            Student s = MainStudent.ss[i];
            if (s.getGroup() == groupNumber){
                System.out.println(s);
            }
        }
    }

}
