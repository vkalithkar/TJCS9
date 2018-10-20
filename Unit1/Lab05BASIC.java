//Vandana Kalithkar 9/14/2018
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

   public class Lab05BASIC
  {
      public static void main(String[] args)
     {
         Display.openWorld("maps/shuttle.map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
         
         Racer alo = new Racer(1); 
         
         alo.shuttle(2, 7);
         
    
     }
  }