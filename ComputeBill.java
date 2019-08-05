// Exercise 2 page 224

public class ComputeBill 
{
	// Variables and Constants
	private double price = 8.00;
	private double quantity;
	private double coupon = 4.00;	
	public double tax = 0.08;


	// Constructor that requires all three parameters
	public ComputeBill(double cost, double amount, double discount) 
	{
		price = cost;
		quantity = amount;
		coupon = discount;

	}

	// Constructor that requires only two parameters
	public ComputeBill(double cost, double amount)
	{
		price = cost;
		quantity = amount;
	}

	// Constructor that requires only one parameter
	public ComputeBill(double amount)
	{
		quantity = amount;
	}
	
	private double Calculation()
	{
		return ((price * quantity) - coupon) * tax;
	}

	// Method that provides output for data
	public void display()
	{
		System.out.print("The price of one book is $" + price + ". You ordered " + quantity + " book(s), the coupon amount is $" + coupon + ". The tax is " + tax + "%. \nYour total is $" + Calculation()); 
	}
}