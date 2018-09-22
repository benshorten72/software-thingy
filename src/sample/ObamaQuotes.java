package sample;

import java.util.Random;

/**
 * Created by Ayushi on Fri, 21 Sep 2018.
 */
public class ObamaQuotes {
    public static void main(String[] args) {
        String[] qu = {"Yes, we can",
                "Your voice can change the world",
                "Money is not the only answer, but it makes a difference",
                "Why can't I just eat my waffle?",
                "Eat the spaghetti to forgetti your regretti"};
        int n = qu.length;
        Random rn = new Random();
        int randomNum =  rn.nextInt(n);
        System.out.println("\"" + qu[randomNum] + "!\" - Barack Obama");
    }
}