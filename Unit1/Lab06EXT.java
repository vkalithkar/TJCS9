//Vandana Kalithkar 9/14/2018
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
public class Lab06EXT
{
   public static void main(String[] args) 
   {
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("maps/" + filename + ".map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
   
      task_01(); //go to the end of the row of beepers
      task_02(); //go to the beeper
      task_03(); //go to the wall
      task_04(); //go to the wall, pick up all the beepers (max one per pile)
      task_05(); //go to the wall, pick up all the beepers
      task_06(); //go to the end of the row of beepers, there is one gap
   }
   public static void task_01()	
   { //go to the end of the row of beepers
      Robot temp = new Robot(1, 1, Display.EAST, 0);
      
      while(temp.nextToABeeper())
         temp.move();
   }
   public static void task_02()	
   { //go to the beeper
      Robot temp = new Robot(1, 2, Display.EAST, 0);
      
      while(!temp.nextToABeeper())
         temp.move();
   }
   public static void task_03()	
   { //go to the wall
      Robot temp = new Robot(1, 3, Display.EAST, 0);
      
      while (temp.frontIsClear())
         temp.move();
   }
   public static void task_04()	
   { //go to the wall, picking up the single beepers 
      Robot temp = new Robot(1, 4, Display.EAST, 0);
      
      while(temp.frontIsClear())
      { 
         if(temp.nextToABeeper())
         { 
            temp.pickBeeper();
         }
         temp.move();
      }
   }
   public static void task_05()	
   { //go to the wall, picking up the piles of beepers
      Robot temp = new Robot(1, 5, Display.EAST, 0);
      
      while(temp.frontIsClear())
      {
         while(temp.nextToABeeper())
         {
            temp.pickBeeper();
         }
         temp.move(); 
      }
      while(temp.nextToABeeper())
      {  
         temp.pickBeeper();
      }       
   }
   public static void task_06()
   { //go to the end of the row of beepers, there is one gap
      Robot temp = new Robot(1, 6, Display.EAST, 0);
      temp.move();
      
      while(temp.nextToABeeper())
      {
         temp.move();
      }
      temp.move();  
      while(temp.nextToABeeper())
      {
         temp.move();
      }     
   }
   public static void task_07()
   { //go to the beeper or the wall. Count and report the number of steps you took.
      Robot temp = new Robot(1, 7, Display.EAST, 0);
      int count = 0;
      while(!temp.nextToABeeper() || temp.frontIsClear())
      { 
         temp.move();          
      }
      System.out.println("Count is "+ count);  
   }
   public static void task_08()
   { //go until you are next to another robot, then put all your beepers down.
      Robot temp = new Robot(1, 8, Display.EAST, 0);
      Robot mannequin = new Robot(4, 8, Display.EAST, 0);
           
   }
   public static void task_09()
   { //put down 5 different piles with 4 beepers in each. Use definite loops.
      Robot temp = new Robot(1, 9, Display.EAST, 0);
              
   }
   public static void task_10()
   { //fill in gaps with a beeper. Stop when you reach a wall.
      Robot temp = new Robot(1, 10, Display.EAST, 0);
           
   }
   public static void task_11()
   { //while there is a wall to your right, put down one beeper at each step.
      Robot temp = new Robot(1, 11, Display.EAST, 0);
              
   }  
   public static void task_12()
   { //go until there is a wall to your right and you are standing on a beeper.
      Robot temp = new Robot(1, 12, Display.EAST, 0);
              
   }   
}
