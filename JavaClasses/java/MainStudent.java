import java.util.Arrays;

public class MainStudent {
    public static Student[] ss = new Student[6];

    public static void main(String[] args) {
        ss[0] = new Student(1,"Антон","Петров","Альбертович","26.06.1998",
                "ул.Пушкина 12",365234,"Биохимия",2,3);
        ss[1] = new Student(2,"Олег","Носорогов","Викторович","13.12.1983",
                "ул.Свердлова 34",126534,"Машиностроение",5,12);
        ss[2] = new Student(3,"Сергей","Валетов","Сергеевич","15.01.1961",
                "ул.БЛК 56",873409,"Международные отношения",1,16);
        ss[3] = new Student(4,"Павел","Футов","Дмитриевич","01.03.1973",
                "ул.Дзержинского д.2",907623,"Филология",3,2);
        ss[4] = new Student(5,"Мирослав","Игнатенко","Франкович","28.06.1999",
                "ул.Советская д.71",451276,"История",1,8);
        ss[5] = new Student(6,"Игнат","Полуянов","Игнатович","01.01.1994",
                "ул.Соловьева 25",993477,"Биохимия",3,3);

        Faculty faculty = new Faculty();

        faculty.facultyCheck("Биохимия");

        faculty.sortedListOfStudentsByCourseAndFaculty();

        faculty.sortedListOfStudentsByDateOfBirth(1990);

        faculty.sortedListOfStudentsByGroupNumber(12);

    }
}
