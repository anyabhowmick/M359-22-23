package Unit4_Iteration;

public class Notes4_5_CodeAnalysis
{
    public static void main(String[] args)
    {
        outputBreak("test");
        //pyramid("name", 5);
        //pyramid2("name2", 5);
        eOLetterPyramid("FremdVikings");
    }

    public static void outputBreak(String title)
    {
        System.out.println();
        System.out.println();
        System.out.println(title);
        System.out.println();
    }

    public static void pyramid(String title, int num)
    {
        String output = "";
        for (int i = num; i > 0; i--)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    /*public static void pyramid2(String title, int num)
    {
        String output = "";

        for(int i = num; i >= 0; i--)
        {
            for(int j = 0; j < i; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }*/

    public static void eOLetterPyramid(String str) //print e/o letter of str
    {
        String output = "";
        boolean isDone = false;

        while(str.length() > 0)
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (i % 2 == 0)
                {
                    output += str.charAt(i);
                }

                System.out.println();
            }
        }
    }

}
