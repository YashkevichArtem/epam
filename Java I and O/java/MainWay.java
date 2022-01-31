import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class MainWay {
    public static void main(String[] args) throws IOException {
        String path = args[0];
        File dir = new File(path);


        if(dir.isDirectory()){
            FileWriter fw = new FileWriter("test.txt");
            fw.write(dir.getParent() + dir.getName() + "\n");
            System.out.print(dir.getParent() + dir.getName() + "\n");
            for(File items : Objects.requireNonNull(dir.listFiles())){
                if(items.isDirectory()){
                    fw.write(items.getName() + " \t - \t folder\n");
                    System.out.println(items.getName() + " \t - \t folder");
                    for (File files : Objects.requireNonNull(items.listFiles())){
                        fw.write("\t " + files.getName() + " \t - \t file\n");
                        System.out.println("\t " + files.getName() + " \t - \t file");
                    }

                }else {
                    fw.write(items.getName() + " \t file\n");
                    System.out.println(items.getName() + " \t file");
                }
            }
            fw.close();

        } else if(dir.isFile()){
            FileReader fr = new FileReader("test.txt");
            Scanner sc = new Scanner(fr);
            String parentFolder = sc.nextLine();
            fr.close();

            File newDir = new File(parentFolder);
            if(newDir.isDirectory()){
                System.out.println("Кол-во папок = " + Objects.requireNonNull(newDir.listFiles()).length);
                int countFile = 0;
                for(File folder : Objects.requireNonNull(newDir.listFiles())){
                    System.out.println("Папка " + folder.getName() + " содержит кол-во файлов " + Objects.requireNonNull(folder.listFiles()).length);
                    for(File file : Objects.requireNonNull(folder.listFiles())){
                        System.out.println("Средняя длина названия файла " + file.getName() + " равна - " + file.getName().length() / 3);
                        countFile++;
                    }
                }
                System.out.println("Кол-во файлов = " + countFile);
            }
        }
    }
}
