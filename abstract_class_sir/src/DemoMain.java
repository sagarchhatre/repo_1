import com.aspbtet.officeauto.OfficeAutomation;

public class DemoMain 
{
	public static void main(String[] args) 
	{
		OfficeAutomation oa = new OfficeAutomation("abc","123",190);
			
		if(oa.getResults())							// checking for results
		 System.out.println("candidate passed");
		else
		 System.out.println("candidate failed");	
	}

}
