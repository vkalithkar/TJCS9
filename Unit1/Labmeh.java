//Vandana Kalithkar jsgtkl

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

   public class Labmeh
  {  
      public static void main(String[] args)
     {
         Display.openWorld("maps/default.map");
         Display.setSize(8, 8);
         Display.setSpeed(5);
         
         Athlete ye = new Athlete();
         
         ye.move();
         ye.turnRight();    
         while(!ye.leftIsClear())
          {
            ye.turnRight();
            break;

          }    
     }
  }   