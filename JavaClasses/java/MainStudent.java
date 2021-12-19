import java.util.Arrays;

public class MainStudent {

    public static void main(String[] args) {
        Student[] s = new Student[6];
        s[0] = new Student(1,"Антон","Петров","Альбертович","26.06.1998",
                "ул.Пушкина 12",365234,"Биохимия",2,3);
        s[1] = new Student(2,"Олег","Носорогов","Викторович","13.12.1983",
                "ул.Свердлова 34",126534,"Машиностроение",5,12);
        s[2] = new Student(3,"Сергей","Валетов","Сергеевич","15.01.1961",
                "ул.БЛК 56",873409,"Международные отношения",1,16);
        s[3] = new Student(4,"Павел","Футов","Дмитриевич","01.03.1973",
                "ул.Дзержинского д.2",907623,"Филология",3,2);
        s[4] = new Student(5,"Мирослав","Игнатенко","Франкович","28.06.1999",
                "ул.Советская д.71",451276,"История",1,8);
        s[5] = new Student(6,"Игнат","Полуянов","Альбертович","26.06.1998",
                "ул.Пушкина 12",365234,"Биохимия",3,3);

        String facultyCheck = "Биохимия";
        System.out.println("Список студентов по факультету " + facultyCheck);

        for (Student student : s) {
            if (student.getFaculty().equals(facultyCheck)){
                System.out.println(student);
            }
        }
        System.out.println();


        Arrays.sort(s, new CompByGroupAndFaculty() {
            @Override
            public int compare(Student o1, Student o2) {
                return super.compare(o1, o2);
            }
        });

        System.out.println("Отсортированный список студентов по курсам и факультетам:");

        for (Student student : s) {
            System.out.println(student);
        }
        System.out.println();

        int year = 1990;
        System.out.println("Список студентов родившихся после " + year + " года");
        for (Student student : s) {
            if (Integer.parseInt(student.getDateOfBirth().substring(6)) > year){
                System.out.println(student);
            }
        }
        System.out.println();

        int groupNumber = 16;
        System.out.println("Список учебной группы номер " + groupNumber);
        for (Student student : s) {
            if (student.getGroup() == groupNumber){
                System.out.println(student);
            }
        }
    }
}
