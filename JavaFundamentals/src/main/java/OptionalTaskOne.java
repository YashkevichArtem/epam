import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OptionalTaskOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Введите положительное, целочисленное число и нажмите Enter. " +
                    "Если желаете окончить поиск, оставьте поле пустым и нажмите Enter.");
            String s = reader.readLine();
            if (s.isEmpty()){
                break;
            }
            try {
                int toInt = Integer.parseInt(s);
                list.add(toInt);
            }catch (Exception e){
                System.out.println("Ошибка! Требуется положительное и целочисленное число.");
            }

        }

        Collections.sort(list);

        int shortNumber = list.get(0);
        int longNumber = list.get(list.size() - 1);

        String longNumberLength = Integer.toString(longNumber);
        String shortNumberLength = Integer.toString(shortNumber);
        System.out.println("Самое короткое и маленькое число: " + shortNumber + ". Это " + shortNumberLength.length() + " значное число." );
        System.out.println("Самое длинное и большое число: " + longNumber + ". Это " + longNumberLength.length() + " значное число." );

        System.out.print("Числа в порядке возрастания значений их длины: ");
        for(Integer all : list){
            System.out.print(all + "; ");
        }
    }
}
