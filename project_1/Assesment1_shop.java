package project_1;

import java.util.Scanner;

public class Assesment1_shop
{   
    //for capitalize product name
    public static String capitalize(String product)
    {
        String[] words=product.split(" ");
        String result="";
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()>0)
            {
                String first=words[i].substring(0,1).toUpperCase();
                String rest=words[i].substring(1);
                result +=first+rest+ " ";
            }
        }   
        return result.trim();
    }
    public static void main(String[] args)
    {
        //Discount Giving 15%

        final double discount=0.15;
        Scanner input=new Scanner(System.in);
           
        //Input Part
        System.out.println();
        System.out.println("---Welcome to the AuraGaming Shop---");
        System.out.println();
        System.out.print("Enter Product Name: ");
        String product=input.nextLine();
        product=capitalize(product);
        System.out.print("Enter Unit Price($): ");
        double price=input.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity=input.nextInt();
        System.out.println();
        double subtotal=price*quantity;
        double discount_got=subtotal*discount;
        int final_price=(int)(subtotal-(subtotal*discount));


        //Output Part
        
        System.out.println("--------Final Receipt--------");
        System.out.println();
        System.out.println("!! You got a discount of 15% !!");
        System.out.println();
        System.out.println("Iteam: ".concat(product));
        System.out.println("Subtotal: "+ subtotal+" $");
        System.out.printf("Discount Applied: %.2f $\n",discount_got);
        System.out.println("Total (Rounded Down): "+ final_price+ " $");
        System.out.println();
        System.out.println("---Happy Shopping With Aura-Gaming---");
        System.out.println();

    }
}