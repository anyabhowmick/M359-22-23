package Unit7_ArrayLists.TicketMasterLab;
import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;

public class TicketMasterDriver
{
    final static int citySearch = 1;
    final static int alphaOrder = 2;
    final static int revAlphaOrder = 3;
    final static int lowHigh = 4;
    final static int highLow = 5;
    final static int quitP = 6;


    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster ticketM1 = new TicketMaster();
        File myFile = new File("showData.txt");
        ticketM1.loadFile(myFile);
        System.out.println(ticketM1);

        //System.out.println(" welcome message \n instructions/options \n\n\n");
        runTicketMaster(ticketM1);

    }

    /**
     * calls the validateInput() function to ensure the user picks a valid choice,
     * calls sort variables & performs them as the user desires
     * @param tickets takes in ticketmaster var to use its data & sort the way the user wants
     */
    public static void runTicketMaster(TicketMaster tickets)
    {
        Scanner input = new Scanner(System.in); //keep scanner here, pass into TM for file read
        boolean isDone = false;
        while(!isDone)
        {
            System.out.println("1. Search by City \n2. Sort by Performer (A-Z) \n3. Sort by Performer(Z-A) \n" +
                    "4. Sort by Price (low to high) \n5. Sort by Price (high tp low) \n6. Quit\n");

            int choice = validateInput(input); //after validating the input, do the actual requests

            if(choice == citySearch)
            {
                tickets.searchCities(input);
            }
            else if (choice == quitP) {
                System.out.println("Thank you for using TicketMaster!");
                isDone = true;

            }
            else if(choice == alphaOrder || choice == revAlphaOrder)
            {
                System.out.println(tickets.sortPerformer(choice));
            }
            else if(choice == lowHigh || choice == highLow)
            {
                System.out.println(tickets.sortCost(choice));
            }
        }
    }

    /**
     *
     * @param input takes in a scanner parameter to get user's input repeatedly
     * @return returns an int btwn 1&6 to represent the different choices in the menu
     */
    public static int validateInput(Scanner input)
    {
        boolean tryAgain = true;
        int userResponse = 0;

        //makes sure the input is an integer between 1 and 6
        while(tryAgain)
        {
            //try-catch makes sure input is an int
            try {

                //if its an int...
                System.out.println("Enter a number between 1 and 6");
                userResponse = input.nextInt();

                //... then make sure its between 1-6
                if(userResponse > 6 || userResponse < 1)
                {
                    System.out.println("Invalid entry. You must enter an integer between 1 and 6");
                    userResponse = input.nextInt();
                }
                else {
                    //return userResponse;
                    tryAgain = false;
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid entry. You must enter an integer");
                input.nextLine();
            }
        }
        return userResponse;
    }


}