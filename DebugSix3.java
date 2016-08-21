import javax.swing.*;

/**
 * Created by tony on 21/08/2016.
 */
public class DebugSix3 {

    public static void main(String[] args){
        String userNumString;
        int userNum, val;
        final int MIN = 1;
        final int MAX = 20;

        userNumString = JOptionPane.showInputDialog(null,
                "Enter a number between " + MIN + " and " + MAX + " inclusive");
        userNum = Integer.parseInt(userNumString);

        while(userNum < MIN || userNum > MAX){
            userNumString = JOptionPane.showInputDialog(null,
                    "Number out of range" +
                            "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
                    userNum = Integer.parseInt(userNumString);
        }
        for(val = userNum; val > 0; --val) {

            System.out.print(val + "  ");

            for (int x = 0; x < 1000000000; ++x) {

                for (int y = 0; y < 10000000; ++y) {

                }
                // Adjust these numbers for faster or slower performance
            }
        }
        System.out.println("Blastoff!");
    }
}
