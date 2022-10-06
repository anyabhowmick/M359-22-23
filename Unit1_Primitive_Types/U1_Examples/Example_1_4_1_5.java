package Unit1_Primitive_Types.U1_Examples;

public class Example_1_4_1_5
{
    public static void main(String[] args)
    {
        double width = 12.4539;
        int widthInt = (int)width;
        System.out.println(widthInt);

        int pop = 2487348;
        int popRounded = (pop / 100) * 100;
        System.out.println(popRounded);

        double height = 7.89;
        height += .5;
        int heightInt = (int)height;
        System.out.println(heightInt);

        int num = 9857;
        int numRounded = num + 50 ;
        numRounded = (numRounded / 10) * 10;
        System.out.println(numRounded);
    }
}
