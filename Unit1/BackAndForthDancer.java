//Vandana Kalithkar 10/9/2018

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class BackAndForthDancer extends Dancer
{
   public BackAndForthDancer()
   {
      super(1, 6, Display.EAST, 0);
   }
   public BackAndForthDancer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void danceStep()
   { 
      move();
      turnLeft();
      turnLeft();
      move();
      turnLeft();
      turnLeft();
   }
}
