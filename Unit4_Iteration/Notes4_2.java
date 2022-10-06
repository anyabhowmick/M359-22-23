package Unit4_Iteration;

public class Notes4_2
{
    public static void main(String[] args)
    {
        String output = "";
        //print even numbers from 0-20
        for (int i = 0; i<22; i+=2)
        {
            output += i + " ";
        }
        System.out.println(output + "\n");

        String output5 = "";
        for (int i = 5; i<101; i+=5)
        {
            output5 += i + " ";
        }
        System.out.println(output5 + "\n");

        String str = "giuehdigeth";
        String outputStr = "";

        for (int i = 0; i < str.length(); i++)
        {
            outputStr += str.substring(i, i+1);
            outputStr += " ";
        }
        System.out.println(outputStr);



        for (int i = str.length() - 1; i >= 0; i--)
        {
            System.out.print(str.substring(i, i+1));
        }

    }


}
