/* Billing main() method for Billing Frame, exercise 2 page 226

	Filename: Billing.java
	Author: Amit
	Date: 8/1/19 

	Application that tests overloaded methods for billing */


public class Billing 
{
	public static void main(String[] args)
	{
		ComputeBill first = new ComputeBill(8);
		ComputeBill second = new ComputeBill(9.00, 2);
		ComputeBill third = new ComputeBill(10.00, 5, 12.00);

		first.display();
		System.out.println("");
		second.display();
		System.out.println("");
		third.display();
	}
}