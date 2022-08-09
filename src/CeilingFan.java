import java.util.HashMap;
public class CeilingFan {

    private int speed;
    private boolean rev;
    private final HashMap<Integer, String> map = new HashMap<>();

    /** Constructor that creates a default fan */
    public CeilingFan() {
        this.speed=0;
        this.rev=false;
        CeilingFanHashMap();
    }

    private void CeilingFanHashMap(){
        map.put(0,"OFF");
        map.put(1,"SLOW");
        map.put(2,"MID");
        map.put(3,"FAST");
    }


    /** Non-standard mutator methods */

    /** Speed Cord */
    public void pullSpeedCord(){
        setSpeed((getSpeed()+1) % 4);
    }

    /** Rotation Cord */
    public void pullRevCord(){
        rev = !rev;
    }

    /** Accessor methods */

    /** Return Speed */
    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }
    /** Return Spin Direction */
    public String getRev(){
        String s = "Fan is not spinning";
        if(speed>0){
            if(rev){
                s = "COUNTER-CLOCKWISE";
            }else{
                s = "CLOCKWISE";
            }
        }
        return s;
    }

    /** Returns a string description for the fan */
    public String toString() {
        return "\nFan speed: " + map.get(getSpeed()) + "\nRotation Direction: " + getRev() ;
    }
}
