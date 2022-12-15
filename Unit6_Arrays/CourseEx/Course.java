package Unit6_Arrays.CourseEx;

public class Course
{
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    //constructors
    //full constructor
    public Course(String teacher, String subjectX, String grade, int periodX)
    {
        teacherName = teacher;
        subject = subjectX;
        currentGrade = grade;
        period = periodX;
    }



    //constructor for course without a teacher or grade
    public Course (String subjectX, int periodX)
    {
        teacherName = "N/A";
        subject = subjectX;
        period = periodX;
        currentGrade = "N/A";
    }

    //getters and setters
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    //toString that returns course data
    public String toString()
    {
        String output = "Period " + period;
        output += ": " + subject;
        output += " (" + teacherName;
        output += "); " + currentGrade + "\n";

        return output;
    }

}

