package CalcQuiz;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriviaGame
{
    private int totalQs;
    private Questions[] questList;
    private int numRight;
    private int pointCount;
    private int questionsAnswered;
    private int correctStreak;


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

    public int getQuestionsAnswered() {
        return questionsAnswered;
    }

    public void setQuestionsAnswered(int questionsAnswered) {
        this.questionsAnswered = questionsAnswered;
    }

    public int getCorrectStreak() {
        return correctStreak;
    }

    public void setCorrectStreak(int correctStreak) {
        this.correctStreak = correctStreak;
    }

    /**
     *
     * @param myFile takes in a file
     * @return returns an array of questions from the file
     * @throws FileNotFoundException
     */
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

        return questionList;

    }

    /**
     * prints the questions in proper format
     * @return
     */

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

    /**
     * mainly used to play the game by printing instructions and using a
     * while loop and helper functions to keep the game going if the user wants
     */

    public void playGame()
    {

        //intro + instructions
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hi " + name);
        System.out.println("You will be given a set of questions on integrals, \nderivatives, and the unit circle. " +
                "Please answer \nwith only the letter choice (e.g. 'a') and no \npunctuation. " +
                "Case does not matter. \nGood luck! ");

        boolean gameIsDone = false;

        while(!gameIsDone)
        {
            Questions asking = pickQuestion(questList); //question that we are currently asking
            System.out.println(asking);

            String userAnswer = input.nextLine().toLowerCase();

            if(userAnswer.equals(asking.getCorrectAnswer())) //if answer is correct
            {
                //update total points, numRight, correctStreak
                pointCount += asking.getPoints();
                numRight++;
                correctStreak++;

                //SOUT stats
                System.out.println("Congrats! You got it right :)");
                printStats();
            }
            if (!(userAnswer.equals(asking.getCorrectAnswer())))
            {
                System.out.println("Sorry, you got it wrong :(");
                correctStreak = 0;
                printStats();
            }

            System.out.println("Keep playing? (Y/N");
            String keepPlaying = input.nextLine();

            if(!(keepPlaying.equalsIgnoreCase("y")))
            {
                gameIsDone = true;
            }
        }

        System.out.println("You've completed the quiz! Here's how you did:");
        printStats();

    }

    /**
     * returns a question that has not been used before
     * while also classifying that question as has been used before
     * @param qList takes in the array of questions
     * @return returns non-repeated question
     */
    public Questions pickQuestion(Questions qList[])
    {
        boolean isDone = false;
        int qsNum = (int)(Math.random() * totalQs);

        //picks question
        while (!isDone)
        {


            if(qList[qsNum].isUsedBefore()) //if the question HAS been asked before
            {
                qsNum = (int)(Math.random() * totalQs);  //pick new number
            }

            else //otherwise, set usedBefore to true, return the question
            {
                qList[qsNum].setUsedBefore(true);

                isDone = true;
            }

            return qList[qsNum];
        }
        return qList[qsNum];
    }

    /**
     * prints the stats
     */
    public void printStats()
    {
        System.out.println("Here are your stats:");
        System.out.println("\t Questions Answered: " + questionsAnswered);
        System.out.println("\t Questions Left: " + (totalQs - questionsAnswered));
        System.out.println("\t Total Correct: " + numRight);
        System.out.println("\t Correct Streak: " + correctStreak);
        System.out.println("\t Total Points Earned: " + pointCount);

    }
}