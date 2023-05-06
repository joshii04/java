public class Mug //same name as the file name 
{
    //in here everything is under the Mug file name

    private String bodyColour; //no access to change these
    private String handleColour;

    public Mug(String bodyColour, String handleColour) //this is the constructor
    {
        this.bodyColour = bodyColour;
        this.handleColour = handleColour;
    }

    public String getBodyColour() //need () to declare method class
    {
        return this.bodyColour;
    }

    public void setBodyColour(String newBcolour) //public allows for data to be passed through these methods
    {
        bodyColour = newBcolour;
    }

    public String getHandleColour()
    {
        return this.handleColour;
    }

    public void setHandleColour(String newHcoulour)
    {
       handleColour = newHcoulour;
    }

    // now to call the methods into a format class

    public String format()
    {
        String n = String.format("<>  %6s   <> || <>  %6s   <>", getBodyColour(), getHandleColour()); //s = space

        return n;

    }

}