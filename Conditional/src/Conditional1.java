import java.util.Scanner;

public class Conditional1 
{

	public static void main(String[] args) 
	{	
	Scanner userInput=new Scanner(System.in);
    System.out.println("What is your favorite sport");
    String sport=userInput.nextLine();
   if (sport.equals("lacrosse"))
   {
	   System.out.println("Me too");
   }
   else if (sport.equals("football"))
   {
	   System.out.println("My favorite team is the chargers");
   }
   else if (sport.equals("none"))
   {
	   System.out.println("I just like all sports");
	   }
   else 
   {
	   System.out.println("Sports are fun");
   }
	}
	
}

	
