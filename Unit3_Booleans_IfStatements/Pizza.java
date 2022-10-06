package Unit3_Booleans_IfStatements;

public class Pizza
{
    String store;
    int inches;
    int numToppings;
    boolean isDeepDish;




    // constructors have no return type, not even void
    public Pizza(String store, int inches, int numToppings, boolean isDeepDish)
    {
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
        //this. means use value from THIS object that i just created
    }

    public Pizza(String storeX, int inchesX, boolean isDeepDishX)
    {
        numToppings = 0;
        store = storeX;
        inches = inchesX;
        isDeepDish = isDeepDishX;
    }




    public String getStore()
    {
        return store;
    }

    public void setStore(String newStore)
    {
        store = newStore;
    }



    public int getInches()
    {
        return inches;
    }

    public void setInches(int inches)
    {
        this.inches = inches;
    }

    public int getNumToppings()
    {
        return numToppings;
    }

    public void setNumToppings(int numToppings)
    {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish()
    {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish)
    {
        isDeepDish = deepDish;
    }



    //printInfo method
    public void printInfo()
    {
        System.out.println("store: " + store);
        System.out.println("inches: " + inches);
        System.out.println("deep dish? " + isDeepDish);
        System.out.println("toppings: " + numToppings);
    }



    public String toString()
    {
        String output = "store: " + store  ;
        output +="\n inches: " + inches;
        output += "\n deep dish? " + isDeepDish;
        output += "\n toppings: " + numToppings;
        return output;
    }

    public boolean equals(Pizza other)
    {
        if (this.inches == other.inches)
        {
            return true;
        }
        else
            return false;
    }


    public int compareTo(Pizza other)
    {
        if (this.inches < other.inches)
        {
            return -1;
        }
        else if (this.inches == other.inches)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

}

