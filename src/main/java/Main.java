import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите своё имя!");
        String userField = scan.nextLine();
        System.out.println("Приветствую, " + userField);

        System.out.println("Требуется ввести число соответствующего месяца");
        switch (scan.nextInt()){
            case 1:
                System.out.println("Январь");break;
            case 2:
                System.out.println("Февраль");break;
            case 3:
                System.out.println("Март");break;
            case 4:
                System.out.println("Апрель");break;
            case 5:
                System.out.println("Май");break;
            case 6:
                System.out.println("Июнь");break;
            case 7:
                System.out.println("Июль");break;
            case 8:
                System.out.println("Август");break;
            case 9:
                System.out.println("Сентябрь");break;
            case 10:
                System.out.println("Октябрь");break;
            case 11:
                System.out.println("Ноябрь");break;
            case 12:
                System.out.println("Декабрь");break;
            default:
                System.out.println("Введены неверные данные!");
        }
    }

}
