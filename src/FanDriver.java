import javax.sound.midi.SysexMessage;
import java.io.InputStream;
import java.util.Scanner;

public class FanDriver
{
    public static void main(String[] args) {
        CeilingFan nFan = new CeilingFan();
        Scanner keyboard = new Scanner(System.in);
        String input="";

        System.out.println("Current fan: " + nFan.toString() + "\n");
        System.out.println("Press S to pull a cord which increases speed. When the speed reaches max @ 3, it will reset.\nPress R to pull a cord which changes the fans rotation. \nPress L to stop the program.");
        while(keyboard.hasNext()) {
            // upoper case
            input = keyboard.next().toUpperCase();
            //input = keyboard.next();
            if (input.equals("S")) {
                nFan.pullSpeedCord();
                System.out.println("ZOOM\n");
            } else if (input.equals("R")) {
                nFan.pullRevCord();
                System.out.println("REVERSE REVERSE\n");
            }else if(input.equals("L")) {
                break;
            } else{
                System.out.println("Please follow the requirements.");
            }
            System.out.println("Current fan: " + nFan.toString() + "\n");

            System.out.println("S to increase speed. \nR to switch rotation. \nL to stop program.");
        }
        System.out.println("Current fan: " + nFan.toString());
    }
}