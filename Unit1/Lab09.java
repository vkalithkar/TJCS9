//Vandana Kalithkar 9/26/2018
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
public class Lab09
{
   public static void putAllBeepers(Athlete arg)
   {
      while(arg.hasBeepers())
         arg.putBeeper();
   }
   public static void pickAllBeepers(Athlete arg)
   {
      while(arg.nextToABeeper())
         arg.pickBeeper();
   }  
   public static void main(String[] args)
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      
      Display.openWorld("maps/"+filename+".map");
      Display.setSize(17, 15);
      Display.setSpeed(10);
      
      Athlete al = new Athlete(1, 1, Display.EAST, 0);
      //Initial move 
      for(int k = 1; k <= 5; k++)
      { 
         al.move();
      }
      pickAllBeepers(al);
      al.move();
      putAllBeepers(al);
      al.turnAround();
      al.move();
      
      
      for(int y = 0; y < 4; y++)
      {
         if(!al.frontIsClear())
         {
            break;
         }
         else 
         {
            while(al.nextToABeeper())
            {
               pickAllBeepers(al);
               al.turnAround();
               al.move();
               putAllBeepers(al);
               al.turnAround();
               al.move();    
            } 
            for(int k = 1; k < 2; k++) 
            {
               while(!al.nextToABeeper())
               {
                  al.move();
                  while(al.nextToABeeper())
                  {
                     pickAllBeepers(al);
                     al.turnAround();
                     al.move();
                     putAllBeepers(al);
                     al.turnAround();
                     al.move();    
                  }
                  if(!al.frontIsClear())
                  {
                     break;
                  }
               }
            }
         }
      }  
   }
}