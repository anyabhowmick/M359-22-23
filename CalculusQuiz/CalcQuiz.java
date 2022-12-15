package Unit6_Arrays.CalculusQuiz;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class CalcQuiz
{
    public static void main(String[] args) throws FileNotFoundException {
        /**Scanner input = new Scanner(System.in);
        File myFile = new File("studentScheduleData.txt");
        */

        TriviaGame thisGame = new TriviaGame(12);
        File calcQuizFile = new File("CalculusQuiz.txt");
        Questions[] newQuestionList = thisGame.readFile(calcQuizFile);
        thisGame.setQuestList(newQuestionList);
        playGame(thisGame);

    }

    public static void playGame(TriviaGame newGame)
    {

        //intro/instructions
        Scanner input = new Scanner(System.in);
        //readFile(myFile);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Hi " + name);
        System.out.println("You will be given a set of questions on integrals, \nderivatives, and the unit circle. " +
                "Please answer \nwith only the letter choice (e.g. 'a') and no \npunctuation. " +
                "Case does not matter. \nGood luck! ");
        
    }



}
