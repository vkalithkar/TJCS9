//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
//version 4.16.2003
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import java.io.*;				//lets us prepare for an IOException from getting input from the keyboard
import java.util.*;
public class Lab08Grader
{
   public static void race(Racer arg)
   {
      while(!arg.nextToABeeper())
      {
         if(arg.frontIsClear())
         {
            arg.move();
         }
         else
         {
            arg.jumpRight();
         }
      }
   }
   public static void main(String[] args) 
   {
      String type="";   
      String[] worlds= {	"hurdle1", "hurdle2", "hurdle3", "steeple1", "steeple2","steeple3",  "boxtop1", "boxtop2", "boxtop3"};
      
      Display.setSpeed(10);
   
      for (String world:worlds)
      {
         
         if(world.substring(0,world.length()-1).equals("hurdle"))
         {
            type = "Racer";
         }
         else if(world.substring(0,world.length()-1).equals("steeple"))
         {
            type = "SteepleChaseRacer";
         }
         else
         { 
            type = "BoxTopRacer";
         }
         
         testWorld("maps/"+world+".map",type);
         //Display.reset();
      
      }
   }
   
   public static void testWorld(String filename,String type)
   {
      Display.openWorld(filename);
      Display.setSize(18, 16);
      if(type.equals("Racer"))
      {
         race( new Racer(1) );
      }
      else 
         if(type.equals("SteepleChaseRacer"))
         {
            race( new SteepleChaseRacer(1) );
         }
         else 
            if(type.equals("BoxTopRacer"))
            {
               race( new BoxTopRacer(1) );
            }
            else
            {
               System.out.println("Invalid robot type.");
            }
   }
}