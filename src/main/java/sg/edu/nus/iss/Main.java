package sg.edu.nus.iss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

public static void main (String[] args) {
    
    ThreadExample obj1 = new ThreadExample("Thread-1");
    ThreadExample obj2 = new ThreadExample("Thread-2");
    ThreadExample obj3 = new ThreadExample("Thread-3");

    Thread thread1 = new Thread(obj1);
    Thread thread2 = new Thread(obj2);
    Thread thread3 = new Thread(obj3);
    thread1.start();
    thread2.start();
    thread3.start();


    ExecutorService executor = Executors.newFixedThreadPool(3);
    executor.execute(obj1);
    executor.execute(obj2);
    executor.execute(obj3);

}
}
