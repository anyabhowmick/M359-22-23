package Unit7_ArrayLists.Examples;

import java.util.ArrayList;

public class Notes_7_6_Insertion_Sort
{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(6);
        nums.add(4);

        insertionSort(nums);
        System.out.println(nums);
    }

    public static void insertionSort(ArrayList<Integer> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            Integer curVal = list.get(i); //get the value we're comparing to all previous ones

            int pos = i;
            while(pos > 0 && list.get(pos-1) > curVal) //as long as there's no out of bounds exception
                //and the number before is bigger than what we have.
            {
                list.set(pos, list.get(pos-1));
                //replace the number that we just compared to and replace is with the previous one
                pos--;
                //subtract to go down the array
            }

            list.set(pos, curVal);

        }
    }

}
