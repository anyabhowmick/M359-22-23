package Unit6_Arrays.CourseEx;

public class Student
{
    private String name;
    private Course[] myClasses;

    public Student(String nameX, Course[] myClassesX)
    {
        name = nameX;
        //sets array
        myClasses = new Course[8];
        //create
        for(int i = 0; i < 8; i++)
        {
            myClasses[i] = new Course(myClassesX[i].getTeacherName(),
                    myClassesX[i].getSubject(),
                    myClassesX[i].getCurrentGrade(),
                    myClassesX[i].getPeriod());
        }

    }


    public String toString()
    {
        String output = name + "\n";
        for(int i = 0; i < myClasses.length; i++)
        {
            output += myClasses[i].toString();
        }

        return output;
    }

}
