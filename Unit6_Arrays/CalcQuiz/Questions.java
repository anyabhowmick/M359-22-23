package CalcQuiz;


public class Questions
{
    private String question;
    private int points;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private String correctAnswer;
    private boolean usedBefore = false;


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


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isUsedBefore() {
        return usedBefore;
    }

    public void setUsedBefore(boolean usedBefore) {
        this.usedBefore = usedBefore;
    }

    /**
     * no parameters
     * souts the question and related answer choices
     * in the format that will be used in the driver
     */
    public String toString()
    {
        String output = question  + "\n" + choice1 + "\n" + choice2 + "\n" + choice3 + "\n" + choice4;
        return output;
    }
}