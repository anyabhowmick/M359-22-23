package Unit6_Arrays.CourseEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReadingEx
{
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("studentScheduleData.txt");
        Scanner fileIn = new Scanner(myFile);

        int numStudents = fileIn.nextInt();               //first line
        fileIn.nextLine();


        Student[] myStudents = new Student[numStudents];

        for(int j = 0; j < numStudents; j++)
        {
            String studentName = fileIn.nextLine();           //student name
            Course[] stuSched = new Course[8];

            for (int i = 0; i < 8; i++)
            {
                String teacherName = fileIn.nextLine();
                String className = fileIn.nextLine();
                String letterGrade = fileIn.nextLine();
                int period = fileIn.nextInt();
                if(fileIn.hasNextLine())
                {
                    fileIn.nextLine();
                }


                Course myCourse = new Course(teacherName, className, letterGrade, period);
                stuSched[i] = myCourse;
                //have name, schedule
            }

            Student curStudent = new Student(studentName, stuSched);
            myStudents[j] = curStudent;

            for (Student s : myStudents)
            {
                System.out.println(s);
            }
        }



        /*
        System.out.println(teacherName);
        System.out.println(className);
        System.out.println(letterGrade);
        System.out.println(period);
        */


    }

}

