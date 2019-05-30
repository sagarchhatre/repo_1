
public class Hl extends BankLoan 
{	
	double amount_hi;		// property of this child class

	public Hl(String cust_Name,double cust_Acc_No,double amount_hi)
	{
		super(cust_Name, cust_Acc_No);
		this.amount_hi=amount_hi;
	}		
	
	public double getRateOfInterst()		//a.m. implementation
	{
		return (amount_hi*.02);}
	}

// using SUPER keyword, every time it will get to the superclass constructor 1st