import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

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
  }
}
