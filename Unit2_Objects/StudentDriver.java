package Unit2_Objects;

public class StudentDriver
{
    public static void main(String[] args)
    {
        System.out.println("eh");
        Student s1 = new Student("Mike", 11, 3.35);

        s1.setGrade(12);
        s1.printSummary();

        System.out.println(s1.getGrade());
    }
}
