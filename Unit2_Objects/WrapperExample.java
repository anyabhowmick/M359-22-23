package Unit2_Objects;

public class WrapperExample
{
    public static void main(String[] args)
    {
        int x = 5;
        System.out.println(x);

        //create wrapped integer
        Integer wrappedInt = new Integer(7);
        Integer wrappedInt2 = 7;


        //java unboxing
        System.out.println(wrappedInt2);
        System.out.println(wrappedInt2.intValue());

        Double doubleVal = 7.5;
        System.out.println(doubleVal);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
