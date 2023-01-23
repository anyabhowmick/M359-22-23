package TicketMasterLab;

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
        String output = "Date\t\tPrice\tQty\t\tPerformer\t\t\t\tCity\n";
        output += "------------------------------------------------------------------\n";
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
            String artist = temp.substring(0, index);
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
        TicketMaster tempTickList = new TicketMaster(inCityList);

        if(inCityList.size() == 0)
        {
            System.out.println("There are no shows in " + userCity + ".\n");
        }
        else
            System.out.println(tempTickList);
    }

}