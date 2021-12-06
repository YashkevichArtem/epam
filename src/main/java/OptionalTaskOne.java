import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OptionalTaskOne {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while (true){
            String s = reader.readLine();
            if(s.isEmpty())break;
            list.add(Integer.parseInt(s));
        }

        int minInt = list.get(0);

        for(int i = 0; i < list.size(); i++){
            if(minInt > list.get(i)){
                minInt = list.get(i);
            }
        }
        System.out.println("Минимальное из чисел: " + minInt);



    }
}
