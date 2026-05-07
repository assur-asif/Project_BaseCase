package project_3;

public class Order
{
    private String ProductName;
    private double UnitPrice;
    private int Quantity;
    
    public Order(String ProductName, double UnitPrice, int Quantity) throws Exception
    {
        this.ProductName=ProductName; 

        String Errors = "";
        try { set(UnitPrice);} catch(Exception e)
        {
            Errors += e.getMessage() + "\n";
        }

        try {set(Quantity);} catch(Exception e)
        {
            Errors += e.getMessage();
        }

        if(!Errors.isEmpty())
        {
            throw new Exception(Errors);
        } 
    }
    public void set(double UnitPrice) throws Exception
    {
        if(UnitPrice<=0 )
        {
            throw new Exception("Price Can't be negative or Zero");
        }  
         this.UnitPrice=UnitPrice; 
    }
    public void set(int Quantity) throws Exception
    {
        if(Quantity<=0)
        {
            throw new Exception("Quantity Can't be negative or Zero");
        }
         this.Quantity=Quantity; 
    }
    public double getItemTotal()
    {
        return (int)UnitPrice*Quantity;
    }

    @Override
    public String toString()
    {
        return ProductName + "-"+ Quantity + " pcs "+String.format("%.2f",UnitPrice)+ " = "+String.format("%.2f",getItemTotal());
    }
}