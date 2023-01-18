package Unit6_Arrays.CourseEx;

public class StudentTester
{
    public static void main(String[] args)
    {
        Course per5 = new Course("Moon", "M359 Java", "A", 5);
        System.out.println(per5);

        Course per1 = new Course("Enk", "English", "A", 1);
        Course per2 = new Course("Vlaming", "Gym", "A", 2);
        Course per34a = new Course("Graba", "Biology", "A", 3);
        Course per4b = new Course("Lunch", 4);
        Course per6 = new Course("Hayes", "Calculus", "A", 6);
        Course per7 = new Course("Schmidt", "Social Science Survey", "A", 7);
        Course per8 = new Course("Thorstensen", "Advanced Topics Science", "A", 8);

        Course[] schedule = {per1, per2, per34a, per4b, per5, per6, per7, per8};
        Student st1 = new Student("Anya", schedule);

        System.out.println(st1);

        per1.setCurrentGrade("F");
        Student st2 = new Student("Josh", schedule);
        System.out.println(st2);
        System.out.println(st1);
    }


}
