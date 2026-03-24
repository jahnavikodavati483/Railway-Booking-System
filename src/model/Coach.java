package model;
public class Coach
{
    private int seats=60;
    private int waiting=0;
    public String book()
    {
        if(seats>0)
        {
            seats--;
            return "CONFIRMED";
        }
        else if(waiting<10)
        {
            waiting++;
            return "WAITING";
        }
        else
        {
            return "FULL";
        }
    }
    public void cancel(String status)
    {
        if(status.equals("CONFIRMED"))
        {
            seats++;
        }
        else if(status.equals("WAITING"))
        {
         waiting--;
        }
    }
    public int getSeats() {
        return seats;
    }

    public int getWaiting() {
        return waiting;
    }
    
}
