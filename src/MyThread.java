import javax.sound.midi.Soundbank;

public class MyThread extends Thread {

    long sleepTime;

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public MyThread setSleepTime(long sleepTime) {
        this.sleepTime = sleepTime;
        return this;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println(getName() + ": Hello World!");
            try {
                sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println(getName() + ": Cannot sleep, cause interrupted");
                interrupt();
            }
        }
        System.out.println(getName() + " closed!");
    }
}
