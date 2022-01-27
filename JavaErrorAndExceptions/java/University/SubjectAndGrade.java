package University;

import java.util.Map;

public class SubjectAndGrade {

    public SubjectAndGrade(Map<String,Integer> map){
        this.map = map;
    }

    public void checkGradeMinMax() throws Exception{
        for(Map.Entry<String,Integer> all : map.entrySet()) {
            if(all.getValue() < 1 || all.getValue() > 10){
                throw new Exception("Оценка не может быть ниже 1 или выше 10.");
            }
        }
    }

    public void checkEmptyMap() throws Exception{
        if(map.isEmpty()){
            throw new Exception("У студента должен быть хотя бы один предмет.");
        }
    }

    Map<String,Integer> map;

    public void getTotalMiddleGrade(){
        double sumOfGrades = 0;
        double quantityOfGrades = map.size();
        for (Map.Entry<String,Integer> all : map.entrySet()){
            sumOfGrades += all.getValue();
        }
        double totalGrade = sumOfGrades / quantityOfGrades;
        System.out.println(totalGrade);
    }
}
