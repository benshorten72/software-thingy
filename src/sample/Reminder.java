package sample;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by benshorten on 03/09/2018.
 */
public class Reminder {
    Timer timer;
    static int seconds;
    static String Nameoftask;

    public Reminder(int seconds) {

        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Reminder for: " + Nameoftask);
            timer.cancel();
        }
    }

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter name of School Reminder: ");
        Nameoftask = reader.next();

        System.out.print("When?");
        seconds= reader.nextInt();
         if (seconds > 1){new Reminder(seconds); System.out.println("Reminder set for " + seconds + " seconds."); }

    }
}