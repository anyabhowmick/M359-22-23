package Unit4_Iteration;
import java.util.Scanner;
public class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int guesses = 0;
        //System.out.println("Do you have a number to enter? (Y or N)");

        //String reply = input.nextLine();
        boolean isDone = false;
        int num = (int)(Math.random()*10) + 1;

        while (isDone == false)
        {
            System.out.println("pick a number 1-10");
            int theirGuess = input.nextInt();
            input.nextLine();
            if (theirGuess != num)
            {
                System.out.println("haha guess again");
                guesses++;
            }
            else
            {
                isDone = true;
                System.out.println("u got it after " + guesses + " attempts");
            }
        }





    }

}
