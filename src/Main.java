import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("group1");

        new MyThread(threadGroup,"Thread1").setSleepTime(1000).start();
        new MyThread(threadGroup,"Thread2").setSleepTime(2000).start();
        new MyThread(threadGroup,"Thread3").setSleepTime(3000).start();
        new MyThread(threadGroup,"Thread4").setSleepTime(4000).start();
        Thread.currentThread().sleep(15000);
        threadGroup.interrupt();
    }
}
