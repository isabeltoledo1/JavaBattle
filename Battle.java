import java.util.*;
public class Battle{


public static void main (String[] args){

Scanner in = new Scanner (System.in);
User cpu = new User (); 
User usr = new User (); 
Random r = new Random ();
String play = "";

 

 do{ 
   System.out.println ("Your HP: " + usr.hp);
   System.out.println ("Other HP: " + cpu.hp);
   System.out.println ("Press h to hit, q to quit: ");
   play = in.nextLine ();
   
 
   //usr strength accessor
   usr.setStrength(r.nextInt(15));
   System.out.println("Your Strength: " + usr.getStrength());
 
   //cpu strength accessor
   cpu.setStrength(r.nextInt(15));
   System.out.println("Their Strength: " + cpu.getStrength());
 

 
   if (cpu.getStrength() > usr.getStrength())
   {
   usr.setDamage (10);
   }

   else if (usr.getStrength() > cpu.getStrength())
   {
   cpu.setDamage (10);
   }
   else System.out.println ("You've tied");
 
   //System.out.println ("Press h to hit, q to quit: ");
  // play = in.nextLine ();
   
 }while (!play.equalsIgnoreCase ("q"));
 
 
 
 
}
}