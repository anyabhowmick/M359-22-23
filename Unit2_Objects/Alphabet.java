package Unit2_Objects;

public class Alphabet
{

    private String letters;

    //person puts in the alphabet so its not just english bc thats what
    // i said it was
    private Alphabet (String alphaLetters)
    {
        letters = alphaLetters;
    }


    //method (not constructor where im setting the scene) to do stuff
    // specifically giving the spot the char is in
    public int Alphabet(String letter)
    {
        letter = letter.toLowerCase();
        int num = letters.indexOf(letter);
        num += 1;
        return num;
    }


    public String randomLetter()
    {
        int max = letters.length();
        //creating max in case its not english again
        int randNum = (int)(Math.random()*max) + 0;
        String randLetter = letters.substring(randNum, randNum + 1);
        return randLetter;
    }






}
