//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
//version 4.22.2003

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import java.io.*;				//lets us prepare for an IOException from getting input from the keyboard
import java.util.*;
public class Lab07Grader
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);//this object allows us to get input from the keyboard
      String filename,type;						//these will store the name of the map to load and the name of the climber type to use
      int avenue;										//this will store the avenue to start on
      String[] worlds = {"mountain1", "mountain2", "mountain3", "step1", "step2","step3",  "hill1", "hill2", "hill3"};
      Display.setSize(17, 15);
      Display.setSpeed(10);
   
      for (String world:worlds)
      {
         System.out.println(world + " " + world.substring(0,world.length()-1) + " " + world.substring(0,world.length()-1).equals("hill"));

         if(world.substring(0, world.length()-1).equals("mountain")) {
            type = "Climber";
            avenue=8;
         }
            else if(world.substring(0, world.length()-1).equals("hill")) {
               type = "HillClimber";
               avenue=10;
            }
         else { 
            type = "StepClimber";
            avenue=12;
         }
         testDisplay(world,type,avenue);
//         Display.reset();
      }
   }
   public static void testDisplay(String filename,String type,int avenue)
   {
      Display.openWorld("maps/" + filename + ".map");
   
      if(type.equals("Climber"))
      {
         Mountain.explore( new Climber(avenue) );
         System.out.println("Climber Done.");
      }
      else 
         if(type.equals("HillClimber"))
         {
            Mountain.explore( new HillClimber(avenue) );
            System.out.println("HillClimber Done.");
         }
         else 
            if(type.equals("StepClimber"))
            {
               Mountain.explore( new StepClimber(avenue) );
               System.out.println("StepClimber Done.");
            }
            else
            {
               System.out.println("Invalid robot type.");
            }
   }
}