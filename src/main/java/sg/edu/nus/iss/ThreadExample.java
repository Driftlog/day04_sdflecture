package sg.edu.nus.iss;

import java.util.LinkedList;
import java.util.List;

public class ThreadExample implements Runnable {

    private String threadName;

    public ThreadExample(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {

        System.out.println("thread started: " + threadName);
        List<String> list = new LinkedList<String>();
        list.add("apple");
        list.add("mango");
        list.add("orange");
        list.add("apple");

        System.out.println("value at index 0: " + list.get(0));
        for(String value : list) {
            System.out.println(value);
        }

        System.out.println("thread finished : " + threadName);

    }

}



//thread finishes not sequential