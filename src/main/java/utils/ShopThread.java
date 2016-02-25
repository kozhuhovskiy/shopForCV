package utils;

/**
 * Created by Kirill on 24.02.2016.
 */
public class ShopThread extends Thread {

    private int delay;
    private String title;

    public ShopThread(int delay, String title){

        this.delay = delay;
        this.title = title;
    }

    public void run(){



        for (int i = 0; i < 3 ; i++) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.printf( title + " FINISH");
    }

}
