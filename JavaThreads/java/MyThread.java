import java.util.concurrent.Semaphore;

public class MyThread extends Thread {


    Semaphore semaphore;
    CommonResource resource;
    int carId;

    MyThread(CommonResource resource, Semaphore semaphore, int carId){
        this.semaphore = semaphore;
        this.carId = carId;
        this.resource = resource;
    }

    public void run(){
        try {
                System.out.println("Car number " + carId + " waiting at gates");
                semaphore.acquire();
                sleep(300);
                resource.x = 1;
                System.out.println("Car number " + carId + " found a parking place and park a car");
                sleep(500);

                System.out.println("Car number " + carId + " leave parking!");
                semaphore.release();
                sleep(500);
        }catch (InterruptedException e){
            System.out.println("Car number " + carId + " not found a parking place.");
        }
    }
}
