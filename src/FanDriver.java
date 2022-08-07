import java.io.InputStream;
import java.util.Scanner;

public class FanDriver
{
    public static void main(String[] args) {
        CeilingFan nFan = new CeilingFan();

        // input
        Scanner keyboard = new Scanner(System.in);
        String input="";
        System.out.println("Press S to pull a cord which increases speed. When the speed reaches max @ 3, it will reset.\nPress R to pull a cord which changes the fans rotation. \n Press L to stop the program.");

        while(keyboard.hasNext()) {
            input = keyboard.next();
            if (input.equals("s") || input.equals("S")) {
                nFan.pullSpeedCord();
                System.out.println("ZOOM\n");
            } else if (input.equals("r") || input.equals("R")) {
                nFan.pullRevCord();
                System.out.println("REVERSE REVERSE\n");
            }else if(input.equals("l" )|| input.equals("L")){
                break;
            }
            else{
                System.out.println("Please follow the requirements.");
            }
            System.out.println("Current fan: " + nFan.toString() + "\n");
            System.out.println("Press S to pull a cord which increases speed. When the speed reaches max @ 3, it will reset.\nPress R to pull a cord which changes the fans rotation. \n Press L to stop the program.");
        }
        System.out.println("Current fan: " + nFan.toString());
    }
}