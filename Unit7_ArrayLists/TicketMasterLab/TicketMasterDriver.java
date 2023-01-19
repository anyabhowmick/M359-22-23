package Unit7_ArrayLists.TicketMasterLab;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;

public class TicketMasterDriver
{
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster ticketM1 = new TicketMaster();
        File myFile = new File("showData.txt");
        ticketM1.loadFile(myFile);
        System.out.println(ticketM1);
    }

}
