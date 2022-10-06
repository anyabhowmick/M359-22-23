package Unit3_Booleans_IfStatements;

public class CompoundBooleanEx
{

    public static void main(String[] args) {
        String day = "Monday";
        int hw = 2;

        if (day.equals("saturday") || hw == 0) {
            System.out.println("yay video games");
        } else if (true) {
            System.out.println("ig ill have to wait :(");
        }


        if (day.equals("Monday") && hw <= 2) {
            System.out.println("yay coding club");
        } else {
            System.out.println("its a sad day");
        }


        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("Exercise");
        } else {
            if (hw == 0) {
                int chances = (int) (Math.random() * 10 + 1);
                if (chances > 2)
                    System.out.println("Exercise");
                else
                    System.out.println("no exercise");
            } else {
                int chances = (int) (Math.random() * 10 + 1);
                if (chances > 7)
                    System.out.println("Exercise");
                else
                    System.out.println("no exercise");
            }
        }


    }

}
