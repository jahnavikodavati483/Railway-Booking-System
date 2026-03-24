package view;
import controller.*;
import java.util.*;
public class TrainView
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            reservation rc=new reservation();
            while(true)
            {
              System.out.println("\n1.Book 2.Cancel 3.Availability 4.Chart 5.Exit");
              int n = sc.nextInt();
            if(n==1)
            {
                 System.out.print("Enter ID Name Type(AC/NON_AC/SEATER): ");
                int id = sc.nextInt();
                String name = sc.next();
                String type = sc.next();
                rc.book(id, name, type);
            }
            else if (n == 2) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                rc.cancel(id);
            } 
            else if (n == 3) {
                rc.availability();
            } 
            else if (n== 4) {
                rc.chart();
            } 
            else {
                break;
            }
        }
      }
    }
}
