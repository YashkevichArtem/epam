package University;

import java.util.HashMap;
import java.util.Map;

public class MainStudent {

    public static void main(String[] args) throws Exception {

        NewStudent st1 = new NewStudent(1, "Биохимия", 3);
        NewStudent st2 = new NewStudent(2, "История", 1);
        NewStudent st3 = new NewStudent(3,"Биохимия",3);

        SubjectAndGrade subAndGradeSt1 = new SubjectAndGrade(new HashMap<>());
        subAndGradeSt1.map.put("Биология", 5);
        subAndGradeSt1.map.put("Химия", 6);
        System.out.print("Средний балл по предметам студента №" + st1.getId() + " = ");
        subAndGradeSt1.getTotalMiddleGrade();
        subAndGradeSt1.checkGradeMinMax();
        subAndGradeSt1.checkEmptyMap();

        SubjectAndGrade subAndGradeSt2 = new SubjectAndGrade(new HashMap<>());
        subAndGradeSt2.map.put("Природоведение", 4);
        subAndGradeSt2.map.put("Демография", 3);
        System.out.print("Средний балл по предметам студента №" + st2.getId() + " = ");
        subAndGradeSt2.getTotalMiddleGrade();
        subAndGradeSt2.checkGradeMinMax();
        subAndGradeSt2.checkEmptyMap();

        SubjectAndGrade subAndGradeSt3 = new SubjectAndGrade(new HashMap<>());
        subAndGradeSt3.map.put("Биология",8);
        subAndGradeSt3.map.put("Химия",9);
        System.out.print("Средний балл по предметам студента №" + st3.getId() + " = ");
        subAndGradeSt3.getTotalMiddleGrade();
        subAndGradeSt3.checkGradeMinMax();
        subAndGradeSt3.checkEmptyMap();

        Map<NewStudent, SubjectAndGrade> allStudentsInfo = new HashMap<>();
        allStudentsInfo.put(st1, subAndGradeSt1);
        allStudentsInfo.put(st2, subAndGradeSt2);
        allStudentsInfo.put(st3, subAndGradeSt3);

        //Указываем факультет, группу и предмет по которому будет производиться вычет среднего балла.
        String faculty = "Биохимия";
        int group = 3;
        String subject = "Биология";

        //Вычет среднего балла по предмету, группе и факультету
        int sizeOfSubjectsOne = 0;
        double sumOfGradesOne = 0;
        for(Map.Entry<NewStudent,SubjectAndGrade> all : allStudentsInfo.entrySet()){
            if(all.getKey().getFaculty().contains(faculty) && all.getKey().getGroup() == group && all.getValue().map.containsKey(subject)){
                sumOfGradesOne += all.getValue().map.get(subject);
                sizeOfSubjectsOne++;
            }
        }
        double totalGrade = sumOfGradesOne / sizeOfSubjectsOne;
        System.out.println("Средний балл по предмету " + subject + " в группе " + group + " на факультете " +
                faculty + " составляет = " + totalGrade);

        //Вычет среднего балла по университету
        int sizeOfSubjectsTwo = 0;
        double sumOfGradesTwo = 0;
        for(Map.Entry<NewStudent,SubjectAndGrade> all : allStudentsInfo.entrySet()){
            if(all.getValue().map.containsKey(subject)){
                sumOfGradesTwo += all.getValue().map.get(subject);
                sizeOfSubjectsTwo++;
            }
        }
        double totalGradeTwo = sumOfGradesTwo / sizeOfSubjectsTwo;
        System.out.println("Средний балл по предмету " + subject + " для всего университета составляет = " + totalGradeTwo);
    }
}
