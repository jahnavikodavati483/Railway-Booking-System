package controller;
import java.util.*;
import model.*;
public class reservation
{
    private Coach ac=new Coach();
    private Coach nonac=new Coach();
    private Coach seater=new Coach();
    ArrayList<ticket>tickets=new ArrayList<>();
    public void book(int id,String name,String type)
    {
        Coach c=getCoach(type);
          if(c==null)return;
         String status = c.book();
         if (status.equals("FULL"))
         {
            System.out.println("No seats available");
            return;
        }
        ticket t=new ticket(id, name, type, status);
        tickets.add(t);
        System.out.println("Booked! Status: " + status);
    }
    public void cancel(int id)
    {
        for(int i=0;i<tickets.size();i++)
        {
            if(tickets.get(i).getId()==id)
            {
                    Coach c=getCoach(tickets.get(i).getType());
                    c.cancel(tickets.get(i).getStatus());
                    tickets.remove(i);
                    System.out.println("Cancelled");
                    return;
            }
        }
         System.out.println("Ticket not found");
    }
     public void availability()
     {
        System.out.println("AC: " + ac.getSeats() + " Waiting: " + ac.getWaiting());
        System.out.println("NON_AC: " + nonac.getSeats() + " Waiting: " + nonac.getWaiting());
        System.out.println("SEATER: " + seater.getSeats() + " Waiting: " + seater.getWaiting());
    }

     public void chart()
     {
        for (ticket t : tickets)
        {
            System.out.println(
                t.getId() + " " +
                t.getName() + " " +
                t.getType() + " " +
                t.getStatus()
            );
        }
    }
    private Coach getCoach(String type) {
        if (type.equals("AC")) return ac;
        if (type.equals("NON_AC")) return nonac;
        return seater;
    }





    
}
