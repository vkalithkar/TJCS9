//Vandana Kalithkar 9/28/2018

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class SteepleChaseRacer extends Racer
{
   public SteepleChaseRacer(int y)
   {
      super(y);
   }
   public void jumpRight()
   {
      //System.out.println("Hello World");
      turnLeft();
      while(!rightIsClear())
      {  
         move();
      }  
      turnRight();
      move();
      while(!rightIsClear())
      {
         move();
      }
      turnRight();
      while(frontIsClear())
      { 
         move();
      }     
      turnLeft();
   }                 
}   
  

