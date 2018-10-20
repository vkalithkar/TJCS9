//Vandana Kalithkar 9/14/2018
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05EXT
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/first.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
            
      Robot algo = new Robot(1, 1, Display.NORTH, 3); 
            
      algo.putBeeper();
   }
}