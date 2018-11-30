package sample;

public class DVD extends Resource
{
    private String director;
    private int runTime;

    public DVD(String title, int year, String director, int runTime, int loanDuration)
    {
        super(title, year, loanDuration);
        this.director = director;
        this.runTime = runTime;
    }

    public String getDirector()
    {
        return director;
    }
    public void setDirector(String director)
    {
        this.director = director;
    }
    public int getRunTime()
    {
        return runTime;
    }
    public void setRunTime(int runTime)
    {
        this.runTime = runTime;
    }

    public String getAllExceptID()
    {
        return getTitle()+getYear()+getDirector()+getRunTime()+getLoanDuration();
    }
    public String getAll()
    {
        return getId()+getAllExceptID();
    }

    @Override
    public String toString()
    {
        return "DVD: "+getTitle()+" directed by "+director+" in "+getYear();
    }
}
