
public class Pl extends BankLoan 
{
	public double amount_pi;			//property this child class
	
	public Pl(String cust_Name,double cust_Acc_No,double amount_pi)
	{
		super(cust_Name, cust_Acc_No);
		this.amount_pi=amount_pi;
	}
	
	public double getRateOfInterst() 	//a.m. implementation
	{
		return (amount_pi*.15);
	}
}
//using SUPER keyword, every time it will get to the superclass constructor 1st

