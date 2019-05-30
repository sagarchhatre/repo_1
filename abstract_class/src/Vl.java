
public class Vl extends BankLoan 
{
	double amount_bl;			//property of this child class
	
	public Vl(String cust_Name,double cust_Acc_No,double amount_bl)	//overloaede constructor
	{
		super(cust_Name, cust_Acc_No);
		this.amount_bl=amount_bl;
	}		
	
	public double getRateOfInterst() 		//a.m. implementation
	{
		return (amount_bl*.01);
	}			
}
//using SUPER keyword, every time it will get to the superclass constructor 1st