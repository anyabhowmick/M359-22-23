package Unit7_ArrayLists.TicketMasterLab;

import java.util.ArrayList;

public class Show
{
    public String date;
    public double price;
    public int numTicket;
    public String artist;
    public String city;

    //constructor
    public Show (String dateX, double priceX, int numTicketX, String artistX, String cityX)
    {
        date = dateX;
        price = priceX;
        numTicket = numTicketX;
        artist = artistX;
        city = cityX;
    }


    //getters and setters


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    //generates reader-friendly output of all the information in a Show object
    public String toString()
    {
        String output = date + "\t$" + price + "\t\t\t\t" + numTicket + "\t\t\t\t" + artist;

        if(artist.length() <= 7)
        {
            output += "\t\t\t\t\t\t\t" + city;
        }
        else if (artist.length() <= 11)
            output += "\t\t\t\t\t\t" + city;

        else if(artist.length() < 16)
            output += "\t\t\t\t\t" + city;

        else
            output += "\t\t\t\t" + city;

        return output;
    }

    public void ArrayListToString(ArrayList<Show> showList)
    {
        String output = "Date\t\tPrice\t\t\t\tQty\t\t\t\tPerformer\t\t\t\t\t\tCity\n";
        output += "------------------------------------------------------------------------------------------------\n";

        for(int i = 0; i < showList.size(); i++)
        {
            output += showList.get(i).toString();
        }
        System.out.println(output);
    }
}
