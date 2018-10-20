//Vandana Kalithkar 10/9/2018

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Waltzer extends Dancer
{
   public Waltzer()
   {
      super(3, 3, Display.EAST, 0);
   }
   public Waltzer(int x, int y, int dir, int beep)
   {
      super(x, y, dir, beep);
   }
   public void danceStep()
   { 
      move();
      turnLeft();
      move();
      turnLeft();
      turnLeft();
      turnLeft();
      move();
      turnLeft();
      turnLeft();
      move();
      turnLeft();
      move();
      turnLeft();
      turnLeft();
      turnLeft();
      move();
      turnLeft();
      turnLeft();
      
   }
}
