import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    /*
    System.out.println("Enter the person's SSN");
    int SSN = scan.nextInt();

    System.out.println("Enter the person's first name");
    String firstName = scan.next();

    System.out.println("Enter the person's last name");
    String name = firstName + " " + scan.next();

    System.out.println("Enter the person's age");
    int age = scan.nextInt();

    Person person1 = new Person(SSN, name, age);
    person1.print();
    */

    System.out.println("Maximum oven temperature:");
    int maxTemp = scan.nextInt();

    System.out.println("Starting temperature of the oven:");
    int startingTemp = scan.nextInt();

    Oven oven1 = new Oven(maxTemp, startingTemp);

    System.out.println(oven1.toString());

    System.out.println("To preheat the oven enter 'p', to turn the oven off enter 'o', to restart enter 'r', to quit enter 'q'");
    String options = nextLine();

    while(oven1.IsOn())
    {
      if(option.equals("p"))
      {
        System.out.println("Enter the temperature to preheat the oven to:");
        int tempPreheat = scan.nextInt();

        oven1.PreHeat(tempPreheat);
        System.out.printf("Current tempurature of the oven is now %d%n%n", oven1.getCurrentTemp());
      }
      else if(option.equals("o"))
      {
        System.out.println("Turning the oven off.");
        oven1.TurnOff();
      }
      else if (restart)
      {

      }

      System.out.println(oven1.toString());

    }

    

    
  
    System.out.println(oven1.toString());
  }
}
