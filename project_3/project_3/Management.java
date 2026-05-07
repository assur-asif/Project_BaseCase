package project_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Management 
{
   protected ArrayList<Order>valid=new ArrayList<>();
   protected ArrayList<String>invalid= new ArrayList<>();
   protected Scanner sc=new Scanner(System.in);

    public void takeorders()
    {
        System.out.print("How many orders: ");
        int num=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<num;i++)
        {
            try
            {
                System.out.println("Order no. "+ (i+1));
                System.out.print("Enter Product name: ");
                String product=sc.nextLine();

                System.out.print("Enter Unit Price: ");
                double price=sc.nextDouble();

                System.out.print("Enter Quantity: ");
                int quantity=sc.nextInt();

                sc.nextLine();

                Order orders=new Order(product, price, quantity);
                valid.add(orders);
                 
            }
            catch(Exception e)
            {
                System.out.println();
                System.out.println("---Invalid Order Attempt---");

                invalid.add("Order " + (i+1) + " failed:\n" + e.getMessage());
            
                System.out.println();
                //sc.nextLine();
            }
        }
    }
    public void print()
        {
            // print valid orders
            if(!valid.isEmpty())
                {
                System.out.println("----Valid Orders----");
                
                for(Order o: valid)
                {
                    System.out.println(o);
                }
                System.out.println();
            }
        
            // print erros orders if any

            if(!invalid.isEmpty())
            {
                System.out.println("---Invalid Orders----");
                for(String s: invalid)
                {
                    System.out.println(s);
                }
            }
        }
}
