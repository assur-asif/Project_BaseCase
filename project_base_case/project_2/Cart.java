package project_2;

public class Cart 
{
    public void generate(String[] ProductNames, double[] Prices, int[] Quantity, double subtotal)
    {
        double discount;

        if(subtotal > 100) discount = 0.2;
        else if(subtotal > 50 && subtotal < 100) discount = 0.1;
        else discount = 0.05;

        double discountGot = subtotal * discount;
        double deliveryFee = (subtotal < 50) ? 10 : 0;

        double finalTotal = subtotal - discountGot + deliveryFee;


        System.out.println("\nGenerating Final Receipt Please Wait...");

         try { Thread.sleep(1000);} catch (InterruptedException e) {
            e.printStackTrace();}

        System.out.println();
        System.out.println("\n===== FINAL RECEIPT =====");
        System.out.println();

        for(int i = 0; i < ProductNames.length; i++)
        {
            System.out.println(
                "Item " + (i + 1) + ": " +
                ProductNames[i] + " | " +
                Quantity[i] + " x $" + Prices[i]+
                "= "+Quantity[i]*Prices[i]+" $"
            );
        }
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Subtotal        : $" + (int)subtotal);
        System.out.println("Discount Applied: $" + (int)discountGot);
        System.out.println("Delivery Fee    : $" + deliveryFee);
        System.out.println("Final Total     : $" + (int)finalTotal);
        System.out.println();
        System.out.println("====Happy Shopping with Aura-Gaming=====");
    }
}