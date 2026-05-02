package project_2;

import java.util.Scanner;

public class Shop 
{
    Scanner sc = new Scanner(System.in);

    public void start()
    {
        Intro.showIntro();
        takeInputs();
    }
    
    private void takeInputs()
    {   
        try { Thread.sleep(600);} catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.print("How many products do you want to purchase?(Max 5) ->  ");
        int num = sc.nextInt();

        sc.nextLine();

        String[] productNames = new String[num];
        double[] prices = new double[num];
        int[] quantities = new int[num];

        double itemTotal = 0;
        double subtotal = 0;
    

        for(int i = 0; i < num; i++)
        {
            System.out.printf("\nEnter Product %d Name: ", i + 1);
            productNames[i] = sc.nextLine();
             
            System.out.print("Enter Price: $");
            prices[i] = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            quantities[i] = sc.nextInt();

            sc.nextLine();

            if(prices[i] <= 0 || quantities[i] <= 0)
            {
                System.out.println("Invalid Choices!! Try Again...");
                i--;
                continue;
            }

            itemTotal += prices[i] * quantities[i];
        }

          subtotal += itemTotal;

          Cart cart = new Cart();
          
          cart.generate(productNames, prices, quantities, subtotal);
    }
}