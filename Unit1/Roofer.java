//djkdjf

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Roofer extends Robot
 {
  public Roofer(int x, int y)
   {
     super(x, y, Display.SOUTH, 100);
   }
  
  
  public void turnAround()
   {
     turnLeft();
     turnLeft();
   }
  public void turnRight()
   {
     turnLeft();
     turnLeft();
     turnLeft();
   }
  
 }   