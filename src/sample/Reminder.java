package sample;

import java.util.Timer;
import java.util.TimerTask;

import static sample.Controller.yes;

/**
 * Created by benshorten on 03/09/2018.
 */
public class Reminder {
    Timer timer;
    static int secremnd, seconds;


    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
        secremnd = seconds*1000;
    }

    class RemindTask extends TimerTask {
        @Override
        public void run() {

            timer.cancel();
            yes=true;
            System.out.print("Finito");


        }
    }

}