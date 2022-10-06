package Unit2_Objects;

public class Student
{
    // instance variables
    private String name;
    // 'String' is a java-provided class
    private int gradeLevel;
    private double gpa;

    // defining student to contain these variables, it's CLASSified by these three

    // constructor:
    public Student(String stuName, int stuGradeLevel, double stuGPA)
    {
        name = stuName;
        gradeLevel = stuGradeLevel;
        gpa = stuGPA;
    }

    public Student(String stuName)
    {
        name = stuName;
        gradeLevel = 9;
        gpa = -1;
    }

    // methods

    public void printSummary()
    {
        System.out.println("Name:" + name);
        System.out.println("Grade:" + gradeLevel);
        System.out.println("GPA:" + gpa);
    }

    public void setGrade(int newGradeLevel)
    {
        gradeLevel = newGradeLevel;
    }

    public int getGrade()
    {
        return gradeLevel;
    }
}
