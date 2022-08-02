package Theread;

public class KronometrThread implements Runnable {
    private Thread THREAD;
    private String Thread_name;

    public KronometrThread(String _name) {
        this.Thread_name = _name;
    }


    @Override

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread" + this.Thread_name);
                Thread.sleep(1000);
            }
        } catch (Exception err) {
            System.out.println(err + "thread hatası");
        }
    }


    public void start() {
        if (THREAD == null) {
            THREAD = new Thread(this, this.Thread_name);
            THREAD.start();

        }
    }


}
