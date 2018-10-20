//Vandana Kalithkar 9/5/2018

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

   public class Lab03
  {  
      public static void main(String[] args)
     {
         Display.openWorld("maps/mountain.map");
         Display.setSize(16, 16);
         Display.setSpeed(10);
         
         Climber mally = new Climber(8);
         Climber ed = new Climber(8);
         
         mally.putBeeper();
         mally.turnRight();
         mally.move();
         mally.climbUpRight();
         ed.turnRight();
         ed.move();
         ed.climbUpRight();
         mally.climbUpRight();
         ed.climbUpRight();
         mally.climbUpRight();
         ed.climbUpRight();
         mally.climbDownRight();
         ed.climbDownRight();
         ed.move();
         ed.turnRight();
         ed.move();
         ed.move();
         mally.climbDownRight();
         ed.pickBeeper();
         mally.turnLeft();
         ed.turnRight();
         ed.turnRight();
         mally.climbUpLeft();      
         ed.climbUpLeft();
         mally.climbUpLeft();
         ed.climbUpLeft();
         mally.climbDownLeft();
         ed.climbDownLeft();
         mally.climbDownLeft();
         ed.climbDownLeft();
         mally.climbDownLeft();
         ed.climbDownLeft();
         ed.turnLeft();
         ed.move();
         ed.putBeeper();
         mally.turnLeft();
         mally.move();
         ed.move();
         mally.move();
    }
  }   