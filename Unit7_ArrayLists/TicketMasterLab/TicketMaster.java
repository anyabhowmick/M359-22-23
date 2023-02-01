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

    public ArrayList<Show> getShowList() {
        return showList;
    }

    public void setShowList(ArrayList<Show> showList) {
        this.showList = showList;
    }

    //generates a suitable, reader-friendly String output
    public String toString()
    {
        String output = "Date\t\tPrice\t\t\t\tQty\t\t\t\tPerformer\t\t\t\t\t\tCity\n";
        output += "------------------------------------------------------------------------------------------------\n";
        for(int i = 0; i < showList.size(); i++)
        {
            output += showList.get(i).toString() + "\n";
        }

        return output;
    }

    public void loadFile(File myFile) throws FileNotFoundException {
        Scanner fileIn = new Scanner(myFile);
        ArrayList<Show> output = new ArrayList<Show>();
        while(fileIn.hasNextLine())
        {

            String performanceDate = fileIn.next();
            double cost = fileIn.nextDouble();

            int ticketQty = fileIn.nextInt();

            String temp = fileIn.nextLine();
            int index = temp.indexOf(",");
            String artist = temp.substring(1, index);
            String location = temp.substring(index+2);

            Show newShow = new Show(performanceDate, cost, ticketQty, artist, location);
            output.add(newShow);

        }

        showList = output;
    }


    public void searchCities(Scanner input)
    {
        ArrayList<Show> inCityList = new ArrayList<Show>();
        System.out.println("What city would you like to search for?");
        input.nextLine();
        String userCity = input.nextLine();

        for(int i = 0; i < showList.size(); i++)
        {
            if(userCity.equalsIgnoreCase(showList.get(i).getCity()))
            {
                inCityList.add(showList.get(i));
            }
        }

        if(inCityList.size() == 0)
        {
            System.out.println("There are no shows in " + userCity + ".\n");
        }
        else {
            String output = output = "Date\t\tPrice\tQty\t\tPerformer\t\t\t\tCity\n";
            output += "------------------------------------------------------------------\n";
            for(int i = 0; i < inCityList.size(); i++)
            {
                output += inCityList.get(i).toString() + "\n";
            }
            System.out.println(output);

        }
    }

    public String sortPerformer(int choice)
    {
        ArrayList<Show> sortedList = showList;
         for(int i = 0; i < sortedList.size(); i++)
         {
             int index = i;
             for(int j = i + 1; j < sortedList.size(); j++)
             {
                 if(choice == 3 && sortedList.get(index).getArtist().compareTo(sortedList.get(j).getArtist()) <= 0) //if alphabetical order a
                 {
                     index = j;
                 }
                 else if(choice == 2 && sortedList.get(index).getArtist().compareTo(sortedList.get(j).getArtist()) > 0) //revAlphaOrder
                 {
                     index = j;
                 }
             }

             Show temp = sortedList.get(i);
             sortedList.set(i, sortedList.get(index));
             sortedList.set(index, temp);
         }

        String output = "Date\t\tPrice\tQty\t\tPerformer\t\t\t\tCity\n";
        output += "------------------------------------------------------------------\n";
        for(int i = 0; i < sortedList.size(); i++)
        {
            output += sortedList.get(i).toString() + "\n";
        }

        return output;
    }

    public String sortCost(int choice)
    {
        ArrayList<Show> sortedList = showList;

        for(int i = 0; i < sortedList.size(); i++)
        {
            double curVal = sortedList.get(i).getPrice(); //value being compared (cost)

            int pos = i; //index

            if(choice == 4)
            {
                while(pos > 0 && sortedList.get(pos-1).getPrice() > curVal) //as long as theres no out of bounds
                    // exception and the show before has a greater price (low to high)
                {
                    sortedList.set(pos, sortedList.get(pos-1));
                    //replace the show
                    pos--;
                }
            }
            else {
                while(pos > 0 && sortedList.get(pos-1).getPrice() < curVal) //as long as theres no out of bounds
                // exception and the show before has a lower price (high to low)
                {
                    sortedList.set(pos, sortedList.get(pos-1));
                    pos--;
                }
            }

            sortedList.set(pos, sortedList.get(i));

        }

        String output = "Date\t\tPrice\tQty\t\tPerformer\t\t\t\tCity\n";
        output += "------------------------------------------------------------------\n";
        for(int i = 0; i < sortedList.size(); i++)
        {
            output += sortedList.get(i).toString() + "\n";
        }

        return output;
    }

}