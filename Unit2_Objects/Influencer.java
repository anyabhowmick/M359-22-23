package Unit2_Objects;

public class Influencer
{
    private String platform;
    private String content;
    private int followers;
    private boolean verified;
    private String name;


    public Influencer(String nameX, String platformX, String contentX, int followersX, boolean verifiedX)
    {
        name = nameX;
        platform = platformX;
        content = contentX;
        followers = followersX;
        verified = verifiedX;
    }


    //name
    public String name()
    {
        return name;
    }

    public void setName(String nameX)
    {
        name = nameX;
    }



    //platform
    public String getPlatform()
    {
        return platform;
    }

    public void setPlatform(String platformX)
    {
        platform = platformX;
    }


    //content
    public String getContent()
    {
        return content;
    }

    public void setContent(String contentX)
    {
        content = contentX;
    }


    //followers
    public int getFollowers()
    {
        return followers;
    }

    public void setFollowers(int followersX)
    {
        followers = followersX;
    }


    //verified
    public boolean getBoolean()
    {
        return verified;
    }

    public void setBoolean(boolean verifiedX)
    {
        verified = verifiedX;
    }


    //summary

    public void printSummary()
    {
        System.out.println("Name: " + name);
        System.out.println("Platform Type:" + platform);
        System.out.println("Content: " + content);
        System.out.println("Follower Count: " + followers);
        System.out.println("Verified: " + verified);
    }
}
