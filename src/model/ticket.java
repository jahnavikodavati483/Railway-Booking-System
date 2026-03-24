package model;
public class ticket
{
    private int id;
    private String name;
    private String type;
    private String status;
    public ticket(int id,String name,String type,String status) 
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getType() 
    {
        return type;
    }
    public String getStatus() 
    {
        return status;
    }   
}
