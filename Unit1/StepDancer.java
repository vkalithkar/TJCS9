//Vandana Kalithkar 10/9/2018

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class StepDancer extends Dancer
{
   public StepDancer()
   {
      super(6, 1, Display.EAST, 0);
   }
   public StepDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void danceStep()
   { 
      move();
      move();
      turnLeft();
      turnLeft();
   }
}
