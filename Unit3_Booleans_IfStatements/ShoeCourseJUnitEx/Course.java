/*
package Unit3_Booleans_IfStatements.ShoeCourseJUnitEx;

public class Course
{
    String classTitle, teacherName;
    int numStudentsEnrolled;

    public Course(String classTitle, String teacherName, int numStudentsEnrolled)
    {
        this.classTitle = classTitle;
        this.teacherName = teacherName;
        this.numStudentsEnrolled = numStudentsEnrolled;
    }

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getNumStudentsEnrolled() {
        return numStudentsEnrolled;
    }

    public void setNumStudentsEnrolled(int numStudentsEnrolled) {
        this.numStudentsEnrolled = numStudentsEnrolled;
    }


    public boolean equals(Course other)
    {
        if (this.classTitle.equals(other.classTitle) && this.numStudentsEnrolled == other.numStudentsEnrolled)
        {
            return true;
        }
        else
            return false;
    }


    public int compareTo(Course other)
    {
        if (this.classTitle.compareTo(other.classTitle) < 0 || (this.classTitle.equals(other.classTitle) && this.numStudentsEnrolled < other.numStudentsEnrolled))
            return -1;
        else if (this.classTitle.equals(other.classTitle))
            return 0;
        else if (this.classTitle.compareTo(other.classTitle) > 0 || (this.classTitle.equals(other.classTitle) && this.numStudentsEnrolled > other.numStudentsEnrolled))
            return 1;
    }



}
*/