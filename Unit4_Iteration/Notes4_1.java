package Unit4_Iteration;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class Notes4_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean isDone = false;
        String reply = "";
        int sum = 0;
        int count = 0;


        while (!isDone) {

            System.out.println("Do you have a number to enter? (Y or N)");

            reply = input.nextLine();

            if (reply.equalsIgnoreCase("Y"))
            {
                System.out.println("What number?");
                int numReply = input.nextInt();

                //must also read new line
                input.nextLine();

                count++;
                sum += numReply;
            }
            else
            {
                double avg = sum / count;
                isDone = true;
                System.out.println("total sum:" + sum + "\n average:" + avg);
            }
        }


    }


}
