import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class MainParking {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);
        CommonResource resource = new CommonResource();

        int countParkingPlaces = 4;
        for(int i = 1; i < countParkingPlaces; i++){
            new Thread(new MyThread(resource,semaphore,i)).start();
        }
    }
}
