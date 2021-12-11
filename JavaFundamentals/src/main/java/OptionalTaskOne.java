import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class OptionalTaskOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Введите число и нажмите Enter. Если желаете окончить поиск, оставьте поле пустым и нажмите Enter.");
            String s = reader.readLine();
            if (s.isEmpty()) break;

            list.add(s);
        }

        String longNumber = list.get(0);
        String shortNumber = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).length() >= longNumber.length()){
                longNumber = list.get(i);
            }else{
                shortNumber = list.get(i);
            }
        }
        System.out.println("Самое короткое и маленькое число: " + shortNumber + ". Это " + shortNumber.length() + " значное число." );
        System.out.println("Самое длинное и большое число: " + longNumber + ". Это " + longNumber.length() + " значное число." );

        Collections.sort(list);
        System.out.print("Числа в порядке возрастания значений их длины: ");
        for(String all : list){
            System.out.print(all + ";");
        }
    }
}
