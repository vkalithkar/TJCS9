//Vandana Kalithkar 10/11/2018

public class Lab15
{
   public static void main(String[] args)
   {
      StepDancer cal =  new StepDancer(); 
      Waltzer rose = new Waltzer();
      BackAndForthDancer bad = new BackAndForthDancer();
      
      Thread t1 = new Thread(cal);
      Thread t2 = new Thread(rose);
      Thread t3 = new Thread(bad);
      
      t1.start();
      t2.start();
      t3.start();
     
   }
}
