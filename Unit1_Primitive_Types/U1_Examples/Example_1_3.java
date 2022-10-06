package Unit1_Primitive_Types.U1_Examples;

public class Example_1_3
{
    public static void main(String[] args)
    {
        System.out.println("hello world");
        int guestCount = 5, pizzaCount = 4;
        //double pizzaCount = 4.0;
        double avgPizzas = (double)pizzaCount/guestCount;
        System.out.println(avgPizzas);

        //casting the pizzaCount lets u pretend its a double when it was defined as an integer

        guestCount += 2;
        pizzaCount += 5;
        avgPizzas =  (double)pizzaCount/guestCount;
        System.out.println("Guests can now have " + avgPizzas + "th of a pizza.");

        int num = 237985274;
        int numOnes = num % 10;
        System.out.println(numOnes + " is the ones digit in " + num);

        int numTens = num % 100;
        numTens = numTens / 10;
        System.out.println(numTens + " is the tens digit in " + num);
    }
}
