import java.util.Scanner;

public class Ifelse
{
  public static void main(String arg[])
  {
    System.out.print("Enter Your age: ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt(); 

    if(age > 18)
    {
      System.out.println("Your eligible for Voting.");
    }
    else if(age<18)
    {
       System.out.println("Your Not eligible for Voting.");
    }
    else
    {
       System.out.println("Voting...");
    }
  }
}