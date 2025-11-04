public class Person
{
    private int SSN;
    private String name;
    private int age;

    Person(int SSN, String name, int age)
    {
        this.SSN = SSN;
        this.name = name;
        this.age = age;
    } 

    void print()
    {
        System.out.printf("SSN: %d%n\tName: %s%n\tAge: %d%n", SSN, name, age);
    }

}
