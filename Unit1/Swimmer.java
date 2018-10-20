//Vandana Kalithkar 10/5/2018

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Swimmer extends Robot implements Runnable
{
   public Swimmer(int x)
   {
      super(x, 1, Display.NORTH, 0);
   }
   public void run() //not swim
   {
      for(int x = 1; x <= 20; x++)
      {
         for(int k = 1; k <= 8; k++)
         {
            move();
         }
         turnLeft();
         turnLeft();
      }
   }
}
