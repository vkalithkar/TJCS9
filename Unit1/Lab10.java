//Vandana Kalithkar 10/3/2018

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
public class Lab10
{
   public static void followWallsRight(Athlete arg)
   { 
      while(arg.frontIsClear() && !arg.rightIsClear())
      {
         arg.move();
      }
      while(!arg.frontIsClear() && !arg.rightIsClear())
      {
         arg.turnLeft();
         if(arg.frontIsClear())
         {
            arg.move();
         }
         else 
         {
            arg.turnLeft();
            arg.move();
         }   
         while(!arg.frontIsClear() && arg.rightIsClear())
         {
            arg.turnRight();
            arg.move();
         }
         while(arg.frontIsClear() && arg.rightIsClear())
         {
            arg.turnRight();
            arg.move();
         }
      }
      while(arg.frontIsClear() && arg.rightIsClear())
      {
         arg.turnRight();
         arg.move();
      }
   }
 
  
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
   
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      
      Athlete thomas = new Athlete(1, 1, Display.NORTH, Display.INFINITY);     
      
      while(!thomas.nextToABeeper())
      {
         while(thomas.rightIsClear() && thomas.frontIsClear())
         {
            thomas.move();        
         }  
         while(thomas.rightIsClear() && !thomas.frontIsClear())
         {
            thomas.turnRight();
            thomas.move();         
         }
         followWallsRight(thomas);
      }
   }
}

