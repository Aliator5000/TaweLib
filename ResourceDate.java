package sample;

import java.util.Date;

public class ResourceDate
{
    private Resource resource;
    private Date date;

    public ResourceDate(Resource resource, Date date)
    {
        this.resource = resource;
        this.date = date;
    }

    public Resource getResource()
    {
        return resource;
    }
    public void setResource(Resource resource)
    {
        this.resource = resource;
    }
    public Date getDate()
    {
        return date;
    }
    public void setDate(Date date)
    {
        this.date = date;
    }
}
