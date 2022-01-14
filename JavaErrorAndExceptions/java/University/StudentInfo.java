package University;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentInfo {
    private int studentId;
    private Map<String,Integer> facultyAndGroup = new HashMap<>();
    private Map<String,Integer> subjAndGrade = new HashMap<>();
    private List<Object> students = new ArrayList<>();

    StudentInfo(int studentId){
        this.studentId = studentId;
    }

    void addFacyltyAndGroup(String faculty, int group){
        facultyAndGroup.put(faculty,group);
    }

    void addSubjAndGrade(String subject, int grade){
        subjAndGrade.put(subject,grade);
    }

    void getTotalGradeOfAllStudentGrades(){
        double quantityOfGrades = subjAndGrade.size();
        double sumOfGrades = 0;
        for(Map.Entry<String,Integer> map : subjAndGrade.entrySet()){
            sumOfGrades += map.getValue();
        }
        double totalGrade = sumOfGrades / quantityOfGrades;
        System.out.println("Средняя оценка по всем предметам: " + totalGrade);
    }

    void sOut(){
        for(Map.Entry<String,Integer> entry : subjAndGrade.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
