package Unit3_Booleans_IfStatements.Lab;


public class Chevy
{
    private int year, mileage;
    private double fuelEfficiency, basePrice, upgradePrice, grandTotal;
    private String model, color;
    private boolean luxPack, fourWDPack, sportsPack;

    private final String VEHICLE = "Chevrolet";
    private final double TAX_RATE = 1.122;
    private final double LUX_INCREASE = .2;
    private final double FOUR_WD_INCREASE = 3500;
    private final double SPORTS_INCREASE = .15;
    private final double FUEL_EFF_DEDUCT = .2;


    public Chevy(int year, int mileage, double fuelEfficiency,
                 double basePrice, String model, String color,
                 boolean luxPack, boolean fourWDPack, boolean sportsPack)
    {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.model = model;
        this.color = color;
        this.luxPack = luxPack;
        this.fourWDPack = fourWDPack;
        this.sportsPack = sportsPack;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return mileage;
    }

    public void setMiles(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getBase_price() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPriceWithUpgrades() {
        this.calcPrice();
        return upgradePrice;
    }

    public void setPriceWithUpgrades(double upgradePrice) {
        this.upgradePrice = upgradePrice;
    }

    public double getGrandTotal() {
        this.calcPrice();
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasLuxuryPkg() {
        return luxPack;
    }

    public void setHasLuxuryPkg(boolean luxPack) {
        this.luxPack = luxPack;
    }

    public boolean isHas4WDPkg() {
        return fourWDPack;
    }

    public void setHas4WDPkg(boolean fourWDPack) {
        this.fourWDPack = fourWDPack;
    }

    public boolean isHasSportsPack() {
        return sportsPack;
    }

    public void setHasSportsPack(boolean sportsPack) {
        this.sportsPack = sportsPack;
    }

    public Chevy()
    {
        year = 2021;
        color = "white";
        model = "trax";
        mileage = 0;
        basePrice = 16000;
        fuelEfficiency = 35;
        luxPack = false;
        sportsPack = false;
        fourWDPack = false;
    }

    public int compareTo(Chevy other)
    {
        if (this.mileage < other.mileage)
        {
            return -1;
        }
        else if (this.mileage > other.mileage)
        {
            return 1;
        }
        else
            return 0;
    }

    public boolean equals(Chevy other)
    {
        if (this.model.equals(other.model) && this.color.equals(other.color) &&
                ((this.mileage<200 && other.mileage<200) || (this.mileage>200 && other.mileage>200)))
            return true;
        else
            return false;
    }

    public String toString()
    {
        String output = "*****";
        output += "*****";
        output += "*****";
        output += "*****";
        output += "*****";
        output += "*****";
        output += "*****";
        output += "*****";
        output += "*****";
        output += "***** \n";

        output += year + " Chevrolet " + model + " (" + color + ")\n";
        output += "\tBASE PRICE: \t \t \t$" + basePrice + "\n";
        output += "\tMILES: \t \t" + mileage + "\n";
        output += "\tFUEL EFFICIENCY: \t \t" + fuelEfficiency + " mpg" + "\n";
        output += "\tPACKAGES: " + "\n";

        if (luxPack == true)
            output += "\t \t - Luxury Package" + "\n";

        if (sportsPack == true)
            output += "\t \t - Sports Package" + "\n";

        if (fourWDPack == true)
            output += "\t \t - 4WDPackage" + "\n";

        if (luxPack == false && sportsPack == false && fourWDPack == false)
        {
            output += "\t - None \n \n";
        }

        output += "\tPRINCE WITH UPGRADES: \t \t $" + "\n"; //FINISH
        output += "\t FINAL PRICE WITH TAX: \t \t $"; //finish

        return output;
    }

    public void calcPrice()
    {
        upgradePrice = basePrice;
        if (luxPack == true)
        {
            upgradePrice += basePrice * LUX_INCREASE;
        }

        if (sportsPack == true)
        {
            upgradePrice += SPORTS_INCREASE * basePrice;
            fuelEfficiency = .8 * fuelEfficiency;
        }

        if (fourWDPack == true)
        {
            upgradePrice += 3500;
        }

        grandTotal = TAX_RATE * upgradePrice ;
    }







}




