package Unit2_Objects;

import java.util.Scanner;

public class WS5_Example
{
    public static void main(String[] args)
    {
        /*
         * Name: Anya
         * Teacher: Moon
         * Class: Period 5
         *
         *  System.out.println("What is your name?");
               String name = input.nextLine();
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Give an X1 number");
        int x1 = input.nextInt();

        System.out.println("Give an X2 number");
        int x2 = input.nextInt();

        System.out.println("Give a Y1 number");
        int y1 = input.nextInt();

        System.out.println("Give a Y2 number");
        int y2 = input.nextInt();

        double xDiff = x1 - x2;
        double xSqr = Math.pow( xDiff,  2);

        double ySqr = Math.pow( (y1-y2),  2);
        double distance = Math.sqrt(xSqr + ySqr);

        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
        



        //Part 2
        input = new Scanner(System.in);
        System.out.println("Give me a max");
        int max = input.nextInt();

        System.out.println("Give min");
        int min = input.nextInt();

        int range = max - min + 1;

        double rnd = Math.random();
        int randomNum = (int)(rnd * range) + min;

        System.out.println("A random number between " + min + " and " + max + "is " + randomNum);



        //Part 3


        double abs = Math.abs(max - min);
        double pow = Math.pow(max, min);
        int newMin = Math.min(randomNum, randomNum+1);
        int newMax = Math.max(randomNum, randomNum-1);
        //int newMin = min();
        System.out.println("" + newMax + " " + newMin);

    }
}

