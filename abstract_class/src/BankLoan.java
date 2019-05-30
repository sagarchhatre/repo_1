public abstract class BankLoan 					//abstract class
{	
	private String cust_Name;			   		//private property
	private double cust_Acc_No;					//private property
	
	public BankLoan(String name,double acc)		//overloaded constructor
	{	
		System.out.println("****************************************************************");
		cust_Name=name;
		cust_Acc_No=acc;
	}
	public abstract double getRateOfInterst();	//abstract method
}





	