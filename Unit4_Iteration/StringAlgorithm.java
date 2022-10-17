package Unit4_Iteration;

public class StringAlgorithm
{
    public static void main(String[] args)
    {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for(int i = 0; i < mySchool.length(); i +=2)
        {
            System.out.print(mySchool.charAt(i));
        }

        System.out.println("\n");

        // print the String mySchool in reverse (all characters on the same line)

        for(int i = mySchool.length() - 1; i >= 0; i--)
        {
            System.out.print(mySchool.charAt(i));
        }



         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */

        System.out.println("\n");

        String animal = "ergsrjgdrh";

        for(int i = 0; i < animal.length(); i++)
        {
            System.out.println(animal.substring(0, i+1));
        }






        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        // Print the amount of times the word "little" appears within phrase?

        boolean isDone = false;
        int count = 0;
        int index = -1;
        int location = -1; //where "little" is

        while(index < phrase.length())
        {
            phrase = phrase.substring(index + 1);
            location = phrase.indexOf("little");

            if(location != -1)
            {
                count++;
                index = location;
            }
            else
                index++;
        }

        System.out.println(count);


        // create a new String, or modify the existing String, that removes
        // the word "little" entirely

        phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";


         index = -1;
         location = -1; //where "little" is

        /* while(index < phrase.length())
        {
            phrase = phrase.substring(index + 1);
            location = phrase.indexOf("little");
            String removed = phrase.substring(0, location) + phrase.substring(location+6);



            if(location != -1)
            {
                index = location;

            }
            else
                index++;
        }

        System.out.println(count);

        */

        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"


        String output = "";

        phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";


        index = -1;
        location = -1; //where "little" is
        String removed = "";
        while(!isDone)
        {
            //phrase = phrase.substring(index + 1);
            location = phrase.indexOf("little");




            if(location != -1)
            {
                index = location;
                removed = phrase.substring(0, location) +  " big " + phrase.substring(location+6);
            }
            else
                isDone = true;
        }

        System.out.println(removed);




    }

}
