package Unit6_Arrays.CalculusQuiz;

public class Questions
{
    private String question;
    private int points;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private String correctAnswer;


    //constructor
    public Questions(String q, int pointVal, String ans1, String ans2,
                    String ans3, String ans4, String correctAns)
    {
        question = q;
        points = pointVal;
        choice1 = ans1;
        choice2 = ans2;
        choice3 = ans3;
        choice4 = ans4;
        correctAnswer = correctAns;
    }


    //getters and setters


    /**
     * no parameters
     * souts the question and related answer choices
     */
    public String toString()
    {
        String output = question  + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
        return output;
    }
}
