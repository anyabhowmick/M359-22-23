package Unit3_Booleans_IfStatements;

public class PizzaDriver
{
    public static void main(String[] args)
    {
        Pizza p1 = new Pizza("Domino's", 14, 2, true);
        Pizza p2 = new Pizza("Pizza Hut", 12, false);

        p1.printInfo();
        System.out.println(p1.toString());

        System.out.println(p1.equals(p2));

        System.out.println(p1.compareTo(p2));
    }
}
