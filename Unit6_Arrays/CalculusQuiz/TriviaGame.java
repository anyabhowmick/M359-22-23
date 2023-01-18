package Unit6_Arrays.CalculusQuiz;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriviaGame
{
    private Questions[] questList;
    private int numRight;
    private int totalQs;
    private int pointCount;

    //constructor
    public TriviaGame(Questions[] questionList, int totalQuestions)
    {
        questList = questionList;
        totalQs = totalQuestions;
    }

    public TriviaGame(int totalQuestions)
    {
        totalQs = totalQuestions;
        questList = new Questions[totalQuestions];
    }


    //setters and getters
    public Questions[] getQuestList() {
        return questList;
    }

    public void setQuestList(Questions[] questList) {
        this.questList = questList;
    }

    public int getNumRight() {
        return numRight;
    }

    public void setNumRight(int numRight) {
        this.numRight = numRight;
    }

    public int getTotalQs() {
        return totalQs;
    }

    public void setTotalQs(int totalQs) {
        this.totalQs = totalQs;
    }

    public int getPointCount() {
        return pointCount;
    }

    public void setPointCount(int pointCount) {
        this.pointCount = pointCount;
    }


    public Questions[] readFile(File myFile) throws FileNotFoundException {
        Scanner fileIn = new Scanner(myFile);
        Questions[] questionList = new Questions[totalQs];

        for(int i = 0; i < totalQs; i++)
        {
            String q1 = fileIn.nextLine();
            int pointValue = fileIn.nextInt();
            fileIn.nextLine();
            String ans1 = fileIn.nextLine();
            String ans2 = fileIn.nextLine();
            String ans3 = fileIn.nextLine();
            String ans4 = fileIn.nextLine();
            String correctChoice = fileIn.nextLine();

            Questions question = new Questions (q1, pointValue, ans1,   //sets new question, complete w point value
                ans2, ans3, ans4, correctChoice);                       //and the correct answer choice

            questionList[i] = question;
        }

        return questList;

    }

    public String toString()
    {
        String output = "Total Questions: " + totalQs;
        output += "\n Questions: \n";
        for(int i = 0; i < totalQs; i++)
        {
            output += questList[i].toString();
        }
        return output;
    }
}
