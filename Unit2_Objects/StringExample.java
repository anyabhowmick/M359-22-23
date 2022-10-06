package Unit2_Objects;

public class StringExample
{
    public static void main(String[] args)
    {
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";

        System.out.println(s1.toUpperCase()); //makes everything uppercase without storing it in new variable
        System.out.println(s1);             // notice s1 wasn't changed!  That is bc it is immutable

        System.out.println(s2.indexOf("u"));    // there are multiple occurrences of "u".  This returns loc of first
        System.out.println(s2.indexOf("x"));    // there are NO occurrences of "x".  This returns -1
        //gives the LOCATION (index, array) of these letters, -1 for x bc it doesnt even show up

        System.out.println(s1.substring(4));    // returns String from index 4 to the end
        System.out.println(s1.substring(2, 5)); // returns String of (5-2) or 3 char starting at index 2
        // gives letters from certain index (think array)

        System.out.println(s1.length());
        System.out.println(s2.length());
        //length of each string

        boolean isEqual = s1.equals("VACATION");          // false
        System.out.println(isEqual);
        // if s1 is "VACATION" which its not then print out the true/false value

        isEqual = s1.equals("Vacation");                  // true
        System.out.println(isEqual);
        // this time theyre equal

        isEqual = s1.toUpperCase().equals("VACATION");    // true
        System.out.println(isEqual);
        // this time we added the uppsercase thing so theyre equal so computer returns true

        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";

        System.out.println(s3.compareTo(s4));       // returns value < 0 because bat comes before bird in alphabet
        System.out.println(s3.compareTo(s3));       // returns 0 because they are equal
        System.out.println(s4.compareTo(s3));       // returns value > 0 because bat comes after bird in alphabet
        System.out.println(s5.compareTo(s3));       // returns value < 0 because all capital letters come before lowercase
        // letters in the ASCII alphabet
        // alphabetical order, Micky (capital), then bat, then bird
        // gives 1, 0, -1 values

        System.out.println("I love " + "M" + "3" + "5" + "9");  // Strings concatenate literally
        System.out.println("I love " + "M" + (3 + 5 + 9));      // Mathematically adds before concatenating
        // since it starts with string it adds letters as string, for l50 its in parenthesis tho so it adds as ints

        System.out.println(24 + 56 + " Days of School");        // Mathematically adds before concatenating
        System.out.println("Days of School: " + 24 + 56);       // Strings + numbers will ALWAYS concatenate
        // first one starts w numbers so it adds numbers
        // second one concatonates bc it starts w string 


    }
}
