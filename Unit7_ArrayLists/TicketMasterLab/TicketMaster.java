package Unit7_ArrayLists.TicketMasterLab;
import Unit6_Arrays.CalculusQuiz.Questions;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMaster
{
    ArrayList<Show> showList = new ArrayList<Show>();

    //constructor
    public TicketMaster(ArrayList<Show> showListX)
    {
        showList = showListX;
    }

    public TicketMaster()
    {

    }

    //generates a suitable, reader-friendly String output
    public String toString()
    {
        String output = "Date\tPrice\tQty\tPerformer\tCity\n";
        output += "------------------------------------------------------------------\n";
        for(int i = 0; i < showList.size(); i++)
        {
            output += showList.get(i).toString() + "\n";
        }

        return output;
    }

    public void loadFile(File myFile) throws FileNotFoundException {
        Scanner fileIn = new Scanner(myFile);
        boolean isDone = false;
        int index = 0;
        while(!isDone)
        {
            String performanceDate = inFile.next();
            int
        }

    }

}

