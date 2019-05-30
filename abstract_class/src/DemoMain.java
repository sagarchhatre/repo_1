public class DemoMain
{
	public static void main(String[] args) 
	{
		BankLoan bl;		         // reference variable creation whose data_type is className 
									//--> & (object creation of abstract class is invalid)
		Vl k=new Vl("sam",16000,150000);
		//k.getRateOfInterst();
		System.out.println(" The rate of interest for vehicle_loan is  "+ k.getRateOfInterst());
	//=============================================================================
		Hl h=new Hl( "olly", 12541166 , 65585866);
		h.getRateOfInterst();
		System.out.println(" The rate of interest for home_loan is  "+ h.getRateOfInterst());
	//=============================================================================
		Pl p=new Pl( "adam", 12541188 , 65585888);
		p.getRateOfInterst();
		System.out.println(" The rate of interest for personal_loan is  "+ p.getRateOfInterst());  	
	}

}
	

