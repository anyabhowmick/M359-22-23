package CalcQuiz;
import java.io.File;
import java.io.FileNotFoundException;
public class TriviaDriver{
    public static void main(String[] args) throws FileNotFoundException {

        //setting up game
        TriviaGame thisGame = new TriviaGame(12);
        File calcQuizFile = new File("mathQuiz.txt");
        Questions[] newQuestionList = thisGame.readFile(calcQuizFile);
        thisGame.setQuestList(newQuestionList);

        thisGame.playGame();
    }



}