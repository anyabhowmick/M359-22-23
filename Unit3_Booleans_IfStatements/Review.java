package Unit3_Booleans_IfStatements;

public class Review
{
    private String reviewer;
    private String business;
    private int rating;

    public Review(String reviewer, String business, int rating)
    {
        this.reviewer = reviewer;
        this.business = business;
        this.rating = rating;
    }

    public String getReviewer()
    {
        return reviewer;
    }

    public void setReviewer(String reviewer)
    {
        this.reviewer = reviewer;
    }

    public String getBusiness()
    {
        return business;
    }

    public void setBusiness(String business)
    {
        this.business = business;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }


    public String toString()
    {
        String output = reviewer;
        output += ", " + business;
        output += ", " + rating;

        if (rating == 5)
        {
            output += "\n \t ** Highly Recommended";
        }
        if (rating ==1)
        {
            output += "\n \t ** Strongly Discouraged";
        }

        return output;
    }


}
