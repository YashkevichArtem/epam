package OptionalTask;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileStringsToList {
    public static void main(String[] args) throws IOException {
        //Создаём fileWriter и записываем
        FileWriter fw = new FileWriter("text1.txt");
        fw.write("Blackbird singing in the dead of night\nTake these broken wings and learn to fly\n" +
                "All your life\nYou were only waiting for this moment to arise");
        fw.close();

        List<String> song = new ArrayList<>();
        //Создаём fileReader и список, чтобы ввести строки ИЗ файла и записать в список.
        FileReader fr = new FileReader("text1.txt");
        Scanner sc = new Scanner(fr);

        while (sc.hasNextLine()){
            song.add(sc.nextLine());
        }
        fr.close();

        //Создаём новый список, чтобы вывести строки в файл в обратном порядке.
        List<String> newSong = new ArrayList<>();
        int songSize = song.size() - 1;
        for(int i = songSize; i > -1; i--){
           newSong.add(song.get(i));
        }

        FileWriter fw1 = new FileWriter("text1.txt");

        for (String forFw : newSong) {
            fw1.write(forFw);
        }
        fw1.close();
    }
}
